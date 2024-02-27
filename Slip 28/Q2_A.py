# Import the tkinter module for GUI
import tkinter as tk

# Create a root window
root = tk.Tk()
# Set the title of the window
root.title("Computer Science Courses")
# Set the size of the window
root.geometry("300x200")

# Create a label to display the instruction
label = tk.Label(root, text="Select a course from the list:")
# Place the label on the window
label.place(x=10, y=10)

# Create a listbox widget to display the courses
listbox = tk.Listbox(root, height=10, width=20, bg="white", fg="black")
# Place the listbox on the window
listbox.place(x=150, y=10)

# Create a list of courses
courses = ["Python", "Java", "C++", "Data Structures", "Algorithms", "Database Systems", "Operating Systems", "Artificial Intelligence", "Machine Learning", "Web Development"]

# Use a loop to insert the courses into the listbox
for course in courses:
    listbox.insert(tk.END, course)

# Start the main loop of the window
root.mainloop()
