// Import the Scanner and ArrayList classes
import java.util.Scanner;
import java.util.ArrayList;

// Create a class named Main
public class Main {

  // Create a main method
  public static void main(String[] args) {

    // Create a Scanner object to take user input
    Scanner scan = new Scanner(System.in);

    // Prompt the user to enter the number of integers
    System.out.println("Enter the number of integers you want to store:");

    // Read the user input as an integer
    int n = scan.nextInt();

    // Create an ArrayList object to store the integers
    ArrayList<Integer> list = new ArrayList<>();

    // Prompt the user to enter the integers
    System.out.println("Enter the " + n + " integers:");

    // Loop through n times
    for (int i = 0; i < n; i++) {

      // Read the user input as an integer and add it to the list
      list.add(scan.nextInt());
    }

    // Close the scanner object
    scan.close();

    // Display the list in reverse order
    System.out.println("The elements of the list in reverse order are:");

    // Loop through the list from the last index to the first index
    for (int i = list.size() - 1; i >= 0; i--) {

      // Print the element at the current index
      System.out.println(list.get(i));
    }
  }
}
