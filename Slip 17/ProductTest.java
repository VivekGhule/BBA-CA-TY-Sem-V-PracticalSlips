// Define a class Product with pid, pname, price and qty fields
class Product {
    private int pid;
    private String pname;
    private double price;
    private int qty;

    // Constructor to initialize the fields
    public Product(int pid, String pname, double price, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.qty = qty;
    }

    // Method to display the product details
    public void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + qty);
    }

    // Method to calculate the total amount
    public double totalAmount() {
        return price * qty;
    }
}

// Define a class to test the program
public class ProductTest {
    public static void main(String[] args) {
        // Create an array of Product objects
        Product[] products = new Product[3];
        // Initialize the array with some sample data
        products[0] = new Product(101, "Laptop", 50000.0, 2);
        products[1] = new Product(102, "Mobile", 15000.0, 5);
        products[2] = new Product(103, "Book", 500.0, 10);
        // Loop through the array and display the product details and total amount
        for (Product p : products) {
            p.display();
            System.out.println("Total Amount: " + p.totalAmount());
            System.out.println();
        }
    }
}
