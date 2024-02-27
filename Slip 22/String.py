# Define the class StringRepeater
class StringRepeater:
    # Initialize the attribute string with the given argument
    def __init__(self, string):
        self.string = string

    # Define the __mul__() method to overload the * operator
    def __mul__(self, n):
        # Return the string repeated n times
        return self.string * n

# Take the input for the string and the number n from the user
string = input("Enter a string: ")
n = int(input("Enter a number: "))

# Create an instance of StringRepeater with the input string
s = StringRepeater(string)

# Display the result of s * n
print(s * n)
