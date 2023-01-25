/* An interface "Square" is defined in the following program. You have to declare a class "A", which will implement the interface "Square".
Note that the method " findSquare(n)" will return the square of the number n. */

import java.util.Scanner;
interface Square {
    int findSquare(int i);  // Returns the square of a number
}

//Create a class A which implements the interface Square.
class A implements Square{
    //Define a method to find the square of a number
public int findSquare(int i){
    int ans = i*i;
    return ans;//returning square value
  }
}
public class Set1_Q3{ 
     public static void main (String[] args){ 
           A a = new A();   //Create an object of class A
           // Read a number from the keyboard
           Scanner sc = new Scanner(System.in);  
           int n = sc.nextInt();
           System.out.print(a.findSquare(n)); 
    } 
}