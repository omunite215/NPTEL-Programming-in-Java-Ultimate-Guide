/* Write a program which will print a pyramid of "numbers" 's of height "n" and print the sum of all number's in the pyramid.

For example:

input: 5

output: 
        1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
95 */

import java.util.*;

public class Week8Assignment3 {
  public static void main(String[] args) {
    Scanner inr = new Scanner(System.in);
    int n = inr.nextInt();
    // Add the necessary code in the below space
    int i, j, a, b, t = 1, sum = 0;
    b = n - 1;
    for (i = 1; i <= n; i++) // Nested for loop
    {
      int begin = 1;
      for (j = 1; j <= b; j++) {
        System.out.print("  "); // adding space before printing stars on the next line
      }
      for (a = 1; a <= t; a++) {
        System.out.print(begin + " "); // adding numbers with space
        sum = begin + sum;
        begin++;
      }
      b--;
      t += 2;
      System.out.print("\n"); // moving onto next line
    }
    System.out.println(sum); // printing sum

  }
}