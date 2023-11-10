/* Write a program which will print a pyramid of "*" 's of height "n" and print the number of "*" 's in the pyramid.

For example:

Input : 5
Output:  

        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
25 */

import java.util.*;

public class Week8Assignment1 {
  public static void main(String[] args) {
    Scanner inr = new Scanner(System.in);
    int n = inr.nextInt();
    // Add the necessary code in the below space
    int a = 0, b = 0;// declaration and initialization
    for (int i = 1; i <= n; ++i, a = 0) { // Nested For Loop for chracter spacing
      for (int j = 1; j <= n - i; ++j) {
        System.out.print("  ");
      }
      while (a != 2 * i - 1) { // Loop to print Star
        System.out.print("* ");
        b = b + 1;
        ++a;
      }
      System.out.println(); // moving onto nextline after printing stars
    }
    System.out.println(b); // printing final value of b at the end
  }
}