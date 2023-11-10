/* Complete the code segment to print the current year. Your code should compile successfully.

Note: In this program, you are not allowed to use any import statement. Use should use predefined class Calendar defined in java.util package*/
// The following is the declaration of the main class named Question42
public class Week4Assignment2 {
    public static void main(String args[]) {
        int year; // integer type variable to store year
        // Create an object of Calendar class.
        java.util.Calendar x;
        x = java.util.Calendar.getInstance();
        year = x.get(x.YEAR);

        // Print the current Year
        System.out.println("Current Year: " + year);
        // int month = current.get(current.MONTH);
        System.out.print("Current Month: " + 10);
    }
}