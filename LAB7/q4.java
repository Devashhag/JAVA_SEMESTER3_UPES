package LAB7;

//.You are given two integers, a and b as input, you have to compute a/b:
// If a and b are not bit signed integers or if is zero,
// exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            System.out.println("Enter the first no ");
            int a =sc.nextInt();
            System.out.println("Enter the second no ");
            int b =sc.nextInt();
            int c=a/b;
            System.out.println("the result is "+c);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
