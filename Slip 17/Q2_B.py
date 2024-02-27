# Import the datetime module to validate the date
import datetime

# Define a class Date with day, month and year attributes
class Date:
    # Constructor to initialize the attributes
    def __init__(self, day, month, year):
        self.day = day
        self.month = month
        self.year = year

    # Method to accept the date from the user
    def accept_date(self):
        # Prompt the user to enter the date in dd/mm/yyyy format
        input_date = input("Enter the date in format 'dd/mm/yyyy': ")
        # Split the input by '/' and parse the parts as integers
        self.day, self.month, self.year = map(int, input_date.split('/'))

    # Method to display the date
    def display_date(self):
        # Print the date in dd/mm/yyyy format
        print(f"Date: {self.day}/{self.month}/{self.year}")

    # Method to validate the date and throw an exception if invalid
    def validate_date(self):
        # Try to create a datetime object with the given date
        try:
            datetime.date(self.year, self.month, self.day)
        # Catch the ValueError if the date is invalid
        except ValueError:
            # Raise a user defined exception with a custom message
            raise Exception("Invalid Date Exception: The date is invalid")

# Create a Date object
date = Date(0, 0, 0)
# Accept the date from the user
date.accept_date()
# Try to validate the date
try:
    date.validate_date()
    # If the date is valid, display it
    date.display_date()
# Catch the user defined exception if the date is invalid
except Exception as e:
    # Print the exception message
    print(e)
