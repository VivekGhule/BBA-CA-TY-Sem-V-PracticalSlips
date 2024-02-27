# Import the tkinter module
import tkinter as tk

# Define a function to convert a digit to a word
def digit_to_word(digit):
    # Use a dictionary to store the words for each digit
    words = {
        "0": "zero",
        "1": "one",
        "2": "two",
        "3": "three",
        "4": "four",
        "5": "five",
        "6": "six",
        "7": "seven",
        "8": "eight",
        "9": "nine"
    }
    # Return the word for the digit or an empty string if the digit is not valid
    return words.get(digit, "")

# Define a function to display the digits of a number in words
def display_digits():
    # Get the input number from the entry widget
    number = entry.get()
    # Initialize an empty string to store the result
    result = ""
    # Loop over each character of the number
    for char in number:
        # Convert the character to a word using the digit_to_word function
        word = digit_to_word(char)
        # If the word is not empty, append it to the result with a space
        if word:
            result += word + " "
    # Display the result in the label widget
    label.config(text=result)

# Create a root window
root = tk.Tk()
# Set the title of the window
root.title("Digits in Words")
# Set the size of the window
root.geometry("300x200")

# Create a label widget to display the instruction
instruction = tk.Label(root, text="Enter a number:")
# Place the label widget in the window using grid layout
instruction.grid(row=0, column=0, padx=10, pady=10)

# Create an entry widget to accept the input number
entry = tk.Entry(root)
# Place the entry widget in the window using grid layout
entry.grid(row=0, column=1, padx=10, pady=10)

# Create a button widget to trigger the display_digits function
button = tk.Button(root, text="Display", command=display_digits)
# Place the button widget in the window using grid layout
button.grid(row=1, column=0, columnspan=2, padx=10, pady=10)

# Create a label widget to display the result
label = tk.Label(root, text="")
# Place the label widget in the window using grid layout
label.grid(row=2, column=0, columnspan=2, padx=10, pady=10)

# Start the main loop of the window
root.mainloop()
