//1.Write program to print the kth digit from last. e.g. input 23617 and k=4 output 3.

package Lab1_2;//Write program to print k th digit from last
//eg x=23617 and k=4 output 3.

import java.util.Scanner;
public class EXP1 {
    public static void main (String[] args){
        int number,k;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value of number and k");
        number =input.nextInt();
        k=input.nextInt();
        for(int i=0;i<k-1;i++){
            number=number/10;
        }
        System.out.println("Last digit of a given number is "+number%10);
        input.close();
    }
}
