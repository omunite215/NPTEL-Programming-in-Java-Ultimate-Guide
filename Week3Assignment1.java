
/* This program is related to the generation of Fibonacci numbers.

For example: 0,1, 1,2, 3,5, 8, 13,� is a Fibonacci sequence where 13 is the 8th Fibonacci number. */
import java.util.Scanner;

public class Week3Assignment1 {

    public static void main(String args[]) {
        // using Scanner Class to take input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    // Template code:
    static int fib(int n) {

        if (n == 1) // Terminal condition
            return 0;
        else if (n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2); // Recursive call of function

    }
}