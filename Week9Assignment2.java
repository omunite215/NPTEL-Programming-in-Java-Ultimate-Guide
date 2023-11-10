
/* Complete the code to develop an ADVANCED CALCULATOR that emulates all the functions of the GUI Calculator as shown in the image.*/
/* Note the following points carefully:
1. Use only double datatype to store all numeric values.
2. Each button on the calculator should be operated by typing the characters from 'a' to 'p'.
3. To calculate 25-6, User should input fjhkc (where, f for 2, j for 5, h for '-', k for 6 and c for '=' ).
3. You may use the already defined function gui_map(char).
4. Without '=', operations won't give output as shown in Input_2 and Output_2 example below.
5. The calculator should be able to perform required operations on two operands as shown in the below example:

Input_1:
                   klgc

Output_1:
                        18.0*/
import java.util.Scanner;

public class Week9Assignment2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    // Write code below...
    String num1 = "", num2 = "";// declaration
    char op = 'a';
    int equal = 0, flag = 0, check = 0, j = 0, ch = 0;
    char[] charArray = input.toCharArray();
    char[] numarray = new char[input.length()];
    for (int i = 0; i < input.length(); i++) // logic to justify entered symbol
    {
      if (charArray[i] < 'a' || charArray[i] > 'p') {
        check = 1;
        break;
      }
      if (charArray[i] == 'c')
        ch = 1;
      char out = gui_map(charArray[i]);
      numarray[i] = out;
      if (out == '+' || out == '-' || out == 'X' || out == '/') {
        flag = 1;
        op = out;
      }
      if (flag == 0)
        num1 = num1 + String.valueOf(out);
      else {
        if (j == 0) {
          j++;
          continue;
        }
        if (out == '=') {
          equal = 1;
          break;
        }
        num2 = num2 + String.valueOf(out);
      }
    }
    if (ch == 1 && check == 0) {
      double a = Double.parseDouble(num1);
      double b = Double.parseDouble(num2);
      if (op == '+')
        System.out.print(a + b); // printing calculations wrt input
      else if (op == '-')
        System.out.print(a - b);

      else if (op == 'X')
        System.out.print(a * b);

      else if (op == '/')
        System.out.print(a / b);

    }
  }// The main() method ends here.

  // A method that takes a character as input and returns the corresponding GUI
  // character
  static char gui_map(char in) {
    char out = 'N';// N = Null/Empty
    char gm[][] = { { 'a', '.' }, { 'b', '0' }, { 'c', '=' }, { 'd', '+' }, { 'e', '1' }, { 'f', '2' }, { 'g', '3' },
        { 'h', '-' }, { 'i', '4' }, { 'j', '5' }, { 'k', '6' }, { 'l', 'X' }, { 'm', '7' }, { 'n', '8' }, { 'o', '9' },
        { 'p', '/' } };

    // Checking for maps
    for (int i = 0; i < gm.length; i++) {
      if (gm[i][0] == in) {
        out = gm[i][1];
        break;
      }
    }
    return out;
  }
}