package systempackage;

import java.util.Scanner;

public class systemMain {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Initialize variable to store total expenses
        double totalExpenses = 0.00;

        // Continuously prompt the user for expense input until they choose to quit
        while (true) {
            // Prompt the user to enter an expense amount without a newline character
            System.out.print("Enter expense amount (or 'quit' to exit): ");
            // Read the user's input
            String input = scanner.nextLine();

            // Check if the user wants to quit
            if (input.equalsIgnoreCase("quit")) {
                break; // Exit the loop if user enters 'quit'
            }

            try {
                // Attempt to parse the input as a double (expense amount)
                double amount = Double.parseDouble(input);
                // Add the expense amount to the total expenses
                totalExpenses += amount;
                // Print a message confirming the addition of the expense
                System.out.println("Expense added: Php " + amount);
            } catch (NumberFormatException e) {
                // Handle the case where the input cannot be parsed as a double
                System.out.println("Invalid input. Please enter a valid number or 'quit'.");
            }
        }

        // Print the total expenses accumulated during the session
        System.out.println("Total expenses: Php " + totalExpenses);
        // Print a goodbye message
        System.out.println("Thank You!");

        // Close the Scanner to release system resources
        scanner.close();
    }
}