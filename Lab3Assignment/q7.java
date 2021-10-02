package Lab3Assignment;
//Write a set of overloaded functions max() that returns the biggest of two numbers passed to
// them as arguments. Make versions for int and float.
public class q7 {
    static int max(int x, int y){
        if (x>y){
            return x;
        }
        else
            return y;
    }
    static float max(float x, float y){
        if (x>y){
            return x;
        }
        else
            return y;
    }

    public static void main(String[] args) {
        int a=max(3,4);
        System.out.println("the max of int is "+a);
        float b= max(5.024f,6.245f);
        System.out.println("the max of float is "+b);
    }
}
