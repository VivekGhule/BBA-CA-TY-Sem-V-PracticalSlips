import java.io.File; 
import java.io.IOException; 

public class FileDeleter {
    public static void main(String[] args) {
        for (String arg : args) {
            File file = new File(arg);
            if (file.exists() && file.isFile()) {
                String fileName = file.getName();
                String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
                if (fileExtension.equalsIgnoreCase("txt")) {
                    boolean deleted = file.delete();
                    if (deleted) {
                        System.out.println(fileName + " deleted.");
                    } else {
                        System.out.println("Failed to delete " + fileName);
                    }
                } else {
                    String fileLocation = file.getAbsolutePath();
                    long fileSize = file.length();
                    System.out.println("File name: " + fileName);
                    System.out.println("File location: " + fileLocation);
                    System.out.println("File size: " + fileSize + " bytes");
                }
            } else {
                System.out.println(arg + " is not a valid file.");
            }
        }
    }
}
