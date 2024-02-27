# import tkinter module
import tkinter as tk

# create a main window
window = tk.Tk()
# set the title of the window
window.title("Label Example")
# create a label with some text and font style
label = tk.Label(window, text="Hello, world!", font=("Arial", 20, "bold"))
# place the label on the window
label.pack()
# start the main loop
window.mainloop()
