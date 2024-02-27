// import the required class
import java.io.File;

// create a class CheckHidden
public class CheckHidden {

  // create a main method
  public static void main(String[] args) {
    // create a File object with the file name
    File file = new File("file.txt");

    // use the isHidden() method to check if the file is hidden
    boolean hidden = file.isHidden();

    // if the file is hidden, display an appropriate message
    if (hidden) {
      System.out.println("The file is hidden.");
    } else {
      // if the file is not hidden, display its path
      System.out.println("The file is not hidden.");
      System.out.println("The path of the file is: " + file.getPath());
    }
  }
}
