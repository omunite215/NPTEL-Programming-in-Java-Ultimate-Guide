import java.util.Scanner;

public class Week1Assignment1 {
    public static void main(String[] args) {
        // using Scanner Class to take input
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double perimeter;
        double area;
        // If case to check whether input is zero or not
        if (radius <= 0) {
            System.out.println("please enter non zero positive number ");
        } else {
            // Logic for Perimeter
            perimeter = 2 * Math.PI * radius;
            // Logic for Area
            area = Math.PI * radius * radius;
            System.out.println(perimeter);
            System.out.println(area);
        }
    }
}