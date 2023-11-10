/*Complete the code segment to print the following using the concept of extending the Thread class in Java:

-----------------OUTPUT-------------------

Thread is Running.

-------------------------------------------------

*/

// Write the appropriate code to extend the Thread class to complete the class Week6Assignment1.
public class Week6Assignment1 extends Thread { // Extending Class
  public void start() {
    System.out.print("Thread is Running."); // Printing Output
  }

  public static void main(String args[]) {

    // Creating object of thread class
    Week6Assignment1 thread = new Week6Assignment1();

    // Start the thread
    thread.start();
  }
}