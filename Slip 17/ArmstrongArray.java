// Java Program to accept 'n' numbers through command line and store only Armstrong numbers into the array and display that array
public class ArmstrongArray {

  // main method that takes a String array as a parameter and throws an exception if the input is invalid
  public static void main(String[] args) throws Exception {
    // declare an integer variable n and assign it the length of the String array parameter
    int n = args.length;
    // if n is zero, throw an exception
    if (n == 0) {
      throw new Exception("No input given");
    }
    // declare an integer array arr and initialize it with the size of n
    int[] arr = new int[n];
    // use a for loop to iterate over the String array parameter and convert each element to an integer using the Integer.parseInt method
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(args[i]);
    }
    // declare an integer variable count and initialize it to zero
    int count = 0;
    // declare another integer array armstrong and initialize it with the size of n
    int[] armstrong = new int[n];
    // use another for loop to iterate over the arr array and check if each element is an Armstrong number using a helper method isArmstrong
    for (int num : arr) {
      // if the element is an Armstrong number, store it in the armstrong array at the index of count and increment count by one
      if (isArmstrong(num)) {
        armstrong[count] = num;
        count++;
      }
    }
    // use a System.out.println statement to print the message "The Armstrong numbers from the given array are:"
    System.out.println("The Armstrong numbers from the given array are:");
    // use a final for loop to iterate over the armstrong array from index zero to count - 1 and print each element using a System.out.print statement with a space as a separator
    for (int i = 0; i < count; i++) {
      System.out.print(armstrong[i] + " ");
    }
    // use another System.out.println statement to print a new line
    System.out.println();
  }

  // helper method that takes an integer as a parameter and returns a boolean value
  public static boolean isArmstrong(int number) {
    // declare an integer variable temp and assign it the value of the parameter
    int temp = number;
    // declare an integer variable sum and initialize it to zero
    int sum = 0;
    // declare an integer variable digits and initialize it to zero
    int digits = 0;
    // use a while loop to count the number of digits in the parameter by dividing it by 10 repeatedly and incrementing digits by one
    while (number > 0) {
      digits++;
      number = number / 10;
    }
    // assign the value of temp to number
    number = temp;
    // use another while loop to calculate the sum of the digits raised to the power of the number of digits by using the modulo operator (%) to get the last digit and the Math.pow method to raise it to the power of digits
    while (number > 0) {
      sum = sum + (int) Math.pow(number % 10, digits);
      number = number / 10;
    }
    // return true if sum is equal to temp, otherwise return false
    return sum == temp;
  }
}
