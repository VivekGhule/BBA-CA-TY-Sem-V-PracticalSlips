#Define the class Student
class Student:
    #Initialize the attributes student_name and marks
    def __init__(self, student_name, marks):
        self.student_name = student_name
        self.marks = marks

    #Print the attribute values
    def print_attributes(self):
        print("Student name:", self.student_name)
        print("Marks:", self.marks)

#Create an instance of the class Student
student1 = Student("Raj", 85)

#Print the original attribute values
print("Original attribute values:")
student1.print_attributes()

#Modify the attribute values
student1.student_name = "Rajesh"
student1.marks = 90

#Print the modified attribute values
print("Modified attribute values:")
student1.print_attributes()
