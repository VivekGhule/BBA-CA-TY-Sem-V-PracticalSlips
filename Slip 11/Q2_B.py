import tkinter as tk

# create a root window
root = tk.Tk()
root.title("Color Menu")
root.geometry("300x200")

# create a frame to display the background color
frame = tk.Frame(root)
frame.pack(fill="both", expand=True)

# create a list of color names and codes
colors = [("Red", "#ff0000"), ("Green", "#00ff00"), ("Blue", "#0000ff"),
          ("Yellow", "#ffff00"), ("Magenta", "#ff00ff"), ("Cyan", "#00ffff")]

# create a function to change the background color of the frame
def change_color(color):
    frame.config(bg=color)

# create a menu bar
menubar = tk.Menu(root)

# create a color menu and add it to the menu bar
colormenu = tk.Menu(menubar, tearoff=0)
for name, code in colors:
    # add a command to the color menu for each color
    colormenu.add_command(label=name, command=lambda c=code: change_color(c))
menubar.add_cascade(label="Colors", menu=colormenu)

# configure the root window to use the menu bar
root.config(menu=menubar)

# start the main loop
root.mainloop()
