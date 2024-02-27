// import the required classes
import java.io.File;
import java.io.IOException;

// create a class FileOperations
public class FileOperations {

  // create a main method
  public static void main(String[] args) {
    // create a File object with the file name
    File file = new File("test.txt");

    // 1. To create a file
    try {
      // use the createNewFile() method to create a new file
      boolean created = file.createNewFile();
      // check if the file was created successfully
      if (created) {
        System.out.println("File created successfully");
      } else {
        System.out.println("File already exists");
      }
    } catch (IOException e) {
      // handle the exception
      e.printStackTrace();
    }

    // 2. To rename a file
    // create another File object with the new file name
    File renamed = new File("newtest.txt");
    // use the renameTo() method to rename the file
    boolean renamedFlag = file.renameTo(renamed);
    // check if the file was renamed successfully
    if (renamedFlag) {
      System.out.println("File renamed successfully");
    } else {
      System.out.println("File rename failed");
    }

    // 3. To delete a file
    // use the delete() method to delete the file
    boolean deleted = renamed.delete();
    // check if the file was deleted successfully
    if (deleted) {
      System.out.println("File deleted successfully");
    } else {
      System.out.println("File delete failed");
    }

    // 4. To display path of a file
    // use the getPath() method to get the path of the file
    String path = file.getPath();
    // print the path of the file
    System.out.println("Path of the file: " + path);
  }
}
