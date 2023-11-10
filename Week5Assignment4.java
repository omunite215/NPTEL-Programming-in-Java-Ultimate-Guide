
/* In the following program, an array of integer data to be initialized. During the initialization, if a user enters a value other than integer value, then it will throw InputMismatchException exception. On the occurrence of such an exception, your program should print �You entered bad data.� If there is no such exception it will print the total sum of the array.*/
//Prefixed Fixed Code:
import java.util.*;

public class Week5Assignment4 {
    public static void main(String[] args) {
        // using Scanner Class to take input
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        // create an array to save user input
        int[] name = new int[length];
        int sum = 0;// save the total sum of the array.
        // Define try-catch block to save user input in the array "name",if there is an
        // exception then catch the exception otherwise print the total sum of the
        // array.
        try {
            for (int i = 0; i < length; i++) {
                name[i] = sc.nextInt();
                sum = sum + name[i];
            }
            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("You entered bad data");
        }
    }
}