/* Complete the following code fragment to read three integer values from the keyboard and find the sum of the values. Declare a variable "sum" of type int and store the result in it.*/

// Write the appropriate statement(s) to import the package(s) you need in your program
import java.util.*;//HeaderFile To Use Util Scanner

public class Week7Assignment1 {
  public static void main(String[] args) {
    int num1, num2, num3, sum = 0;// Initialization
    // Write the appropriate code to read the 3 integer values and find their sum.
    Scanner in = new Scanner(System.in);
    num1 = in.nextInt();// 1st Input
    num2 = in.nextInt();// 2nd Input
    num3 = in.nextInt();// 3rd Input
    sum = num1 + num2 + num3;// Calculating Sum
    System.out.println(sum);
  }
}