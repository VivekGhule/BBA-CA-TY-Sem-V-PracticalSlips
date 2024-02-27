// Create a package named Series
package Series;

// Import Scanner class for user input
import java.util.Scanner;

// Create a class for Fibonacci series
class Fibonacci {
    // A method to print n terms of Fibonacci series
    public static void printFibonacci(int n) {
        // Initialize the first two terms
        int a = 0, b = 1;
        // Print the first two terms
        System.out.print(a + " " + b + " ");
        // Use a loop to generate and print the next n-2 terms
        for (int i = 3; i <= n; i++) {
            // Calculate the next term as the sum of previous two terms
            int c = a + b;
            // Print the next term
            System.out.print(c + " ");
            // Update the previous two terms
            a = b;
            b = c;
        }
        // Print a new line
        System.out.println();
    }
}

// Create a class for cube of numbers
class Cube {
    // A method to print n terms of cube of numbers
    public static void printCube(int n) {
        // Use a loop to generate and print the cube of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Calculate the cube of i using Math.pow method
            int cube = (int) Math.pow(i, 3);
            // Print the cube of i
            System.out.print(cube + " ");
        }
        // Print a new line
        System.out.println();
    }
}

// Create a class for square of numbers
class Square {
    // A method to print n terms of square of numbers
    public static void printSquare(int n) {
        // Use a loop to generate and print the square of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Calculate the square of i using Math.pow method
            int square = (int) Math.pow(i, 2);
            // Print the square of i
            System.out.print(square + " ");
        }
        // Print a new line
        System.out.println();
    }
}

// Create a main class to test the above classes
public class Main {
    // The main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        // Read the user input as an integer
        int n = sc.nextInt();
        // Close the scanner object
        sc.close();
        // Print the Fibonacci series using the Fibonacci class
        System.out.println("Fibonacci series:");
        Fibonacci.printFibonacci(n);
        // Print the cube of numbers using the Cube class
        System.out.println("Cube of numbers:");
        Cube.printCube(n);
        // Print the square of numbers using the Square class
        System.out.println("Square of numbers:");
        Square.printSquare(n);
    }
}
