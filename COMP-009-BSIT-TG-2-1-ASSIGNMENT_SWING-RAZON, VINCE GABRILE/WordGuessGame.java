package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGuessGame extends JFrame {
    private List<String> words;
    private Random random;
    private String currentWord;
    private char[] displayedWord;
    private JTextField inputField;
    private JLabel wordLabel;
    private JLabel messageLabel;

    public WordGuessGame(List<String> words) {
        this.words = words;
        this.random = new Random();
        initUI();
        startNewGame();
    }

    private void initUI() {
        setTitle("Word Guess Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        wordLabel = new JLabel("", SwingConstants.CENTER);
        wordLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        add(wordLabel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Enter a letter: "));

        inputField = new JTextField(1);
        inputPanel.add(inputField);

        JButton guessButton = new JButton("Guess");
        guessButton.addActionListener(new GuessButtonListener());
        inputPanel.add(guessButton);

        add(inputPanel, BorderLayout.CENTER);

        messageLabel = new JLabel(" ", SwingConstants.CENTER);
        add(messageLabel, BorderLayout.SOUTH);
    }

    private void startNewGame() {
        currentWord = words.get(random.nextInt(words.size()));
        displayedWord = new char[currentWord.length()];
        for (int i = 0; i < displayedWord.length; i++) {
            displayedWord[i] = (random.nextBoolean()) ? '_' : currentWord.charAt(i);
        }
        updateWordLabel();
    }

    private void updateWordLabel() {
        wordLabel.setText(new String(displayedWord));
    }

    private void processGuess(char guess) {
        boolean found = false;
        for (int i = 0; i < currentWord.length(); i++) {
            if (currentWord.charAt(i) == guess && displayedWord[i] == '_') {
                displayedWord[i] = guess;
                found = true;
            }
        }
        if (found) {
            updateWordLabel();
            if (new String(displayedWord).equals(currentWord)) {
                messageLabel.setText("Congratulations! You've guessed the word.");
                startNewGame();
            } else {
                messageLabel.setText("Correct! Keep guessing.");
            }
        } else {
            messageLabel.setText("Wrong letter! Try again.");
        }
        inputField.setText("");
    }

    private class GuessButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = inputField.getText().trim().toLowerCase();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                processGuess(input.charAt(0));
            } else {
                messageLabel.setText("Please enter a single letter.");
            }
        }
    }

    public static List<String> loadWordsFromCSV(String filePath) {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim().toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("Failed to load words from the dictionary.");
            e.printStackTrace();
        }
        return words;
    }

    public static void main(String[] args) {
        List<String> words = loadWordsFromCSV("src/words.csv");
        if (words.isEmpty()) {
            System.out.println("No words loaded from CSV file.");
            return;
        }
        SwingUtilities.invokeLater(() -> {
            WordGuessGame game = new WordGuessGame(words);
            game.setVisible(true);
        });
    }
}
