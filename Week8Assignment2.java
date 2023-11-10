/*Write a program which will print a pascal  pyramid of  "*" 's of height "l" .

For example:

input: 8

output :
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 
*/

import java.util.*;

public class Week8Assignment2 {
  public static void main(String[] args) {
    Scanner inr = new Scanner(System.in);
    int l = inr.nextInt();
    // Add the necessary code in the below space
    for (int i = 0; i < l; i++)// Nested For loop
    {
      for (int j = l - i; j > 1; j--) {
        System.out.print(" "); // adding space before printing stars on the next line
      }
      for (int j = 0; j <= i; j++) // loop to print star with space
      {
        System.out.print("* ");
      }
      System.out.println(); // moving onto next line
    }
  }
}