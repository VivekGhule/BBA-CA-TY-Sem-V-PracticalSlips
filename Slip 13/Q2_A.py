# Define a function to input a positive integer and display correct message
def input_positive_integer():
  # Use a try-except block to handle exceptions
  try:
    # Prompt the user to enter a positive integer
    number = int(input("Enter a positive integer: "))
    # Check if the number is positive
    if number > 0:
      # Display the correct message
      print("You entered a positive integer:", number)
    # If the number is not positive, raise a ValueError
    else:
      raise ValueError
  # If the input is not an integer, display an incorrect message
  except ValueError:
    print("That is not a positive integer. Please try again.")

# Call the function
input_positive_integer()
