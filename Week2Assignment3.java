//Complete the code segment to call print() method of class Question by creating a method named �studentMethod()�.
// This is the main class Question
public class Week2Assignment3 {
    public static void main(String[] args) {
        // Object of the main class is created
        Week2Assignment3 q = new Week2Assignment3();
        // Print method on object of Question class is called
        q.studentMethod();
    }

    // 'print()' method is defined in class Question
    void print(Week2Assignment3 object) {
        System.out.print("Well Done!");
    }

    public void studentMethod() { // Creating Method
        Week2Assignment3 q = new Week2Assignment3();
        q.print(q); // Calling Print Method
    }
}