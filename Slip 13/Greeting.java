// Import the Scanner class
import java.util.Scanner;

// Create a class named Greeting
public class Greeting {

  // Create a main method
  public static void main(String[] args) {

    // Create a Scanner object to take user input
    Scanner scan = new Scanner(System.in);

    // Prompt the user to enter their name
    System.out.println("Please enter your name:");

    // Read the user input as a string
    String name = scan.nextLine();

    // Close the scanner object
    scan.close();

    // Convert the name to upper case letters
    String upperCaseName = name.toUpperCase();

    // Display the greeting with the upper case name
    System.out.println("Hello, " + upperCaseName + ", nice to meet you!");
  }
}
