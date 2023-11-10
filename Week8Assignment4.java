/* Write a program to print symmetric Pascal's triangle of "*" 's of  height "l" of odd length . If input "l" is even then your program will print "Invalid line number".

For example:

input : 5
output:
  *
 * *
* * *
 * *
  *
input : 6

output:

Invalid line number*/

import java.util.*;

public class Week8Assignment4 {
  public static void main(String[] args) {
    Scanner inr = new Scanner(System.in);
    int l = inr.nextInt();
    // Add the necessary code in the below space
    int k;
    if (l % 2 == 0) // To check input is valid or not
      System.out.print("Invalid line number");
    else {
      for (int i = 0; i < l; i++) {
        k = 0;
        if (i <= l / 2) {
          for (int j = l - i; j > l / 2 + 1; j--) {
            System.out.print(" ");
          }
          while (k < (i + 1)) {
            System.out.print("*" + " "); // printing star
            k++;
          }
        } else {
          for (int j = l - i; j < l / 2 + 1; j++)
            System.out.print(" ");
          while (k < (l - i)) { // Printing Star and space
            if (k == l - i - 1)
              System.out.print("*");
            else {
              System.out.print("*");
              System.out.print(" ");
            }
            k++;
          }
        }
        if (i != l - 1)
          System.out.println(); // moving onto next line
      }
    }
  }
}