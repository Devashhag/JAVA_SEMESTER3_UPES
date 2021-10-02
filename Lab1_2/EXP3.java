//3.Write program to print the second digit. e.g. input 23516 the output is 3.
package Lab1_2;
import java.util.Scanner;
public class EXP3 {
    public static void main(String[] args){
        int n=0,m=0;
        System.out.print("Enter a number");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        //main part of the code
        while(n>100){
            n/=10;
            m=n%10;
        }
System.out.print("The second digit is");
        System.out.print(m);

    }

}
