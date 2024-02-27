# Import the tkinter module for GUI
import tkinter as tk

# Create a root window
root = tk.Tk()
# Set the title of the window
root.title("Decimal Converter")
# Set the size of the window
root.geometry("300x200")

# Create a label to display the instruction
label = tk.Label(root, text="Enter a decimal number:")
# Place the label on the window
label.place(x=10, y=10)

# Create an entry widget to accept the user input
entry = tk.Entry(root)
# Place the entry widget on the window
entry.place(x=150, y=10)

# Create a function to convert the decimal number to other bases
def convert():
    # Get the user input as a string
    decimal = entry.get()
    # Try to convert the string to an integer
    try:
        # Convert the string to an integer
        num = int(decimal)
        # Convert the integer to binary using bin() function
        binary = bin(num).replace("0b", "")
        # Convert the integer to octal using oct() function
        octal = oct(num).replace("0o", "")
        # Convert the integer to hexadecimal using hex() function
        hexadecimal = hex(num).replace("0x", "")
        # Display the results in the labels
        binary_label.config(text="Binary: " + binary)
        octal_label.config(text="Octal: " + octal)
        hex_label.config(text="Hexadecimal: " + hexadecimal)
    except ValueError:
        # Handle the exception if the input is not a valid decimal number
        # Display an error message in the labels
        binary_label.config(text="Invalid input")
        octal_label.config(text="Invalid input")
        hex_label.config(text="Invalid input")

# Create a button to trigger the conversion
button = tk.Button(root, text="Convert", command=convert)
# Place the button on the window
button.place(x=130, y=40)

# Create labels to display the results
binary_label = tk.Label(root, text="Binary: ")
octal_label = tk.Label(root, text="Octal: ")
hex_label = tk.Label(root, text="Hexadecimal: ")

# Place the labels on the window
binary_label.place(x=10, y=80)
octal_label.place(x=10, y=110)
hex_label.place(x=10, y=140)

# Start the main loop of the window
root.mainloop()
