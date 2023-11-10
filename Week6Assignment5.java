/* Add necessary codes to print the following:


-----------------OUTPUT-------------------

Name of thread 't1':Thread-0

Name of thread 't2':Thread-1

New name of thread 't1':Week 6 Assignment Q5

New name of thread 't2':Week 6 Assignment Q5 New

-------------------------------------------------*/

public class Week6Assignment5 extends Thread {
  public void run() {

  }

  public static void main(String args[]) {
    Week6Assignment5 t1 = new Week6Assignment5();
    System.out.println("Name of thread 't1':" + t1.getName());

    Week6Assignment5 t2 = new Week6Assignment5();
    System.out.println("Name of thread 't2':" + t2.getName());

    t1.setName("Week 6 Assignment Q5"); // Setting Name for t1
    t2.setName("Week 6 Assignment Q5 New"); // Setting Name for t2
    System.out.println("New name of thread 't1':" + t1.getName());
    System.out.println("New name of thread 't2':" + t2.getName());

  }
}