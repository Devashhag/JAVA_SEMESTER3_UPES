//6.Write program, which reads two number (assume that both have same number of digits).
// The program outputs the sum of product of corresponding digits. Input 327 and 539 output 3x5+2x3+7x9=84.
package Lab1_2;
import java.util.Scanner;
public class EXP6 {
    public static void main(String[] args){
        int x,y=0,sum=0;
        System.out.print("Enter the numbers x and y ");
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        //main part of the code
        while(x>0){
            sum+=(x%10)*(y%10);
            x=x/10;
            y=y/10;
        }
        System.out.print("The value is ");
        System.out.print(sum);

    }



}
