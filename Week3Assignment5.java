
/* Complete the code segment to swap two numbers using call by object reference.

Sample Test Cases
Input	Output
Test Case 1	
10 20
20 10
Test Case 2	
11 29
29 11
Test Case 3	
10 20
20 10 */
import java.util.Scanner;

class Question { // Define a class Question with two elements e1 and e2.
    Scanner sc = new Scanner(System.in);
    int e1 = sc.nextInt(); // Read e1
    int e2 = sc.nextInt(); // Read e2
}

public class Week3Assignment5 {

    // Template code
    // Define static method swap()to swap the values of e1 and e2 of class T.
    public static void swap(Question t) {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }

    public static void main(String[] args) {
        // Create an object of class Question
        Question t = new Question();
        // Call the method swap()
        swap(t);

        System.out.println(t.e1 + " " + t.e2);
    }

}