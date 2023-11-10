/* Complete the code segment to call the method  print() of class given class Printer to print the following.

--------------------------------
Hi! I am class STUDENT
Hi! I class SCHOOL.
-------------------------------- */
// This is the class named Printer
class Printer {
    // This are the methods in class Printer
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }

    public void print(String s) {
        System.out.println(s);
    }
}

public class Week2Assignment2 {
    public static void main(String[] args) {

        Printer ob = new Printer(); // Creating Object
        ob.print("Hi! I am class STUDENT"); // Initializing String s
        Printer ob1 = new Printer(); // Creating another Object
        ob1.print(); // Calling Function
    }
}