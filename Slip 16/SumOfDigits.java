//Java Program to find the sum of digits using recursion
import java.util.Scanner;

public class SumOfDigits {

  //function that finds the sum of digits of a number
  static int findSum(int number) {
    //base case
    if (number == 0) {
      return 0;
    }
    //recursive case
    else {
      //get the last digit and add it to the recursive call
      return number % 10 + findSum(number / 10);
    }
  }

  //main method
  public static void main(String[] args) {
    //create a scanner object
    Scanner sc = new Scanner(System.in);
    //prompt the user to enter a number
    System.out.print("Enter a number: ");
    //read the input as an integer
    int num = sc.nextInt();
    //call the function and store the result
    int sum = findSum(num);
    //print the result
    System.out.println("The sum of digits of " + num + " is " + sum);
  }
}
