
# create a class named Rectangle
class Rectangle:

  # define a constructor that takes the length and width as parameters
  def __init__(self, length, width):
    # assign the length and width to the instance attributes
    self.length = length
    self.width = width

  # define a method to compute the area of the rectangle
  def area(self):
    # return the product of the length and the width
    return self.length * self.width

  # define a method to compute the perimeter of the rectangle
  def perimeter(self):
    # return the sum of twice the length and twice the width
    return 2 * (self.length + self.width)
