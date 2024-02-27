# Python script to create a class Rectangle with data members length and width
# and methods area and perimeter

# Define a class named Rectangle
class Rectangle:

  # Define an __init__ method that takes two parameters, length and width
  def __init__(self, length, width):
    # Assign the parameters to the instance variables self.length and self.width
    self.length = length
    self.width = width

  # Define a method named area that takes no parameters and returns the product of self.length and self.width
  def area(self):
    return self.length * self.width

  # Define a method named perimeter that takes no parameters and returns the sum of twice self.length and twice self.width
  def perimeter(self):
    return 2 * (self.length + self.width)

# Create an object of the Rectangle class with length 10 and width 5
rect = Rectangle(10, 5)

# Print the area and perimeter of the rectangle object
print("The area of the rectangle is", rect.area())
print("The perimeter of the rectangle is", rect.perimeter())
