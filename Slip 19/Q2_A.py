# import tkinter module
import tkinter as tk

# create a function show_table that takes an entry widget as a parameter
def show_table(entry):
    # get the number from the entry widget
    num = int(entry.get())
    # create an empty string to store the table
    table = ""
    # loop from 1 to 10
    for i in range(1, 11):
        # append the product of num and i to the table
        table += f"{num} x {i} = {num * i}\n"
    # create a message box to display the table
    tk.messagebox.showinfo(f"Multiplication table of {num}", table)

# create a main window
window = tk.Tk()
# set the title of the window
window.title("Multiplication table")
# create a label to prompt the user
label = tk.Label(window, text="Enter a number:")
# create an entry widget to get the user input
entry = tk.Entry(window)
# create a button to trigger the show_table function
button = tk.Button(window, text="Show table", command=lambda: show_table(entry))
# place the widgets on the window using grid layout
label.grid(row=0, column=0, padx=10, pady=10)
entry.grid(row=0, column=1, padx=10, pady=10)
button.grid(row=1, column=0, columnspan=2, padx=10, pady=10)
# start the main loop
window.mainloop()
