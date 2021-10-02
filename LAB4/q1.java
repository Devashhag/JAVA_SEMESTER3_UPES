//1.Write a Java program to show that private member
// of a super class cannot be accessed from derived classes.
package LAB4;

class SUPERCLASS{
    private int x=2;
    private void print_private(){
        System.out.println("this is private method  "+ x);
    }
    public void print_public(){
        System.out.println("this is public method  " +x);
    }
}


class DERIVED extends SUPERCLASS{ //inheritence1
    public void check(){
        System.out.println(" just checking the derived class ..." );
    }
}
public class q1 {
    public static void main(String[] args) {
    DERIVED d= new DERIVED();

   d.print_public();
   d.check();
 //d.print_private();    // will throw error private
    }
}
