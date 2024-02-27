// Import the java.awt package for GUI components
import java.awt.*;
// Import the java.awt.event package for handling events
import java.awt.event.*;
// Import the java.io package for listing files
import java.io.*;

// Create a class that extends Frame and implements ActionListener
public class DirectoryLister extends Frame implements ActionListener {

    // Declare the components as instance variables
    TextField textField;
    List list;
    Button button;

    // Constructor
    public DirectoryLister() {
        // Set the title of the frame
        setTitle("Directory Lister");
        // Set the layout of the frame to FlowLayout
        setLayout(new FlowLayout());
        // Set the size of the frame
        setSize(400, 300);

        // Create the text field with 20 columns
        textField = new TextField(20);
        // Create the list with 10 rows and multiple selection mode
        list = new List(10, true);
        // Create the button with the label "List"
        button = new Button("List");

        // Add the components to the frame
        add(textField);
        add(button);
        add(list);

        // Register the action listener to the button
        button.addActionListener(this);

        // Make the frame visible
        setVisible(true);
    }

    // Override the actionPerformed method to handle the button click event
    public void actionPerformed(ActionEvent e) {
        // Get the source of the event
        Object source = e.getSource();
        // If the source is the button
        if (source == button) {
            // Get the directory name from the text field
            String dirName = textField.getText();
            // Create a File object with the directory name
            File dir = new File(dirName);
            // Check if the directory exists and is a directory
            if (dir.exists() && dir.isDirectory()) {
                // Clear the previous items in the list
                list.removeAll();
                // Get the array of files and subdirectories in the directory
                File[] files = dir.listFiles();
                // Loop over the array and add the names to the list
                for (File file : files) {
                    list.add(file.getName());
                }
            } else {
                // Display an error message
                list.removeAll();
                list.add("Invalid directory name");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of DirectoryLister
        DirectoryLister dl = new DirectoryLister();
    }
}
