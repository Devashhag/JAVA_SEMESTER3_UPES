//4.Write program to find sum of all digits. Input 23617 output 2+3+6+1+7=19.
//CODE BY DEVASHISH AGARWAL 500082411
package Lab1_2;
import java.util.Scanner;
public class EXP4 {
    public static void main(String[] args){
        int n,sum=0;
        System.out.print("Enter a number");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        //main part of the code
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
System.out.print("The value is: ");
        System.out.print(sum);
    }
}
//CODE BY DEVASHISH AGARWAL 500082411