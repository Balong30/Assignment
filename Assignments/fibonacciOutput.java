package secondsemassignment;

import java.util.Scanner;

public class fibonacciOutput {

    public static void main(String[] args) {
        int choice;
        fibonacciWords fibonacciWords = new fibonacciWords();
        fibonacciNumbers fibonacciNumbers = new fibonacciNumbers();

        Scanner input = new Scanner(System.in);
        System.out.println("1 - Numbers ");
        System.out.println("2 - Words ");
        System.out.print("Enter choice how would you like to print your Fibonacci series: ");
        choice = input.nextInt();

        if (choice == 1) {
            fibonacciNumbers.displayFibonacciNumbers();
        } else if (choice == 2) {
            fibonacciWords.displayFibonacciWords();
        } else {
            System.out.println("Invalid choice.");
        }
        input.close();
    }
}
