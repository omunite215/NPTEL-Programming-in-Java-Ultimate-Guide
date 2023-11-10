/*A byte char array is initialized. You have to enter an index value"n". According to index your program will print the byte and its corresponding char value.
Complete the code segment to catch the exception in the following, if any. On the occurrence of such an exception, your program should print �exception occur� .If there is no such exception, it will print the required output.*/

import java.util.*;

public class Week7Assignment3 {
    public static void main(String[] args) {
        try {
            byte barr[] = { 'N', 'P', 'T', 'E', 'L', '-', 'J', 'A', 'V', 'A', 'J', 'A', 'N', '-', 'N', 'O', 'C', 'C',
                    'S', 'E' };
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            // Complete the code to get specific indexed byte value and its corresponding
            // char value.
            String str = new String(barr, n, 1);// Creating New String Connecting Byte Array and Input Integer.
            System.out.println(barr[n]);// Output
            System.out.print(str);// Output
        } catch (Exception e) {
            System.out.println("exception occur");
        }
    }
}