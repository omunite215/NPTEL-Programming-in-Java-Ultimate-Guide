/* Problem statement:

Complete the code to develop a BASIC CALCULATOR that can perform operations like Addition, Subtraction, Multiplication and Division.

Note the following points carefully:
1. Use only double datatype to store calculated numeric values.
2. Assume input to be of integer datatype.
3. The output should be rounded using Math.round() method.
4. Take care of the spaces during formatting output (e.g., single space each before and after =).
5. The calculator should be able to perform required operations on a minimum of two operands as shown in the below example:

Input:
                       5+6 

Output:
                       5+6 = 11 */

import java.util.Scanner;

public class Week9Assignment1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine(); // Read as string, e.g., 5+6

    // Declare and initialize the required variable(s)
    int i = 0;
    int j = 0;
    double k = 0;
    // Split the input string into character array

    char s[] = input.toCharArray();

    /*
     * 
     * Write your method to separate two operands
     * 
     * and operators and then perform the required operation.
     * 
     */

    for (int a = 0; a < s.length; a++) {

      if (s[a] == '+')

      {
        // A part of String is called substring. In other words, substring is a subset
        // of another String. Java String class provides the built-in substring() method
        // that extract a substring from the given string by using the index values
        // passed as an argument. In case of substring() method startIndex is inclusive
        // and endIndex is exclusive.
        i = Integer.parseInt(input.substring(0, a));

        j = Integer.parseInt(input.substring(a + 1, s.length));

        k = (double) i + j;

      }

      else if (s[a] == '-')

      {
        i = Integer.parseInt(input.substring(0, a));
        j = Integer.parseInt(input.substring(a + 1, s.length));
        k = (double) i - j;
      }

      else if (s[a] == '*') {
        i = Integer.parseInt(input.substring(0, a));
        j = Integer.parseInt(input.substring(a + 1, s.length));
        k = (double) i * j;
      } else if (s[a] == '/') {
        i = Integer.parseInt(input.substring(0, a));
        j = Integer.parseInt(input.substring(a + 1, s.length));
        k = (double) i / j;
      }
    }
    // Print the output as stated in the question
    System.out.print(input + " = " + Math.round(k));
  }
}