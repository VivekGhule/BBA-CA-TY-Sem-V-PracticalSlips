// Import the java.util package for using Scanner
import java.util.*;

// Create a class Palindrome
public class Palindrome {
    // Create a main method
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Take the input for the string
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Create a StringBuilder object with the string
        StringBuilder sb = new StringBuilder(str);

        // Reverse the string using the reverse() method
        String rev = sb.reverse().toString();

        // Compare the original string with the reversed string using the equals() method
        if (str.equals(rev)) {
            // If they are equal, the string is palindrome
            System.out.println(str + " is a palindrome");
        } else {
            // If they are not equal, the string is not palindrome
            System.out.println(str + " is not a palindrome");
        }

        // Close the scanner
        sc.close();
    }
}
