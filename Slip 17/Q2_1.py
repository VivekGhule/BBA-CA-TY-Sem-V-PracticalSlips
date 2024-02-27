# Python GUI program that takes input string and change letter to upper case
# when a button is pressed

# Import the tkinter module
import tkinter as tk

# Create a Tk object
window = tk.Tk()

# Create a Label object
label = tk.Label(window, text="Enter a string and press the button")

# Create an Entry object
entry = tk.Entry(window)

# Create a Button object
button = tk.Button(window, text="Convert to Upper Case")

# Define a function that converts the input string to upper case and displays it on the label
def convert_to_upper():
  # Get the input string from the entry
  input_string = entry.get()
  # Convert the input string to upper case
  upper_string = input_string.upper()
  # Display the upper case string on the label
  label.config(text=upper_string)

# Bind the function to the button
button.config(command=convert_to_upper)

# Arrange the GUI elements on the window
label.pack()
entry.pack()
button.pack()

# Start the event loop of the application
window.mainloop()
