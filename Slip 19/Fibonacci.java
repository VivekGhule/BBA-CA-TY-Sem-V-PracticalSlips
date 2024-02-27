// create a class Fibonacci
public class Fibonacci {

  // create a function fib that takes an integer n as a parameter
  public static int fib(int n) {
    // base case: if n is 0 or 1, return n
    if (n == 0 || n == 1) {
      return n;
    }
    // recursive case: return the sum of fib(n-1) and fib(n-2)
    return fib(n-1) + fib(n-2);
  }

  // create a main method
  public static void main(String[] args) {
    // set the number of terms to display
    int n = 10;
    // print the Fibonacci series using a for loop
    System.out.println("Fibonacci series of " + n + " terms:");
    for (int i = 0; i < n; i++) {
      System.out.print(fib(i) + " ");
    }
  }
}
