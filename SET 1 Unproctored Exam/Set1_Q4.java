/*Complete the following program that is intended to find and print the the first element that is strictly greater than given element in an sorted array 'arr[]'. If there is no such element then print "-1".
Note: Integer array 'arr[]' is already defined and initialized*/

import java.util.Scanner;
public class Set1_Q4{
	
// write an appropriate function findnext(int arr[], int target ) which will return the index of the first element that is strictly greater than given element in the given array.
public static int findnext(int arr[],int target){
  for(int i=0;i<arr.length;i++){
    if(arr[i]>target){
      return i; //returning the value
    }
  }
  return -1; //returning -1 if there is no such element
}
public static void main(String args[]){
       
    int arr[]= {5,8,9,23,45,67,89};
Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    if(findnext(arr, n)!=-1)
        System.out.println(arr[findnext(arr, n)]);
    else
       System.out.println(findnext(arr, n));
  }
}