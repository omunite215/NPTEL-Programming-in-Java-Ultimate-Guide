
/* Complete the code segment to check whether the number is an Armstrong number or not.

Armstrong Number:

A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 13+53+33, 370, 371, 407, etc*/
import java.util.Scanner;
public class Week1Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp = n;
        int c = 0, t;
        // Use while loop to check the number is Armstrong or not.
        while (n > 0) {
            t = n % 10; // Starting from Last digit of input by extracting remainder after division by
                        // 10.
            n = n / 10;
            c = c + (t * t * t);
        }
        if (temp == c) // checking armstrong number
            result = 1;
        else
            result = 0;
        // Evaluation code
        System.out.println(result); // output
    }
}