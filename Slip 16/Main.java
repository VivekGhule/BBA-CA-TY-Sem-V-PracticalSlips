import java.util.Scanner;
import java.util.Arrays;

// Employee class with name and salary fields
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize name and salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods for name and salary
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method to display employee details
    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }

    // Static method to sort an array of employees by name
    public static void sortByName(Employee[] employees) {
        // Using Arrays.sort with a custom comparator
        Arrays.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt(); // Read the number of employees
        sc.nextLine(); // Consume the newline
        Employee[] employees = new Employee[n]; // Create an array of employees
        // Loop to read employee details from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            String name = sc.nextLine(); // Read the name
            System.out.print("Enter the salary of employee " + (i + 1) + ": ");
            double salary = sc.nextDouble(); // Read the salary
            sc.nextLine(); // Consume the newline
            employees[i] = new Employee(name, salary); // Create an employee object and store in the array
        }
        // Sort the array by name using the static method
        Employee.sortByName(employees);
        // Display the sorted array
        System.out.println("The employees sorted by name are:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
