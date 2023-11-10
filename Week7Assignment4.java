/* The following program reads a string from the keyboard and is stored in the String variable "s1". You have to complete the program so that it should should print the number of vowels in s1 . If your input data doesn't have any vowel it will print "0".*/

import java.io.*;
import java.util.*; //you can skip this statement as no util scanner is used.

public class Week7Assignment4 {
  public static void main(String[] args) {
    int c = 0;
    try {
      // Using Input Stream to take input
      InputStreamReader r = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(r);
      String s1 = br.readLine();
      // Write your code here to count the number of vowels in the string "s1"
      for (int i = 0; i < s1.length(); i++) {
        char s = s1.charAt(i);// Tracing Every Character in The String
        if (s == 'a' || s == 'A' || s == 'e' || s == 'E' || s == 'i' || s == 'I' || s == 'o' || s == 'O' || s == 'u'
            || s == 'U') { // Condition to Check Vowels in both UpperCase and LowerCase Letters
          c = c + 1;// Incrementing c if Vowel found
        }
      }
      System.out.println(c);
    } catch (Exception e) {
      System.out.println(e); // printing error message
    }
  }
}