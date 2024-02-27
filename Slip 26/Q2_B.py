# Import the tkinter module
import tkinter as tk

# Define a function to alter the sentence
def alter_sentence():
    # Get the input sentence from the entry widget
    sentence = entry.get()
    # Replace every space with *
    sentence = sentence.replace(" ", "*")
    # Reverse the case of all alphabets
    sentence = sentence.swapcase()
    # Replace digits with ?
    sentence = "".join(["?" if char.isdigit() else char for char in sentence])
    # Display the altered sentence in the label widget
    label.config(text=sentence)

# Create a root window
root = tk.Tk()
# Set the title of the window
root.title("Sentence Alterer")
# Set the size of the window
root.geometry("400x200")

# Create a label widget to display the instruction
instruction = tk.Label(root, text="Enter a sentence:")
# Place the label widget in the window using grid layout
instruction.grid(row=0, column=0, padx=10, pady=10)

# Create an entry widget to accept the input sentence
entry = tk.Entry(root)
# Place the entry widget in the window using grid layout
entry.grid(row=0, column=1, padx=10, pady=10)

# Create a button widget to trigger the alter_sentence function
button = tk.Button(root, text="Alter", command=alter_sentence)
# Place the button widget in the window using grid layout
button.grid(row=1, column=0, columnspan=2, padx=10, pady=10)

# Create a label widget to display the altered sentence
label = tk.Label(root, text="")
# Place the label widget in the window using grid layout
label.grid(row=2, column=0, columnspan=2, padx=10, pady=10)

# Start the main loop of the window
root.mainloop()
