
/* In the following program, there may be multiple exceptions. You have to complete the code using only one try-catch block to handle all the possible exceptions.

For example, if user�s input is 1, then it will throw and catch �java.lang.NullPointerException�.*/
import java.util.Scanner;

public class Week5Assignment5 {
   public static void main(String args[]) {
      // using Scanner Class to take input
      Scanner scan = new Scanner(System.in);
      int i = scan.nextInt();
      int j;
      // Put the following code under try-catch block to handle exceptions
      try {
         switch (i) {
            case 0:
               int zero = 0;
               j = 92 / zero;
               break;
            case 1:
               int b[] = null;
               j = b[0];
               break;
            default:
               System.out.print("No exception"); // Default Message
         }
      }
      // catch block
      catch (Exception e) {
         System.out.print(e); // Exception Message
      }
   }
}