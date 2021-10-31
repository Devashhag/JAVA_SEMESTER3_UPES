package Lab3Assignment;
//2.Write a JAVA program which contains a function cube() such that cube(3) returns 27,
// cube(0.2) returns 0.008.
//CODE BY DEVASHISH AGARWAL 500082411
public class q2 {
    static int cube(int x){
        return x*x*x;
    }
static float cube(float x){
        return x*x*x;
}

    public static void main(String[] args) {
        int a=cube(3);
        System.out.println(a);
        float b=cube(0.2f);
        System.out.println(b);
    }
}
//CODE BY DEVASHISH AGARWAL 500082411