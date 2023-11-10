//Complete the code segment to call the method  print() of class Student first and then call print() method of class School.
// This is the class named School
class School {
    // This is a method in class School
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
}

// This is the class named Student
class Student {
    // This is a method in class Student
    public void print() {
        System.out.println("Hi! I am class STUDENT");
    }
}

public class Week2Assignment1 {
    public static void main(String args[]) {

        // Creating object of class Student
        Student student = new Student();
        // Call 'print()' method of class Student
        student.print();
        // Creating object of class School
        School school = new School();
        // Call 'print()' method of class School
        school.print();
    }
}