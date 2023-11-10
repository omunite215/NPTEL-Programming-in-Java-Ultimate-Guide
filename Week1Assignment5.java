
//Complete the code segment to help Ragav , find the highest mark and average mark secured by him in "s" number of subjects.
import java.util.Scanner;
public class Week1Assignment5 {
    public static void main(String[] args) {
        // using Scanner Class to take input
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        // define size of array
        s = input.nextInt();
        // The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s]; // s is the number of subjects
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // take s number of inputs
        }
        int max = arr[0];
        double sum = arr[0];
        for (i = 1; i < arr.length; i++) // logic to check highest number and calculating sum
        {
            sum = sum + arr[i];
            if (arr[i] > max)
                max = arr[i]; // storing highest marks
        }

        result = max;
        mark_avg = sum / (arr.length); // Average by dividing sum by length
        System.out.println(result); // Outputs
        System.out.println(mark_avg);
    }
}