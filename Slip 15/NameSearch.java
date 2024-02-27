// Importing the Scanner class for user input
import java.util.Scanner;

// Creating a class that contains the main method
public class NameSearch {

    // The main method
    public static void main(String[] args) {
        // Creating a Scanner object to read the user input
        Scanner sc = new Scanner(System.in);

        // Creating an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Prompting the user to enter a name to search
        System.out.print("Enter a name to search: ");
        String name = sc.nextLine();

        // Initializing a boolean variable to indicate if the name is found or not
        boolean found = false;

        // Looping through the array to compare each element with the name
        for (int i = 0; i < names.length; i++) {
            // If the name matches the element, print the index and set found to true
            if (name.equals(names[i])) {
                System.out.println("The name " + name + " is found at index " + i);
                found = true;
                // Break the loop as there is no need to search further
                break;
            }
        }

        // If the name is not found, print an appropriate message
        if (!found) {
            System.out.println("The name " + name + " is not found in the array");
        }
    }
}
