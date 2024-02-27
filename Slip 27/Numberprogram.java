// Import the Scanner class for user input
import java.util.Scanner;

// Create a custom exception class for out of range numbers
class OutOfRangeException extends Exception {
    // Constructor that takes a message as an argument
    public OutOfRangeException(String message) {
        // Call the superclass constructor with the message
        super(message);
    }
}

// Create a class that contains the main method and a static method
public class NumberProgram {

    // A static method to display the factors of a number
    public static void displayFactors(int number) {
        // Print the number
        System.out.println("The number is: " + number);
        // Print the factors
        System.out.print("The factors are: ");
        // Loop from 1 to the number
        for (int i = 1; i <= number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                // Print i as a factor
                System.out.print(i + " ");
            }
        }
        // Print a new line
        System.out.println();
    }

    // The main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        // Read the user input as an integer
        int num = sc.nextInt();
        // Close the scanner object
        sc.close();
        // Try to check the number and display its factors
        try {
            // Check if the number is greater than 1000
            if (num > 1000) {
                // Throw a custom exception with a message
                throw new OutOfRangeException("Number is out of range");
            } else {
                // Call the static method to display the factors
                displayFactors(num);
            }
        } catch (OutOfRangeException e) {
            // Catch the custom exception and print its message
            System.out.println(e.getMessage());
        }
    }
}
