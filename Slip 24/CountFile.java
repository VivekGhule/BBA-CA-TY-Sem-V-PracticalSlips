// import the required classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// create a class CountFile
public class CountFile {

  // create a main method
  public static void main(String[] args) throws IOException {
    // create a BufferedReader object to read from the file
    BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    // create variables to store the counts of digits, spaces and characters
    int digits = 0, spaces = 0, characters = 0;
    // create a variable to store the character read from the file
    int ch;
    // loop until the end of the file is reached
    while ((ch = br.read()) != -1) {
      // check if the character is a digit
      if (Character.isDigit(ch)) {
        // increment the digit count
        digits++;
      }
      // check if the character is a space
      else if (Character.isWhitespace(ch)) {
        // increment the space count
        spaces++;
      }
      // otherwise, the character is neither a digit nor a space
      else {
        // increment the character count
        characters++;
      }
    }
    // close the BufferedReader object
    br.close();
    // print the counts of digits, spaces and characters
    System.out.println("Number of digits in the file: " + digits);
    System.out.println("Number of spaces in the file: " + spaces);
    System.out.println("Number of characters in the file: " + characters);
  }
}
