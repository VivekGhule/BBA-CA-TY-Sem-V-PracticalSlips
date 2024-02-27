// Java program to calculate the area of circle, triangle and rectangle using method overloading
public class AreaCalculator {

    // A constant value for PI
    public static final double PI = 3.14;

    // A method to calculate the area of a circle
    // It takes one double parameter for the radius
    public static double area(double radius) {
        return PI * radius * radius;
    }

    // A method to calculate the area of a rectangle
    // It takes two double parameters for the length and width
    public static double area(double length, double width) {
        return length * width;
    }

    // A method to calculate the area of a triangle
    // It takes three double parameters for the sides
    public static double area(double a, double b, double c) {
        // Using Heron's formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // A main method to test the program
    public static void main(String[] args) {
        // Some sample values
        double radius = 5;
        double length = 10;
        double width = 8;
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;

        // Printing the results
        System.out.println("The area of the circle with radius " + radius + " is " + area(radius));
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is " + area(length, width));
        System.out.println("The area of the triangle with sides " + side1 + ", " + side2 + " and " + side3 + " is " + area(side1, side2, side3));
    }
}
