package secondsemassignment;

import java.util.Scanner;


public class fibonacciWords extends numberWords {
    // Display Fibonacci series in words
    void displayFibonacciWords() {
        int firstElement = 0, secondElement = 1, fibonacciSequence = 0, counter = 0, numberOfElements;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Elements: ");
        numberOfElements = input.nextInt();

        // Output zero if the number of elements is greater than zero
        if (numberOfElements > 0) {
            System.out.print(numberWords.convertToWords(0));
            if (numberOfElements > 1) {
                System.out.print(", ");
            }
        }

        // Output one if the number of elements is greater than one
        if (numberOfElements > 1) {
            System.out.print(numberWords.convertToWords(1));
            if (numberOfElements > 2) {
                System.out.print(", ");
            }
        }

        while (counter < numberOfElements - 2) {
            fibonacciSequence = firstElement + secondElement;
            System.out.print(numberWords.convertToWords(fibonacciSequence));
            if (counter < numberOfElements - 3) {
                System.out.print(", ");
            }
            firstElement = secondElement;
            secondElement = fibonacciSequence;
            counter++;
        }
        input.close();
    }
}