package Lab3Assignment;
//Write a JAVA program which contains a function fun()
// such that fun(x) returns x2 and fun(x,y) returns x2 + y2. (where x and y are integers).
//CODE BY DEVASHISH AGARWAL 500082411
public class q3 {
    static int fun(int x){
        return x*x;
    }
    static int fun(int x,int y){
        return x*x +y*y;
    }

    public static void main(String[] args) {
        int a=fun(2);
        System.out.println("for the method containing single parameter is "+a);
        int b=fun(3,4);
        System.out.println("for the method containing 2 parameters x and y is "+b );
    }
}
//CODE BY DEVASHISH AGARWAL 500082411