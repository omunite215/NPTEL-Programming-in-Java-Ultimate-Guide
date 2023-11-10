/*Complete the program to count the number of possible triangles from a given sorted array of positive integers("arr[]").

Note: The triangle inequality states that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.

Note: Integer array arr[ ] is already defined and initialized.*/

import java.util.Scanner;

public class Set2_Q5 {
  public static void main(String args[]) {
    int arr[] = new int[20];

    // Array initialization is hidden
    int x[] = { 1, 3, 5, 7, 9 };
    int y[] = { 5, 5, 6, 6, 7, 8 };
    Scanner sc = new Scanner(System.in);
    if (sc.nextInt() == 1) {
      arr = x;
    } else {
      arr = y;
    }
    // Write the code
    int counter = 0;
    for (int i = 0; i < arr.length - 1; i++) { // for 1st side
      for (int j = i + 1; j < arr.length; j++) // for 2nd side
        for (int k = j + 1; k < arr.length; k++) // for 3rd side
          if (arr[i] + arr[j] >= arr[k]) // checking
            counter++;
    }
    System.out.print(counter);// printing count
  }
}