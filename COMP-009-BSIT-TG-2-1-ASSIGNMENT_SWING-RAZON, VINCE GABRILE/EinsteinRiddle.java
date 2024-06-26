package practice;

import javax.swing.*;
import java.awt.*;

public class EinsteinRiddle extends JFrame {

    public EinsteinRiddle() {
        setTitle("Who Owns the Fish?");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(6, 6, 10, 10));
        mainPanel.setBackground(new Color(255, 239, 186)); // Light yellow background

        mainPanel.add(new JLabel(""));
        for (int i = 0; i < 5; i++) {
            JLabel houseLabel = new JLabel("House " + (i + 1), JLabel.CENTER);
            houseLabel.setFont(new Font("Arial", Font.BOLD, 14));
            houseLabel.setForeground(Color.WHITE);
            houseLabel.setBackground(new Color(75, 0, 130)); // Indigo background
            houseLabel.setOpaque(true);
            mainPanel.add(houseLabel);
        }

        addAttributeRow(mainPanel, "Nationality", new String[]{"American", "Indian", "Filipino", "German", "Korean"});
        addAttributeRow(mainPanel, "Color", new String[]{"Yellow", "Blue", "Red", "Green", "White"});
        addAttributeRow(mainPanel, "Drinks", new String[]{"Water", "Tea", "Milk", "Coffee", "Rootbeer"});
        addAttributeRow(mainPanel, "Device", new String[]{"Oppo", "Desktop", "Laptop", "Tablet", "iPhone"});
        addAttributeRow(mainPanel, "Pets", new String[]{"Cat", "Horses", "Birds", "Fish", "Dog"});

        add(mainPanel, BorderLayout.CENTER);

        JLabel answerLabel = new JLabel("Answer: The German owns the Fish", JLabel.CENTER);
        answerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        answerLabel.setForeground(new Color(34, 139, 34)); // Forest green color
        add(answerLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addAttributeRow(JPanel panel, String attribute, String[] values) {
        JLabel attributeLabel = new JLabel(attribute, JLabel.CENTER);
        attributeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        attributeLabel.setForeground(new Color(75, 0, 130)); // Indigo color
        panel.add(attributeLabel);
        for (String value : values) {
            JTextField textField = new JTextField(value);
            textField.setEditable(false);
            textField.setBorder(BorderFactory.createEmptyBorder());
            textField.setBackground(new Color(255, 239, 186)); // Light yellow background
            textField.setForeground(new Color(75, 0, 130)); // Indigo text color
            textField.setFont(new Font("Arial", Font.PLAIN, 14));
            panel.add(textField);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EinsteinRiddle::new);
    }
}
