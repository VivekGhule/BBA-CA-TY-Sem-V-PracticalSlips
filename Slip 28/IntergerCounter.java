// Create a class to count the number of integers from a given list
public class IntegerCounter {

    // The main method
    public static void main(String[] args) {
        // Initialize a variable to store the count
        int count = 0;
        // Use a loop to iterate through the command line arguments
        for (String arg : args) {
            // Try to parse the argument as an integer
            try {
                // Parse the argument as an integer
                int num = Integer.parseInt(arg);
                // Increment the count
                count++;
            } catch (NumberFormatException e) {
                // Handle the exception if the argument is not a valid integer
                // Ignore the argument and continue the loop
                continue;
            }
        }
        // Print the count
        System.out.println("The number of integers in the list is: " + count);
    }
}
