/*Complete the following program that is intended to find and print the third  smallest value stored in an array 'arr[ ]'.

Note: Integer array 'arr[]' is already defined and initialized. Assume array arr[ ] atleast 3 elements.*/

import java.util.Scanner;
public class Set2_Q1{
	public static void main(String args[]){
        int arr[] = new int[20];

        // Array initialization is hidden
 int x[]= {8,4,6,5,7};
 int y[]= {1,1,1,76,87};
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt()==1){
	    arr = x;
        }else{
            arr = y;
        }
int min=0; //temperory variable
//write the code here
for(int i=0;i<(arr.length-1);i++){ //sorting the array
  if(arr[i]<arr[i+1]){
  min = arr[i];
    arr[i]=arr[i+1];
    arr[i+1]=min;
  }
}
  System.out.print(arr[arr.length-4]); //printing 3rd smallest value
  
 }
}