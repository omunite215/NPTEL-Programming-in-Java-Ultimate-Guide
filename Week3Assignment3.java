
/* A class Shape is defined with two overloading constructors in it. Another class Test1 is partially defined which inherits the class Shape. The class Test1 should include two overloading constructors as appropriate for some object instantiation shown in main() method. You should define the constructors using the super class constructors. Also, override the method calculate( ) in Test1 to calculate the volume of a Shape. */
import java.util.Scanner;

class Shape {
    double length, breadth;

    Shape(double l, double b) { // Constructor to initialize a Shape object
        length = l;
        breadth = b;
    }

    Shape(double len) { // Constructor to initialize another Shape object
        length = breadth = len;
    }

    double calculate() {// To calculate the area of a shape object
        return length * breadth;
    }
}

public class Week3Assignment3 extends Shape {

    // Template code:
    double height;

    Week3Assignment3(double length, double h) {
        // base class constructor with one parameter is called
        super(length);
        height = h;
    }

    Week3Assignment3(double length, double breadth, double h) {
        // base class constructor having two argument is called
        super(length, breadth);
        height = h;
    }

    double calculate() {
        return length * breadth * height;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);// Create an object to read
                                            // input
        double l = sc.nextDouble(); // Read length
        double b = sc.nextDouble(); // Read breadth
        double h = sc.nextDouble(); // Read height
        Week3Assignment3 myshape1 = new Week3Assignment3(l, h);
        Week3Assignment3 myshape2 = new Week3Assignment3(l, b, h);
        double volume1;
        double volume2;
        volume1 = myshape1.calculate();
        volume2 = myshape2.calculate();
        System.out.println(volume1);
        System.out.println(volume2);
    }
}