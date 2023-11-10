
/*The program in this assignment is attempted to print the following output:

-----------------OUTPUT-------------------
This is large
This is medium
This is small
This is extra-large
-------------------------------------------------

However, the code is intentionally injected with some bugs. Debug the code to execute the program successfully.
*/
interface ExtraLarge { // interface to print ExtraLarge
    String extra = "This is extra-large";

    void display();
}

class Large { // interface to print Large
    public void Print() {
        System.out.println("This is large");
    }
}

class Medium extends Large { // interface to print medium
    public void Print() {
        super.Print(); // The super keyword in java is a reference variable that is used to refer
                       // parent class objects.
        System.out.println("This is medium");
    }
}

class Small extends Medium { // interface to print small
    public void Print() {
        super.Print();
        ; // The super keyword in java is a reference variable that is used to refer
          // parent class objects.
        System.out.println("This is small");
    }
}

class Week4Assignment3 implements ExtraLarge {
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
        Week4Assignment3 q = new Week4Assignment3();
        q.display();
    }

    public void display() {
        System.out.print(extra);
    } // Printing string variable extra from ExtraLarge interface
}