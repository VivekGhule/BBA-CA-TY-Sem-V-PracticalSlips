// Import the javax.swing package
import javax.swing.*;
// Import the java.awt.event package for handling events
import java.awt.event.*;

// Extend the JFrame class
public class MenuFrame extends JFrame implements ActionListener {

    // Declare the components as instance variables
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, searchMenu;
    JMenuItem openItem, saveItem, exitItem, copyItem, pasteItem, findItem, replaceItem;

    // Constructor
    public MenuFrame() {
        // Set the title of the frame
        setTitle("Menu Frame");
        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the size of the frame
        setSize(400, 300);

        // Create the menu bar
        menuBar = new JMenuBar();

        // Create the file menu and add menu items
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Create the edit menu and add menu items
        editMenu = new JMenu("Edit");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Create the search menu and add menu items
        searchMenu = new JMenu("Search");
        findItem = new JMenuItem("Find");
        replaceItem = new JMenuItem("Replace");
        searchMenu.add(findItem);
        searchMenu.add(replaceItem);

        // Add the menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(searchMenu);

        // Add the menu bar to the frame
        setJMenuBar(menuBar);

        // Register the action listener to the menu items
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        findItem.addActionListener(this);
        replaceItem.addActionListener(this);
    }

    // Override the actionPerformed method to handle the menu actions
    public void actionPerformed(ActionEvent e) {
        // Get the source of the action
        Object source = e.getSource();
        // Perform different actions based on the source
        if (source == openItem) {
            // Open a file chooser dialog
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                // Get the selected file
                File file = chooser.getSelectedFile();
                // Display the file name
                JOptionPane.showMessageDialog(this, "You opened " + file.getName());
            }
        } else if (source == saveItem) {
            // Save the current file
            JOptionPane.showMessageDialog(this, "You saved the file");
        } else if (source == exitItem) {
            // Exit the program
            System.exit(0);
        } else if (source == copyItem) {
            // Copy the selected text
            JOptionPane.showMessageDialog(this, "You copied the text");
        } else if (source == pasteItem) {
            // Paste the copied text
            JOptionPane.showMessageDialog(this, "You pasted the text");
        } else if (source == findItem) {
            // Find a text in the document
            JOptionPane.showMessageDialog(this, "You searched for a text");
        } else if (source == replaceItem) {
            // Replace a text in the document
            JOptionPane.showMessageDialog(this, "You replaced a text");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of MenuFrame
        MenuFrame frame = new MenuFrame();
        // Make the frame visible
        frame.setVisible(true);
    }
}
