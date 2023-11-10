//Complete the code segment to call default constructor first and then any other constructor in the class.
// This is the main class Question
public class Week2Assignment4 {
    public static void main(String[] args) {
        Answer a = new Answer(10, "MCQ");
    }
}

// This is the class Answer
class Answer {
    // This is the default constructor of the class Answer
    Answer() {
        System.out.println("You got nothing.");
    }

    // This is a parameterized constructor of the class Answer
    Answer(int marks, String type) {
        this(); // The this() constructor call can be used to invoke the current class
                // constructor.
        System.out.print("You got " + marks + " for an " + type);
    }
}