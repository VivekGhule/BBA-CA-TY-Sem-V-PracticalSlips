# Import tkinter module
import tkinter as tk

# Create a root window
root = tk.Tk()

# Create a listbox widget
listbox = tk.Listbox(root, selectmode=tk.EXTENDED)

# Create a list of items to add to the listbox
items = ["Apple", "Banana", "Cherry", "Mango", "Orange"]

# Loop through the items and insert them into the listbox
for item in items:
    listbox.insert(tk.END, item)

# Define a function to add a new item to the listbox
def add_item():
    # Get the input from the entry widget
    new_item = entry.get()
    # Check if the input is not empty
    if new_item:
        # Insert the new item at the end of the listbox
        listbox.insert(tk.END, new_item)
        # Clear the entry widget
        entry.delete(0, tk.END)

# Define a function to print the selected items from the listbox
def print_item():
    # Get the indices of the selected items
    selection = listbox.curselection()
    # Loop through the indices and print the corresponding items
    for index in selection:
        print(listbox.get(index))

# Define a function to delete the selected items from the listbox
def delete_item():
    # Get the indices of the selected items in reverse order
    selection = reversed(listbox.curselection())
    # Loop through the indices and delete the corresponding items
    for index in selection:
        listbox.delete(index)

# Create an entry widget to enter a new item
entry = tk.Entry(root)
# Create a button to add the new item to the listbox
add_button = tk.Button(root, text="Add", command=add_item)
# Create a button to print the selected items from the listbox
print_button = tk.Button(root, text="Print", command=print_item)
# Create a button to delete the selected items from the listbox
delete_button = tk.Button(root, text="Delete", command=delete_item)

# Pack the widgets
listbox.pack()
entry.pack()
add_button.pack()
print_button.pack()
delete_button.pack()

# Start the main loop
root.mainloop()
