/*Complete the following program that is intended to find and print sum of all unique elements in a sorted array 'arr[ ]'

Note: Integer array 'arr[]' is already defined and initialized*/

import java.util.Scanner;

public class Set2_Q2 {
  public static void main(String args[]) {
    int arr[] = new int[20];

    // Array initialization is hidden
    int x[] = { 5, 5, 6, 6, 7, 8 };
    int y[] = { 1, 1, 2, 2, 3, 3 };
    Scanner sc = new Scanner(System.in);
    if (sc.nextInt() == 1) {
      arr = x;
    } else {
      arr = y;
    }
    // write code here
    int sum = arr[0];
    for (int i = 0; i < arr.length - 1; i++)
      if (arr[i] != arr[i + 1]) // checking unique element or not
        sum = sum + arr[i + 1]; // summation of unique elements
    System.out.print(sum);
  }
}