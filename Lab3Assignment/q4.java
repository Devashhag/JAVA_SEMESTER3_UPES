package Lab3Assignment;
//Write a JAVA program which contains a function fun()
// such that fun(x) returns x and fun(x,y) returns x + y and fun(x,y,z) returns x*y*z.
// (where x, y and z are integers)
public class q4 {
    static int fun(int x){
        return x;
    }
    static int fun(int x,int y){
        return x+y;
    }
    static int fun(int x,int y,int z){
        return x*y*z;
    }

    public static void main(String[] args) {
        int a=fun(1);
        System.out.println("single parameter "+a);
        int b=fun(5,5);
        System.out.println("double parameters "+b);
        int c=fun(1,5,9);
        System.out.println("three parameters "+c);
    }
}
