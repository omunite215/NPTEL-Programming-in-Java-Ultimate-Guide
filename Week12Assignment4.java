/*A program code is given to call the parent class static method and instance method in derive class without creating object of parent class. You should write the appropriate code so that the program print the contents of static method() and instance method () of parent class.
 */

class Parent {
    public static void testClassMethod() {
        System.out.println("The static method.");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}

public class Week12Assignment4 extends Parent {
    public static void testClassMethod() {
    }

    public static void main(String[] args) {
        Parent obj = new Parent();
        // Call the instance method in the Parent class
        obj.testInstanceMethod();
        // Call the static method in the Parent class
        obj.testClassMethod();
    }
}