// Import the javax.swing package for GUI components
import javax.swing.*;

// Create a class that extends JFrame
public class EmployeeTable extends JFrame {

    // Declare the components as instance variables
    JTable table;
    JScrollPane scrollPane;

    // Constructor
    public EmployeeTable() {
        // Set the title of the frame
        setTitle("Employee Table");
        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the size of the frame
        setSize(400, 300);

        // Create a two-dimensional array of objects for the table data
        // The data can be taken from the user using a Scanner or a GUI input
        // For simplicity, we will use some sample data
        Object[][] data = {
            {"101", "Alice", "5000"},
            {"102", "Bob", "6000"},
            {"103", "Charlie", "7000"},
            {"104", "David", "8000"},
            {"105", "Eve", "9000"}
        };

        // Create a one-dimensional array of strings for the column names
        String[] columnNames = {"Eno", "Ename", "Salary"};

        // Create a JTable with the data and column names
        table = new JTable(data, columnNames);

        // Create a JScrollPane with the table as the viewport view
        scrollPane = new JScrollPane(table);

        // Add the scroll pane to the frame
        add(scrollPane);

        // Make the frame visible
        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of EmployeeTable
        EmployeeTable et = new EmployeeTable();
    }
}
