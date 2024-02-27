// import required classes
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// create a class CopyFiles
public class CopyFiles {

  // create a method copyData that takes two files as parameters
  public static void copyData(File source, File destination) throws IOException {
    // create a FileReader object to read from the source file
    FileReader reader = new FileReader(source);
    // create a FileWriter object to write to the destination file
    FileWriter writer = new FileWriter(destination);
    // create a variable to store the character read from the source file
    int ch;
    // loop until the end of the source file is reached
    while ((ch = reader.read()) != -1) {
      // check if the character is a digit
      if (Character.isDigit(ch)) {
        // replace the digit with '*'
        writer.write('*');
      } else {
        // check if the character is lowercase
        if (Character.isLowerCase(ch)) {
          // convert the character to uppercase
          ch = Character.toUpperCase(ch);
        } else {
          // check if the character is uppercase
          if (Character.isUpperCase(ch)) {
            // convert the character to lowercase
            ch = Character.toLowerCase(ch);
          }
        }
        // write the character to the destination file
        writer.write(ch);
      }
    }
    // close the reader and writer objects
    reader.close();
    writer.close();
  }

  // create a main method
  public static void main(String[] args) throws IOException {
    // create two File objects for the source and destination files
    File source = new File("source.txt");
    File destination = new File("destination.txt");
    // call the copyData method with the source and destination files
    copyData(source, destination);
    // print a message to indicate the completion of the task
    System.out.println("Data copied and modified successfully.");
  }
}
