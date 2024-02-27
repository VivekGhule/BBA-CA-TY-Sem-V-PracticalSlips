// Import the Scanner class for user input
import java.util.Scanner;

// Create a custom exception class for zero number
class ZeroNumberException extends Exception {
    // Constructor that takes a message as an argument
    public ZeroNumberException(String message) {
        // Call the superclass constructor with the message
        super(message);
    }
}

// Create a class that contains the main method and a static method
public class NumberProgram {

    // A static method to check whether a number is palindrome or not
    public static boolean isPalindrome(int number) {
        // Initialize a variable to store the reversed number
        int reversed = 0;
        // Store the original number in a temporary variable
        int temp = number;
        // Use a loop to reverse the number
        while (temp > 0) {
            // Get the last digit of the number
            int digit = temp % 10;
            // Add the digit to the reversed number
            reversed = reversed * 10 + digit;
            // Remove the last digit of the number
            temp = temp / 10;
        }
        // Return true if the original and reversed numbers are equal
        return number == reversed;
    }

    // The main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        // Try to read the user input and check the conditions
        try {
            // Read the user input as an integer
            int num = sc.nextInt();
            // Check if the number is zero
            if (num == 0) {
                // Throw a custom exception with a message
                throw new ZeroNumberException("Number is zero");
            } else {
                // Check if the number is palindrome or not
                boolean palindrome = isPalindrome(num);
                // Print the result
                if (palindrome) {
                    System.out.println("The number is palindrome");
                } else {
                    System.out.println("The number is not palindrome");
                }
            }
        } catch (ZeroNumberException e) {
            // Catch the custom exception and print its message
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Catch any other exception and print an error message
            System.out.println("Number is invalid");
        } finally {
            // Close the scanner object
            sc.close();
        }
    }
}
