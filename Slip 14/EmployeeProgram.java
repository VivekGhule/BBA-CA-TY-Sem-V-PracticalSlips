// Importing the required packages
import java.awt.*;
import java.awt.event.*;

// Creating a class that extends Frame and implements ActionListener
class EmployeeFrame extends Frame implements ActionListener {

    // Declaring the components
    Label l1, l2, l3, l4;
    TextField tf1, tf2, tf3;
    Button b1, b2;
    Panel p1, p2;

    // Creating a constructor
    public EmployeeFrame() {
        // Setting the title, layout and size of the frame
        super("Employee Details");
        setLayout(new BorderLayout());
        setSize(400, 300);

        // Initializing the components
        l1 = new Label("Enter the details of the employee:");
        l2 = new Label("Eno:");
        l3 = new Label("EName:");
        l4 = new Label("Sal:");
        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf3 = new TextField(10);
        b1 = new Button("Submit");
        b2 = new Button("Clear");
        p1 = new Panel();
        p2 = new Panel();

        // Adding the components to the panels
        p1.add(l1);
        p2.add(l2);
        p2.add(tf1);
        p2.add(l3);
        p2.add(tf2);
        p2.add(l4);
        p2.add(tf3);
        p2.add(b1);
        p2.add(b2);

        // Adding the panels to the frame
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);

        // Adding action listeners to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Making the frame visible
        setVisible(true);
    }

    // Overriding the actionPerformed method
    public void actionPerformed(ActionEvent ae) {
        // If the submit button is clicked
        if (ae.getSource() == b1) {
            // Getting the input from the text fields
            int eno = Integer.parseInt(tf1.getText());
            String ename = tf2.getText();
            float sal = Float.parseFloat(tf3.getText());

            // Creating a new frame to display the details
            new DisplayFrame(eno, ename, sal);
        }
        // If the clear button is clicked
        else if (ae.getSource() == b2) {
            // Clearing the text fields
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
    }
}

// Creating another class that extends Frame
class DisplayFrame extends Frame {

    // Declaring the components
    Label l1, l2, l3, l4, l5, l6;
    Panel p1;

    // Creating a constructor that takes the employee details as parameters
    public DisplayFrame(int eno, String ename, float sal) {
        // Setting the title, layout and size of the frame
        super("Employee Details");
        setLayout(new BorderLayout());
        setSize(400, 300);

        // Initializing the components
        l1 = new Label("The details of the employee are:");
        l2 = new Label("Eno: " + eno);
        l3 = new Label("EName: " + ename);
        l4 = new Label("Sal: " + sal);
        l5 = new Label("Thank you for using this program.");
        l6 = new Label("Created by Bing");
        p1 = new Panel();

        // Adding the components to the panel
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);

        // Adding the panel to the frame
        add(p1, BorderLayout.CENTER);

        // Making the frame visible
        setVisible(true);
    }
}

// Creating the main class
public class EmployeeProgram {

    // The main method
    public static void main(String[] args) {
        // Creating an object of the EmployeeFrame class
        new EmployeeFrame();
    }
}
