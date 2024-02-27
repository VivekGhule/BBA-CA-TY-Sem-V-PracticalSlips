# Import the tkinter module for GUI
import tkinter as tk

# Create a root window
root = tk.Tk()
# Set the title of the window
root.title("Character Counter")
# Set the size of the window
root.geometry("300x200")

# Create labels to display the instructions
label1 = tk.Label(root, text="Enter a string:")
label2 = tk.Label(root, text="Enter a character:")
# Place the labels on the window
label1.place(x=10, y=10)
label2.place(x=10, y=40)

# Create entry widgets to accept the user input
entry1 = tk.Entry(root)
entry2 = tk.Entry(root)
# Place the entry widgets on the window
entry1.place(x=100, y=10)
entry2.place(x=100, y=40)

# Create a function to count the occurrences of a character in a string
def count():
    # Get the user input as strings
    string = entry1.get()
    char = entry2.get()
    # Check if the input is valid
    if string and char and len(char) == 1:
        # Count the occurrences of the character in the string using count() method
        count = string.count(char)
        # Display the result in the label
        result_label.config(text="The character " + char + " occurs " + str(count) + " times in the string.")
    else:
        # Display an error message in the label
        result_label.config(text="Invalid input")

# Create a button to trigger the count function
button = tk.Button(root, text="Count", command=count)
# Place the button on the window
button.place(x=130, y=70)

# Create a label to display the result
result_label = tk.Label(root, text="")
# Place the label on the window
result_label.place(x=10, y=110)

# Start the main loop of the window
root.mainloop()
