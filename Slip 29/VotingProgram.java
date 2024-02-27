// Import the Scanner class for user input
import java.util.Scanner;

// Create a custom exception class for invalid age
class InvalidAgeException extends Exception {
    // Constructor that takes a message as an argument
    public InvalidAgeException(String message) {
        // Call the superclass constructor with the message
        super(message);
    }
}

// Create a class that contains the main method and a static method
public class VotingProgram {

    // A static method to check the eligibility for voting
    public static void checkEligibility(int age) throws InvalidAgeException {
        // Define the minimum age for voting
        int minAge = 18;
        // Check if the age is less than the minimum age
        if (age < minAge) {
            // Throw a custom exception with a message
            throw new InvalidAgeException("You are not eligible for voting.");
        } else {
            // Print a message indicating the eligibility
            System.out.println("You are eligible for voting.");
        }
    }

    // The main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        // Try to read the user input and check the eligibility
        try {
            // Read the user input as an integer
            int age = sc.nextInt();
            // Call the static method to check the eligibility
            checkEligibility(age);
        } catch (InvalidAgeException e) {
            // Catch the custom exception and print its message
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Catch any other exception and print its message
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            // Close the scanner object
            sc.close();
        }
    }
}
