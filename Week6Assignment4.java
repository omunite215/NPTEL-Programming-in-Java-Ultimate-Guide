/* Execution of two or more threads occurs in a random order. The keyword 'synchronized' in Java is used to control the execution of thread in a strict sequence. In the following, the program is expected to print the output as given below. Do the necessary use of 'synchronized' keyword, so that, the program prints the Final sum as given below:  


-----------------OUTPUT-------------------

Final sum:6000

-------------------------------------------------*/

/*
A simple class that demonstrates using the 'synchronized'
keyword so that multiple threads may send it messages.
The class stores two ints, a and b; sum() returns
their sum, and inc() increments both numbers.
<p>
The sum() and incr() methods form a "critical section" --
they can compute the wrong thing if run by multiple threads
at the same time. The sum() and inc() methods are declared
"synchronized" -- they respect the lock in the receiver object.
*/
class Pair {
    private int a, b;

    public Pair() {
        a = 0;
        b = 0;
    }

    // Returns the sum of a and b. (reader)
    // Should always return an even number.
    synchronized public int sum() { // Adding Synchronized Keyword
        return (a + b);
    }

    // Increments both a and b. (writer)
    synchronized public void inc() { // Addding Synchronized Keyword
        a++;
        b++;
    }
}

/*
 * A simple worker subclass of Thread.
 * In its run(), sends 1000 inc() messages
 * to its Pair object.
 * (1000 may not be big enough to exhibit the bug on uniprocessor --
 * hardware more like 1000000 may be required).
 */
public class Week6Assignment4 extends Thread {
    public final int COUNT = 1000;
    private Pair pair;

    // Ctor takes a pointer to the pair we use
    public Week6Assignment4(Pair pair) {
        this.pair = pair;
    }

    // Send many inc() messages to our pair
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            pair.inc();
        }
    }

    /*
     * Test main -- Create a Pair and 3 workers.
     * Start the 3 workers -- they do their run() --
     * and wait for the workers to finish.
     */
    public static void main(String args[]) {
        Pair pair = new Pair();
        Week6Assignment4 w1 = new Week6Assignment4(pair);
        Week6Assignment4 w2 = new Week6Assignment4(pair);
        Week6Assignment4 w3 = new Week6Assignment4(pair);
        w1.start();
        w2.start();
        w3.start();
        // the 3 workers are running
        // all sending messages to the same object
        // we block until the workers complete
        try {
            w1.join();
            w2.join();
            w3.join();
        } catch (InterruptedException ignored) {
        }

        System.out.println("Final sum:" + pair.sum()); // should be 6000
        /*
         * If sum()/inc() were not synchronized, the result would
         * be 6000 in some cases, and other times random values
         * like 5979 due to the writer/writer conflicts of multiple
         * threads trying to execute inc() on an object at the same time.
         */
    }
}