# Create a class in which one method accepts a string from the user and another method prints it
class StringPrinter:
    # Define the constructor that initializes the string attribute
    def __init__(self):
        self.string = ""

    # Define the method that accepts a string from the user
    def get_string(self):
        self.string = input("Enter a string: ")

    # Define the method that prints the string
    def print_string(self):
        print("The string is:", self.string)

# Define a class named Country which has a method called printNationality
class Country:
    # Define the constructor that initializes the nationality attribute
    def __init__(self, nationality):
        self.nationality = nationality

    # Define the method that prints the nationality
    def printNationality(self):
        print("The nationality is:", self.nationality)

# Define a subclass named State from Country which has a method called printState
class State(Country):
    # Define the constructor that initializes the state and country attributes
    def __init__(self, state, country):
        # Call the superclass constructor with the country parameter
        super().__init__(country)
        self.state = state

    # Define the method that prints the state
    def printState(self):
        print("The state is:", self.state)

    # Define the method that prints the state, country and nationality
    def printDetails(self):
        # Call the printState and printNationality methods
        self.printState()
        self.printNationality()

# Create an object of the StringPrinter class
sp = StringPrinter()
# Call the get_string and print_string methods
sp.get_string()
sp.print_string()

# Create an object of the State class
s = State("Maharashtra", "India")
# Call the printDetails method
s.printDetails()
