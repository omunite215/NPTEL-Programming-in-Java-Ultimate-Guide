/* Problem statement:

Complete the code to perform a 45 degree anti clock wise rotation with respect to the center of a 5 � 5 2D Array as shown below:

INPUT:


              00100

              00100

              11111

              00100

              00100


OUTPUT:



              10001

              01010

              00100

              01010

              10001


Note the following points carefully:
1. Here, instead of 0 and 1 any character may be given.

2. The input and output array size must be of dimension 5 � 5 and nothing else.*/

import java.util.Scanner;

public class Week9Assignment3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String arr[] = new String[5];

    for (int i = 0; i < 5; i++)

      arr[i] = sc.nextLine(); // Input 5X5 2D Array using Scanner Class
    char matrix[][] = new char[5][5];
    for (int i = 0; i < 5; i++) {
      char[] chararray = arr[i].toCharArray();
      for (int j = 0; j < 5; j++) {
        matrix[i][j] = chararray[j];
      }
    }
    char newmatrix[][] = new char[5][5];
    for (int i = 0; i < 5; i++) // Perform 45-Degree rotation keeping center same (use your own logic)
    {
      for (int j = 0; j < 5; j++) {
        if (i == 0 && j < 3)
          newmatrix[i][j + 2] = matrix[i][j];
        else if (i == 0 && j == 3)
          newmatrix[i + 1][j + 1] = matrix[i][j];
        else if (i < 3 && j == 4)
          newmatrix[i + 2][j] = matrix[i][j];
        else if (i == 3 && j == 4)
          newmatrix[i + 1][j - 1] = matrix[i][j];
        else if (i == 4 && j > 1)
          newmatrix[i][j - 2] = matrix[i][j];
        else if (i == 4 && j == 1)
          newmatrix[i - 1][j - 1] = matrix[i][j];
        else if (i > 1 && j == 0)
          newmatrix[i - 2][j] = matrix[i][j];
        else if (i == 1 && j == 0)
          newmatrix[i - 1][j + 1] = matrix[i][j];
        else if (i == 1 && j > 0 && j < 4) {

          if (j == 3)

            newmatrix[i + 1][j] = matrix[i][j];

          else

            newmatrix[i][j + 1] = matrix[i][j];

        }

        else if (i == 2 && j > 0 && j < 4) {

          if (j == 2)

            newmatrix[i][j] = matrix[i][j];

          else if (j == 3)

            newmatrix[i + 1][j] = matrix[i][j];

          else

            newmatrix[i - 1][j] = matrix[i][j];
        } else {
          if (j == 1)

            newmatrix[i - 1][j] = matrix[i][j];
          else
            newmatrix[i][j - 1] = matrix[i][j];
        }
      }
    }
    for (int i = 0; i < 5; i++) { // Print the transformed output 5X5 2D Array
      for (int j = 4; j >= 0; j--)
        System.out.print(newmatrix[i][j]);
      System.out.println();
    }
  } // The main() method ends here
} // The main class ends here