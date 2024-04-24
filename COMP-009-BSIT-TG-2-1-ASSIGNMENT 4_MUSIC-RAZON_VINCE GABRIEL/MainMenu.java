package assignment;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song[] songs = new Song[3]; // Create an array to hold the songs

        try {
            songs[0] = new Song1();
            songs[1] = new Song2();
            songs[2] = new Song3();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        String response = "";

        while(!response.equals("Q")) {
            System.out.println("Main Menu:");
            for (int i = 0; i < songs.length; i++) {
                System.out.println((i + 1) + " - Play Song " + (i + 1));
            }
            System.out.println("Q- Quit");
            System.out.println("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            if (response.equals("Q")) {
                System.out.println("Adios!");
                break;
            }

            int choice = Integer.parseInt(response) - 1;
            if (choice >= 0 && choice < songs.length) {
                boolean songPlaying = true;
                while (songPlaying) {
                    System.out.println("Song " + (choice + 1) + " Options:");
                    System.out.println("1 - Play");
                    System.out.println("2 - Pause");
                    System.out.println("3 - Reset");
                    System.out.println("4 - Back to Song Choices");
                    System.out.println("Enter your choice: ");

                    response = scanner.next();
                    switch (response) {
                        case "1":
                            songs[choice].play();
                            break;
                        case "2":
                            songs[choice].stop();
                            break;
                        case "3":
                            songs[choice].play();
                            break;
                        case "4":
                            songPlaying = false;
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }

        // Closing all songs
        for (Song song : songs) {
            if (song != null) {
                song.close();
            }
        }
    }
}

