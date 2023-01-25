/*Complete the following program that is intended to find and print the minimum value stored in an array 'arr[]'.

Note: Integer array 'arr[]' is already defined and initialized*/

import java.util.Scanner;
public class Set1_Q1{
	public static void main(String args[]){
        int arr[] = new int[20];

        // Array initialization is hidden
 

int x[]= {8,5,9,45,3,7,10,65,4,9,33,12,6,76};
 int y[]= {324,545,56,78,98,34,22,13};
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt()==1){
	    arr = x;
        }else{
            arr = y;
        }
int min = arr[0]; //declaring minimum value as first element of array
for(int i=0;i<arr.length;i++){

if(arr[i]<min) //condition to find and update the minimum value
  min=arr[i];
}
System.out.print(min); //printing the final minimum value

  }

}