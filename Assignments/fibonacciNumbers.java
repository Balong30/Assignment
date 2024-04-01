package secondsemassignment;

import java.util.Scanner;


public class fibonacciNumbers extends fibonacciWords {
    // Display Fibonacci series in numbers
    void displayFibonacciNumbers() {
        int firstElement = 0, secondElement = 1, fibonacciSequence = 0, counter = 0, numberOfElements;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Elements: ");
        numberOfElements = input.nextInt();
        
        // Output zero if the number of elements is not zero
        if (numberOfElements > 0) {
            System.out.print(firstElement);
        }

        if (numberOfElements > 1) {
            System.out.print(", " + secondElement);
        }

        while (counter < numberOfElements - 2) {
            fibonacciSequence = firstElement + secondElement;
            System.out.print(", " + fibonacciSequence);
            firstElement = secondElement;
            secondElement = fibonacciSequence;
            counter++;
        }
        input.close();
    }
}