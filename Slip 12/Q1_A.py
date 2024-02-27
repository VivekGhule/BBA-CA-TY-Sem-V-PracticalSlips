# import tkinter module
import tkinter as tk

# create a root window
root = tk.Tk()

# set the title and size of the window
root.title("Label Example")
root.geometry("300x200")

# create a label widget
label = tk.Label(root, text="Hello, world!")

# change the font style of the label
label.config(font=("Courier", 15, "bold"))

# place the label in the center of the window
label.pack()

# start the main loop
root.mainloop()
