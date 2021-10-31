//3.Write a code to create your own exception class.
// Create another class, inside main method prompt user to enter a number if number
// is less than 500 throw instances of your custom exception class.

//CODE BY DEVASHISH AGARWAL 500082411
package LAB7;

import java.util.Scanner;

class Exception1 extends Exception{

    Exception1(String s){
        super(s);//reference variable
    }
}
public class q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        try{
            if(a<500 &&a>=0){
                throw new Exception1("the no is less than 500 or equal to 500 or 0 ");
            }
            else if(a<0){
                throw new Exception1("the no is negative");
            }
            else{
                throw new Exception1("the no is greater than 500");
            }

        }catch (Exception t){
         //   System.out.println(t);
            System.out.println(t.getMessage());
        }
        finally {
            System.out.println("program finished");
        }
    }
}
//CODE BY DEVASHISH AGARWAL 500082411