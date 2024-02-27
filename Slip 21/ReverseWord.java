// import the required classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

// create a class ReverseWords
public class ReverseWords {

  // create a method reverse that takes a string as a parameter and returns its reverse
  public static String reverse(String s) {
    // create a StringBuilder object to store the reversed string
    StringBuilder sb = new StringBuilder();
    // loop through the string from the end to the beginning
    for (int i = s.length() - 1; i >= 0; i--) {
      // append the current character to the StringBuilder
      sb.append(s.charAt(i));
    }
    // return the reversed string
    return sb.toString();
  }

  // create a main method
  public static void main(String[] args) throws IOException {
    // create a BufferedReader object to read from the file
    BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    // create a variable to store the line read from the file
    String line;
    // loop until the end of the file is reached
    while ((line = br.readLine()) != null) {
      // create a StringTokenizer object to split the line into words
      StringTokenizer st = new StringTokenizer(line);
      // loop through the words in the line
      while (st.hasMoreTokens()) {
        // get the next word
        String word = st.nextToken();
        // reverse the word and print it
        System.out.print(reverse(word) + " ");
      }
      // print a new line
      System.out.println();
    }
    // close the BufferedReader object
    br.close();
  }
}
