//1.Write a program to create interface named test. In this interface the member function is square.
// Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class use the object of arithmetic class.

package LAB5;
interface Test{
    int square();
}
class arithmetic implements Test{  // implementation method
    int x;
    arithmetic(int x){
        this.x=x;
    }
   public int square(){  // necessary with public condt otherwise false
        return (this.x*this.x);
    }

    public static void main(String[] args) {//main method
        ToTestInt x = new ToTestInt();
        System.out.println("the square of given no 7 is "+x.totest(7));
    }

}
class ToTestInt{
    public static int totest(int x){
        arithmetic obj =new arithmetic(x);
        return obj.square();
    }
}
public class q1 {

}
