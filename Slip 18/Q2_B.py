# Python script to define the class person having members name, address
# and create a subclass called Employee with members staffed salary

# Define the class person
class person:
    # Initialize the attributes name and address
    def __init__(self, name, address):
        self.name = name
        self.address = address

    # Display the details of the person
    def display(self):
        print("Name:", self.name)
        print("Address:", self.address)

# Define the subclass Employee that inherits from person
class Employee(person):
    # Initialize the attribute salary in addition to name and address
    def __init__(self, name, address, salary):
        # Call the parent class constructor
        super().__init__(name, address)
        self.salary = salary

    # Display the details of the employee
    def display(self):
        # Call the parent class display method
        super().display()
        print("Salary:", self.salary)

# Create 'n' objects of the Employee class
n = int(input("Enter the number of employees: "))
employees = [] # A list to store the employee objects
for i in range(n):
    # Take the input for each employee
    print("Enter the details of employee", i+1)
    name = input("Enter the name: ")
    address = input("Enter the address: ")
    salary = float(input("Enter the salary: "))
    # Create an employee object with the input data
    emp = Employee(name, address, salary)
    # Append the object to the list
    employees.append(emp)

# Display all the details of the employees
print("The details of the employees are:")
for emp in employees:
    emp.display()
    print()
