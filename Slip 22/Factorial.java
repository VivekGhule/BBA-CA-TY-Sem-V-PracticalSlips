// create a class Factorial
public class Factorial {

  // create a method factorial that takes an integer n as a parameter and returns its factorial
  public static int factorial(int n) {
    // base case: if n is 0 or 1, return 1
    if (n == 0 || n == 1) {
      return 1;
    }
    // recursive case: return n multiplied by the factorial of n-1
    return n * factorial(n - 1);
  }

  // create a main method
  public static void main(String[] args) {
    // test the factorial method with some examples
    System.out.println("Factorial of 5 is " + factorial(5));
    System.out.println("Factorial of 6 is " + factorial(6));
    System.out.println("Factorial of 0 is " + factorial(0));
  }
}
