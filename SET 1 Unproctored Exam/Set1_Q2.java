/*In the following program, an array of type integer (arr[]) is declared. The array can store any integer value. Complete the program  to print the average value of all the odd numbers stored in the array (arr[] ).
Note: Integer type array 'arr[]' is already defined and initialized. Use double type variables wherever applicable.*/

import java.util.Scanner;
public class Set1_Q2{
	public static void main(String args[]){

        int arr[] = new int[6];

        // Array initialization is hidden

        int x[]	= {4,9,33,18,0,76};
        int y[]	= {45,0,7,324,545,57};
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt()==1){
	    arr = x;
        }else{
            arr = y;
        }

//Use for or while loop do the operation.
Scanner in =new Scanner(System.in);
double sum=0,oddcount=0; //declaring counter and sum variables
for(int i=0; i<arr.length;i++){ //to check odd number and calculating sum
  if(arr[i] % 2 !=0){ 
    sum = sum + arr[i];
    oddcount++; //counting no. of odd numbers
  }
  else
    continue;
}
double result = sum/oddcount; //calculating average value
System.out.print(result); //printing average value

 }
}
