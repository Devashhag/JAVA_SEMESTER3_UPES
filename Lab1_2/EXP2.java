//2 .Write a program to print first digit. e.g. input 23516 output 2.
//CODE BY DEVASHISH AGARWAL 500082411
package Lab1_2;
import java.util.Scanner;

public class EXP2 {
    public static void main (String[] args){
int n =0,m=0;
    System.out.println("ENTER A NUMBER");
        Scanner input= new Scanner(System.in);
        n =input.nextInt();
        //main part of the code
   while(n>0){
    m=n%10;
    n=n/10;
}
   System.out.print("The first digit is ");
System.out.print(m);
    }
}
//CODE BY DEVASHISH AGARWAL 500082411