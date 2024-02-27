// create a package TYBBACA
package TYBBACA;

// create a class Student with fields Rno, SName and Per
class Student {
  int Rno;
  String SName;
  double Per;

  // create a constructor that takes the roll number, name and percentage as parameters
  public Student(int Rno, String SName, double Per) {
    this.Rno = Rno;
    this.SName = SName;
    this.Per = Per;
  }

  // create a method disp() to display the details of the student
  public void disp() {
    System.out.println("Roll number: " + Rno);
    System.out.println("Name: " + SName);
    System.out.println("Percentage: " + Per);
  }

  // create a finalize() method to perform cleanup actions
  public void finalize() {
    System.out.println("Student object is garbage collected");
  }
}

// create a class Teacher with fields TID, TName and Subject
class Teacher {
  int TID;
  String TName;
  String Subject;

  // create a constructor that takes the teacher id, name and subject as parameters
  public Teacher(int TID, String TName, String Subject) {
    this.TID = TID;
    this.TName = TName;
    this.Subject = Subject;
  }

  // create a method disp() to display the details of the teacher
  public void disp() {
    System.out.println("Teacher ID: " + TID);
    System.out.println("Name: " + TName);
    System.out.println("Subject: " + Subject);
  }

  // create a finalize() method to perform cleanup actions
  public void finalize() {
    System.out.println("Teacher object is garbage collected");
  }
}

// create a class Test to test the classes Student and Teacher
class Test {

  // create a main method
  public static void main(String[] args) {
    // create an array of Student objects
    Student[] students = new Student[3];
    // initialize the array with some sample data
    students[0] = new Student(101, "Alice", 85.5);
    students[1] = new Student(102, "Bob", 90.0);
    students[2] = new Student(103, "Charlie", 80.0);

    // create an array of Teacher objects
    Teacher[] teachers = new Teacher[2];
    // initialize the array with some sample data
    teachers[0] = new Teacher(201, "David", "Java");
    teachers[1] = new Teacher(202, "Eve", "Python");

    // display the details of N students using a for loop
    System.out.println("Details of N students:");
    for (int i = 0; i < students.length; i++) {
      students[i].disp();
      System.out.println();
    }

    // display the details of the teacher who is teaching Java subject using a for loop
    System.out.println("Details of the teacher who is teaching Java subject:");
    for (int i = 0; i < teachers.length; i++) {
      // check if the teacher's subject is Java
      if (teachers[i].Subject.equals("Java")) {
        teachers[i].disp();
        System.out.println();
      }
    }

    // invoke the garbage collector to call the finalize() methods
    System.gc();
  }
}
