/*Write a program to create a record by taking inputs using Scanner class as first name as string ,last name as string ,roll number as integer ,subject1 mark as float,subject2 mark as float. Your program should print in the format 
  "name  rollnumber avgmark".

For example:
input:

 

ram

das

123

25.5

24.5
output:


ramdas 123 25.0*/

import java.util.*;

public class Week12Assignment3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        // Read your first name in string
        String firstName = s1.next();

        // Read your last name in string
        String lastName = s1.next();

        // Read rollnumber in integer
        int rollno = s1.nextInt();

        // Read 1st subject mark in float
        float sub1 = s1.nextFloat();

        // Read 2nd subject mark in float
        float sub2 = s1.nextFloat();

        // find the avg mark in the subject
        float avg = (float) ((sub1 + sub2) / 2.0);

        // Print the record in the format: name+" "+rollnumber+" "+avg_mark
        System.out.print(firstName + lastName + " " + rollno + " " + avg);
    }
}