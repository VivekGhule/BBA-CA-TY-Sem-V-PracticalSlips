# Importing the required modules
import math
import tkinter as tk

# Creating a class that inherits from tk.Frame
class CylinderApp(tk.Frame):

    # Creating a constructor
    def __init__(self, master=None):
        # Calling the parent constructor
        super().__init__(master)
        # Setting the title and size of the window
        self.master.title("Cylinder Calculator")
        self.master.geometry("400x300")
        # Creating the widgets
        self.create_widgets()
        # Packing the frame
        self.pack()

    # A method to create the widgets
    def create_widgets(self):
        # Creating labels for instructions and results
        self.label1 = tk.Label(self, text="Enter the dimensions of the cylinder:")
        self.label2 = tk.Label(self, text="Surface Area:")
        self.label3 = tk.Label(self, text="Volume:")
        # Creating entry widgets for radius and height
        self.entry1 = tk.Entry(self)
        self.entry2 = tk.Entry(self)
        # Creating labels for units
        self.label4 = tk.Label(self, text="cm")
        self.label5 = tk.Label(self, text="cm")
        self.label6 = tk.Label(self, text="cm^2")
        self.label7 = tk.Label(self, text="cm^3")
        # Creating a button to calculate the results
        self.button = tk.Button(self, text="Calculate", command=self.calculate)
        # Creating labels to display the results
        self.result1 = tk.Label(self, text="0.00")
        self.result2 = tk.Label(self, text="0.00")
        # Placing the widgets using grid layout
        self.label1.grid(row=0, column=0, columnspan=4, pady=10)
        self.label2.grid(row=1, column=0, padx=10, sticky="e")
        self.result1.grid(row=1, column=1, sticky="w")
        self.label6.grid(row=1, column=2, sticky="w")
        self.label3.grid(row=2, column=0, padx=10, sticky="e")
        self.result2.grid(row=2, column=1, sticky="w")
        self.label7.grid(row=2, column=2, sticky="w")
        self.entry1.grid(row=3, column=1, padx=10, pady=10, sticky="w")
        self.entry2.grid(row=4, column=1, padx=10, pady=10, sticky="w")
        self.label4.grid(row=3, column=2, sticky="w")
        self.label5.grid(row=4, column=2, sticky="w")
        self.button.grid(row=5, column=0, columnspan=4, pady=10)

    # A method to calculate the surface area and volume of the cylinder
    def calculate(self):
        # Getting the input from the entry widgets
        radius = float(self.entry1.get())
        height = float(self.entry2.get())
        # Calculating the surface area and volume using the formulas
        surface_area = 2 * math.pi * radius * (radius + height)
        volume = math.pi * radius**2 * height
        # Updating the result labels with the calculated values
        self.result1.config(text=f"{surface_area:.2f}")
        self.result2.config(text=f"{volume:.2f}")

# Creating the main window
root = tk.Tk()
# Creating an object of the CylinderApp class
app = CylinderApp(master=root)
# Starting the main loop
app.mainloop()
