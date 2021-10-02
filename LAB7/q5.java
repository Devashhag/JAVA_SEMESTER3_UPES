//5.You are required to compute the power of a number by implementing a calculator.
// Create a class Calc which consists of a single method long power(int, int).
// This method takes two integers, a and b, as parameters and finds ab. If either a or b is negative,
// then the method must throw an exception which says "a and b should not be negative". Also, if both a and b are zero,
// then the
// method must throw an exception which says "a and b should not be zero"
// For example, -4 and -5 would result in java.lang.Exception: a and b should not be negative.

package LAB7;

import java.util.Scanner;
class  Calc {
    public static  long power(int a,int b){
        return (int)Math.pow(a,b);//have to add int for con of double to long so int should be there
    }
}

public class q5 {
    public static void main(String[] args) {
        System.out.println("enter the two numbers ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        try{
            if(a<0 || b<0){
                throw new Exception(" a or b should not be negative");
            }
            else if(a==0 || b==0){
                throw new Exception("a or b are zero,should not be zero");
            }
            // else
            // return (int)Math.pow(a,b);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(Calc.power( a,b));

    }
}

