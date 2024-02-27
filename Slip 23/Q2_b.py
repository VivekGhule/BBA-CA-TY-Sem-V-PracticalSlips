# Import the math module to get the value of pi
import math

# Define the class circles
class circles:
    # Initialize the attribute radius with the given argument
    def __init__(self, radius):
        self.radius = radius

    # Define the __add__() method to overload the + operator
    def __add__(self, other):
        # Return a new circles object with the sum of the radii
        return circles(self.radius + other.radius)

    # Define a method to display the area of the circle
    def display_area(self):
        # Use the formula: area = pi * radius * radius
        area = math.pi * self.radius * self.radius
        print("The area of the circle with radius", self.radius, "is", round(area, 2))

# Create two circles objects with different radii
c1 = circles(5)
c2 = circles(10)

# Add the two circles objects using the + operator
c3 = c1 + c2

# Display the area of each circle
c1.display_area()
c2.display_area()
c3.display_area()
