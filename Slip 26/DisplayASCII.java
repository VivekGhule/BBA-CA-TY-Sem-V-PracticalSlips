// Import the File and Scanner classes for reading from a file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Create a class to display ASCII values
public class DisplayASCII {
    // The main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter the file name
        System.out.print("Enter the file name: ");
        // Read the user input as a string
        String fileName = sc.nextLine();
        // Close the scanner object
        sc.close();
        // Create a File object for the given file name
        File file = new File(fileName);
        // Try to read from the file using a Scanner object
        try {
            // Create a Scanner object for the file
            Scanner fileReader = new Scanner(file);
            // Use a loop to read each line from the file
            while (fileReader.hasNextLine()) {
                // Read the next line as a string
                String line = fileReader.nextLine();
                // Use a loop to iterate over each character in the line
                for (int i = 0; i < line.length(); i++) {
                    // Get the character at the current index
                    char ch = line.charAt(i);
                    // Cast the character to an int to get the ASCII value
                    int ascii = (int) ch;
                    // Print the character and its ASCII value
                    System.out.println(ch + " : " + ascii);
                }
            }
            // Close the file reader
            fileReader.close();
        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            System.out.println("File not found: " + fileName);
        }
    }
}
