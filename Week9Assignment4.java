/* A program needs to be developed which can mirror reflect any 5 � 5 2D character array into its side-by-side reflection. Write suitable code to achieve this transformation as shown below:

 INPUT:                                       OUTPUT:
               OOXOO                                        OOXOO
               OOXOO                                        OOXOO
               XXXOO                                        OOXXX
               OOOOO                                        OOOOO
               XOABC                                        CBAOX

Note the following points carefully:
1. Here, instead of X and O any character may be present.

2. The input and output array size must be of dimension 5 � 5 and nothing else.
3. Only side-by-side reflection should be performed i.e. ABC || CBA.*/

import java.util.Scanner;

public class Week9Assignment4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // Declare necessary variables

    String a[] = new String[5];

    char r[][] = new char[5][5];

    int i, j, k = 0;
    // Input 5x5 2D Array using Scanner Class
    for (j = 0; j < 5; j++)
      a[j] = sc.nextLine();
    // Perform the reflection operation
    for (i = 0; i < 5; i++)
      for (j = 4, k = 0; j >= 0; j--, k++)
        r[i][k] = a[i].charAt(j);
    // Output 5x5 2D Reflection Array
    for (i = 0; i < 5; i++) {
      for (k = 0; k < 5; k++)
        System.out.print(r[i][k]);
      System.out.println();

    }
  } // The main() method ends here
} // The main class end