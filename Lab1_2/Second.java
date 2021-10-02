package Lab1_2;

import java.util.Scanner;

public class Second {

    public static void main(String[] args)
    {
       /*System.out.println("Hello "+args[0]);*/
        Scanner input= new Scanner(System.in);
        int x;
        float y;
        String z;
        System.out.println("Enter the integer x:");
        x=input.nextInt();
        System.out.print("Enter float y");
        y=input.nextFloat();
        System.out.print("Enter string z");
        z=input.next();
        System.out.println("X :"+x);
        System.out.println("Y:"+ y);
        System.out.println("Z is "+z);
    }



}
