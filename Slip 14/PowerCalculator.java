// Java program to calculate the power of a number using recursion
import java.util.Scanner;

public class PowerCalculator {

    // A recursive method that returns the result of base raised to the power of exp
    public static int power(int base, int exp) {
        // Base case: if exp is zero, return 1
        if (exp == 0) {
            return 1;
        }
        // Recursive case: multiply base by the result of power(base, exp - 1)
        else {
            return base * power(base, exp - 1);
        }
    }

    // A main method that reads the input from the user and prints the output
    public static void main(String[] args) {
        // Create a Scanner object to read the input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the base and the exponent
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();

        // Call the power method and store the result
        int result = power(base, exp);

        // Print the result
        System.out.println(base + "^" + exp + " = " + result);
    }
}
