# import the math module
import math

# create a class Circle
class Circle:

  # define a parameterized constructor that takes the radius as an argument
  def __init__(self, radius):
    # assign the radius to the instance attribute
    self.radius = radius

  # define a method to compute the area of the circle
  def area(self):
    # return the product of pi and the square of the radius
    return math.pi * self.radius ** 2

  # define a method to compute the circumference of the circle
  def circumference(self):
    # return the product of 2, pi and the radius
    return 2 * math.pi * self.radius

# create an instance of the Circle class with a given radius
c = Circle(5)
# print the area and the circumference of the circle
print("Area of the circle:", c.area())
print("Circumference of the circle:", c.circumference())
