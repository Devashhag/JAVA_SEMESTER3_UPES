//Write a program to create interface A, in this interface we have two method meth1 and meth2.
// Implements this interface in another class named MyClass

package LAB5;
interface A{
    void meth1();
    void meth2();
}
class MYClass implements A{

    public void meth1() {
        System.out.println("implementing meth1...");
    }

    public void meth2() {
        System.out.println(" implementing meth2...");
    }
}
public class q2 {
    public static void main(String[] args) {
        MYClass obj =new MYClass();
        obj.meth1();
        obj.meth2();
    }
}
