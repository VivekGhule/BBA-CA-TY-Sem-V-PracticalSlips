import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter two numbers as command line arguments.");
            return;
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }
        System.out.println("The result is: " + result);
        sc.close();
    }
}
