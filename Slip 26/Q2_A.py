# Write a Python program using an anonymous function to find the area of a square and a rectangle

# Define an anonymous function to find the area of a square
# It takes one parameter for the side length and returns the square of it
square_area = lambda side: side ** 2

# Define an anonymous function to find the area of a rectangle
# It takes two parameters for the length and width and returns the product of them
rectangle_area = lambda length, width: length * width

# Take the input for the side length of the square
side = int(input("Enter the side length of the square: "))

# Take the input for the length and width of the rectangle
length = int(input("Enter the length of the rectangle: "))
width = int(input("Enter the width of the rectangle: "))

# Display the area of the square using the anonymous function
print("The area of the square is", square_area(side))

# Display the area of the rectangle using the anonymous function
print("The area of the rectangle is", rectangle_area(length, width))
