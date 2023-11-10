/* In the following program, a thread class Week6Assignment2 is created using the Runnable interface Complete the main() to create a thread object of the class Week6Assignment2 and run the thread. It should print the output as given below.

 

-----------------OUTPUT-------------------

Welcome to Java Week 6 New Question.

Main Thread has ended.

-------------------------------------------------*/
public class Week6Assignment2 implements Runnable {

  @Override
  public void run() {
    System.out.print(Thread.currentThread().getName() + " has ended.");
  }

  // Create main() method and appropriate statements in it

  public static void main(String args[]) {

    System.out.println("Welcome to Java Week 6 New Question.");
    Week6Assignment2 Runnable = new Week6Assignment2(); // Creating object of thread class
    Thread Rename = new Thread(Runnable); // Creating Thread
    Rename.setName("Main Thread"); // Renaming Thread
    Rename.start(); // Executing Thread
  }
}