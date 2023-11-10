import java.util.Scanner;

public class Week1Assignment2 {
    public static void main(String[] args) {
        // using Scanner Class to take input
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
        // Logic to find greatest number of all three
        if (x >= y && x >= z) {
            result = x;
        } else if (y >= z) {
            result = y;
        } else {
            result = z;
        }
        // Evaluation code
        System.out.println(result); // output
    }
}