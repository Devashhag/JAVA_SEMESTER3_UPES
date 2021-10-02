package Lab3Assignment;
//Write a JAVA program which contains a function square() such that square(3) returns 9,
// square(0.2) returns 0.04.

public class q1 {
    static int square(int x){
        return x*x;
    }
    static float square(float x){

        return x*x;
    }

    public static void main(String[] args) {
        int a;
        a=square(3);
        System.out.println(a);
        float b;
        b=square(0.2f);
        System.out.println(b);
    }
}
