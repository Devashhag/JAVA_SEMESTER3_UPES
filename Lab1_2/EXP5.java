//5.Write program, which will find sum of product to consecutive digits.
// e.g. when the input is 23145 the output is 2x3 + 3x1 + 1x4 + 4x5 = 33.
//CODE BY DEVASHISH AGARWAL 500082411
package Lab1_2;
import java.util.Scanner;
public class EXP5 {
    public static void main (String[] args){
        int a,b=0,c=0;
        System.out.print("Enter a number");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        // mainpart of the code
        while(a>0){
         b=(a%10);
        a=a/10;
            b=b*(a%10);
            c=c+b;
        }
        System.out.print("The result is :");
        System.out.print(c);
    }
}
//CODE BY DEVASHISH AGARWAL 500082411