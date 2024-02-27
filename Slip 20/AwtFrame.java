// Import the java.awt package
import java.awt.*;
// Import the java.awt.event package for handling events
import java.awt.event.*;

// Extend the Frame class
public class AwtFrame extends Frame {

    // Constructor
    public AwtFrame() {
        // Set the title of the Frame
        setTitle("TYBBACA");
        // Set the background color of the Frame
        setBackground(Color.RED);
        // Set the size of the Frame
        setSize(300, 200);
        // Set the visibility of the Frame
        setVisible(true);
        // Add a WindowListener to the Frame
        addWindowListener(new WindowAdapter() {
            // Override the windowClosing method
            public void windowClosing(WindowEvent e) {
                // Close the Frame
                dispose();
            }
        });
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of AwtFrame
        AwtFrame frame = new AwtFrame();
    }
}
