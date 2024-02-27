# Import the tkinter module for GUI
import tkinter as tk

# Create a root window
root = tk.Tk()
# Set the title of the window
root.title("Sphere Volume Calculator")
# Set the size of the window
root.geometry("300x200")

# Create a label to display the instruction
label = tk.Label(root, text="Enter the radius of the sphere:")
# Place the label on the window
label.place(x=10, y=10)

# Create an entry widget to accept the user input
entry = tk.Entry(root)
# Place the entry widget on the window
entry.place(x=180, y=10)

# Create a function to calculate the volume of the sphere
def calculate():
    # Get the user input as a string
    radius = entry.get()
    # Try to convert the string to a float
    try:
        # Convert the string to a float
        r = float(radius)
        # Calculate the volume of the sphere using the formula
        # V = 4/3 * pi * r^3
        volume = (4/3) * 3.14 * (r**3)
        # Display the result in the label
        result_label.config(text="The volume of the sphere is: " + str(round(volume, 2)))
    except ValueError:
        # Handle the exception if the input is not a valid number
        # Display an error message in the label
        result_label.config(text="Invalid input")

# Create a button to trigger the calculation
button = tk.Button(root, text="Calculate", command=calculate)
# Place the button on the window
button.place(x=130, y=40)

# Create a label to display the result
result_label = tk.Label(root, text="")
# Place the label on the window
result_label.place(x=10, y=80)

# Start the main loop of the window
root.mainloop()
