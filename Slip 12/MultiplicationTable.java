// import the necessary packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// create a class that extends JFrame and implements ActionListener
public class MultiplicationTable extends JFrame implements ActionListener {

  // declare the components
  private JLabel label;
  private JTextField textField;
  private JButton button;
  private JList<String> list;
  private DefaultListModel<String> model;

  // create a constructor
  public MultiplicationTable() {
    // set the title, size, layout and exit operation for the frame
    setTitle("Multiplication Table");
    setSize(300, 300);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // initialize the components
    label = new JLabel("Enter a number:");
    textField = new JTextField(10);
    button = new JButton("Generate");
    model = new DefaultListModel<>();
    list = new JList<>(model);

    // add an action listener to the button
    button.addActionListener(this);

    // add the components to the frame
    add(label);
    add(textField);
    add(button);
    add(list);

    // make the frame visible
    setVisible(true);
  }

  // override the actionPerformed method
  public void actionPerformed(ActionEvent e) {
    // get the source of the event
    Object source = e.getSource();

    // if the source is the button
    if (source == button) {
      // get the input from the text field
      String input = textField.getText();

      // try to parse it as an integer
      try {
        int num = Integer.parseInt(input);

        // clear the previous list model
        model.clear();

        // loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
          // calculate the product of the number and the loop variable
          int product = num * i;

          // add the result to the list model
          model.addElement(num + " x " + i + " = " + product);
        }
      } catch (NumberFormatException ex) {
        // if the input is not a valid integer, show an error message
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  // create a main method to launch the application
  public static void main(String[] args) {
    // create an object of the class
    MultiplicationTable mt = new MultiplicationTable();
  }
}
