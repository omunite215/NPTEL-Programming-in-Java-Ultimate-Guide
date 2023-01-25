/* Complete the code segment to call the default method in the interface Java and Nptel. */

interface Java{ 
    // default method 
    default void disp(){ 
        System.out.println("Default method implementation of Java interface."); 
    } 
} 
  
interface Nptel{ 
    // Default method 
    default void disp(){ 
        System.out.println("Default method implementation of Nptel interface."); 
    } 
} 
  
// Implementation class code 
class Set2_Q3 implements Java, Nptel{ 
    // Overriding default disp method 
    public void disp(){

// Call disp() of Java interface.
Java.super.disp();
// Call disp() of Nptel interface.
Nptel.super.disp();
} 
  
    public static void main(String args[]){ 
        Set2_Q3 q = new Set2_Q3(); 
        q.disp(); 
    } 
}