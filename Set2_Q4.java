/*Complete the program to find and print the smallest missing element from a sorted array "arr[]".

NOTE: Non-negative distinct Integer array is already defined and initialized.

For example:
arr[] = [1, 2, 3, 4, 5, 6]

output : 0

arr [ ] =   [0 ,1, 2, 3, 5, 6 ]

output : 4*/

import java.util.Scanner;

public class Set2_Q4 {

  // write findMissing(int arr[], int left , int right) function to find the
  // smallest missing element
  public static int findMissing(int arr[], int left, int right) {
    for (int i = 0; i < arr.length - 1; i++)
      if (arr[i] != i) // checking missing element
        return i; // returning missing element
    return arr[left];
  }

  public static void main(String args[]) {
    int arr[] = new int[20];
    // Array initialization is hidden
    int x[] = { 0, 1, 2, 5, 7, 8 };
    int y[] = { 1, 2, 3, 4 };
    Scanner sc = new Scanner(System.in);
    if (sc.nextInt() == 1) {
      arr = x;
    } else {
      arr = y;
    }
    System.out.println(findMissing(arr, 0, arr.length - 1));
  }
}