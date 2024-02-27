// Import the javax.swing package
import javax.swing.*;
// Import the java.awt package for layout and color
import java.awt.*;

// Create a class that extends JFrame
public class GUIExample extends JFrame {

    // Declare the components as instance variables
    JTextField firstName, lastName, address, mobileNumber;
    JRadioButton male, female;
    ButtonGroup genderGroup;
    JCheckBox computer, sports, music;

    // Constructor
    public GUIExample() {
        // Set the title of the frame
        setTitle("GUI Example");
        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the size of the frame
        setSize(400, 300);
        // Set the layout of the frame to GridLayout with 6 rows and 2 columns
        setLayout(new GridLayout(6, 2));

        // Create the text fields for first name, last name, address, and mobile number
        firstName = new JTextField(20);
        lastName = new JTextField(20);
        address = new JTextField(20);
        mobileNumber = new JTextField(10);

        // Create the radio buttons for gender selection
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        // Create a button group and add the radio buttons to it
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Create a panel to hold the radio buttons
        JPanel genderPanel = new JPanel();
        // Set the layout of the panel to FlowLayout
        genderPanel.setLayout(new FlowLayout());
        // Add the radio buttons to the panel
        genderPanel.add(male);
        genderPanel.add(female);

        // Create the check boxes for interests
        computer = new JCheckBox("Computer");
        sports = new JCheckBox("Sports");
        music = new JCheckBox("Music");

        // Create a panel to hold the check boxes
        JPanel interestPanel = new JPanel();
        // Set the layout of the panel to FlowLayout
        interestPanel.setLayout(new FlowLayout());
        // Add the check boxes to the panel
        interestPanel.add(computer);
        interestPanel.add(sports);
        interestPanel.add(music);

        // Add the components to the frame with labels
        add(new JLabel("First Name:"));
        add(firstName);
        add(new JLabel("Last Name:"));
        add(lastName);
        add(new JLabel("Address:"));
        add(address);
        add(new JLabel("Mobile Number:"));
        add(mobileNumber);
        add(new JLabel("Gender:"));
        add(genderPanel);
        add(new JLabel("Interests:"));
        add(interestPanel);

        // Make the frame visible
        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of GUIExample
        GUIExample gui = new GUIExample();
    }
}
