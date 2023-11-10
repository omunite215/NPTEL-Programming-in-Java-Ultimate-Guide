/* Complete the code segment to call the default method in the interface First and Second */

interface First {
    // default method
    default void show() {
        System.out.println("Default method implementation of First interface.");
    }
}

interface Second {
    // Default method
    default void show() {
        System.out.println("Default method implementation of Second interface.");
    }
}

// Implementation class code
class Week4Assignment4 implements First, Second {
    // Overriding default show method
    public void show() {

        // Call show() of First interface.
        First.super.show();
        // Call show() of Second interface.
        Second.super.show();
    }

    public static void main(String args[]) {
        Week4Assignment4 q = new Week4Assignment4();
        q.show();
    }
}