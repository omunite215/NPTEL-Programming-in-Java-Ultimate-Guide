/*Complete the following program that is intended to find and print the duplicate elements in an array 'arr[]'.

Note: Integer array 'arr[]' is already defined and initialized*/

import java.util.Scanner;
public class Set1_Q5{
	public static void main(String args[]){
        int arr[] = new int[20];

   // Array initialization is hidden 
int x[]= {1,2,2,3,4,5,6,7,7,8};
 int y[]= {15,15,23,34,1,2,3,4};
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt()==1){
	    arr = x;
        }else{
            arr = y;
        }
//write the code
for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  //checking duplicate values
                    System.out.println(arr[j]);  //printing the duplicate elements
            }  
        }  
}
}