# Define the class Shape
class Shape:
    # Initialize the attribute area to 0 by default
    def __init__(self):
        self.area = 0

    # Define a method to calculate the area of the shape
    def calculate_area(self):
        return self.area

    # Define a method to calculate the volume of the shape
    def calculate_volume(self):
        # Assume that the shape is a 2D object, so the volume is 0 by default
        return 0

# Define the subclass Square that inherits from Shape
class Square(Shape):
    # Initialize the attribute length with the given argument
    def __init__(self, length):
        # Call the parent class constructor
        super().__init__()
        self.length = length

    # Override the method to calculate the area of the square
    def calculate_area(self):
        # Use the formula: area = length * length
        self.area = self.length * self.length
        return self.area

    # Override the method to calculate the volume of the square
    def calculate_volume(self):
        # Assume that the square is a 3D object, so the volume is equal to the area
        return self.calculate_area()

# Define the subclass Circle that inherits from Shape
class Circle(Shape):
    # Initialize the attribute radius with the given argument
    def __init__(self, radius):
        # Call the parent class constructor
        super().__init__()
        self.radius = radius

    # Override the method to calculate the area of the circle
    def calculate_area(self):
        # Use the formula: area = pi * radius * radius
        # Use the math module to get the value of pi
        import math
        self.area = math.pi * self.radius * self.radius
        return self.area

    # Override the method to calculate the volume of the circle
    def calculate_volume(self):
        # Assume that the circle is a 3D object, so the volume is equal to the area
        return self.calculate_area()
