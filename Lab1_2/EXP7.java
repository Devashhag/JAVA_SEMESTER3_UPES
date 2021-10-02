//7.Write program to print positional values of digits. Input 21463 output 3, 60, 400, 1000 and 20000.
package Lab1_2;
import java.util.Scanner;
public class EXP7 {
    public static void main (String[] args){
        int i=1,x;
        System.out.println("ENTER A NUMBER");
        Scanner input= new Scanner(System.in);
        x =input.nextInt();
        while(x>0)
        {
            System.out.print(", ");
            System.out.print(i*(x%10));
i*=10;
x=x/10;

    }
}}
