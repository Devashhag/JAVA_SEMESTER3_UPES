package Lab3Assignment;
//5.Write a set of overloaded functions min()
// that returns the smaller of two numbers passed to them as arguments. Make versions for int and float.
//CODE BY DEVASHISH AGARWAL 500082411
public class q5 {
    static int min(int x,int y){
        if(x<y){
            return x;
        }
        else
            return y;
    }
    static float min(float x,float y){
        if(x<y){
            return x;
        }
        else
            return y;
    }

    public static void main(String[] args) {
        int a=min(3,4);
        System.out.println("the minimum value in int function is "+a);
        float b=min(4.5f,9.5f);
        System.out.println("the minimum value in float method is"+b);
    }
    }
//CODE BY DEVASHISH AGARWAL 500082411
