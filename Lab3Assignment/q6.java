package Lab3Assignment;
//6.Write a set of overloaded functions power() that returns
// the Xn where n is integer and X may be int and float.
//CODE BY DEVASHISH AGARWAL 500082411
public class q6 {
    static int power(int x,int y){
        int power= (int) Math.pow(x,y);
        return power;
    }
    static float power(float x, float y){
        float power =(float) Math.pow(x,y);
        return power;
    }

    public static void main(String[] args) {
        int a=power(3,4);
        System.out.println("the int power is "+a);
        float b=power(3.5f,7.9f);
        System.out.println("the float power is "+b);
    }
}
//CODE BY DEVASHISH AGARWAL 500082411