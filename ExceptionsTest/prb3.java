//read a string of two numbers output 1 is first no is bigger  output 2 if second no is bigger  output zero if both are zero


package ExceptionsTest;

import java.util.Scanner;

public class prb3 {
    public static void main(String[] args) {
        int a,b,c,d;
        String str1,str2;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first no");
        str1=sc.next();
        System.out.println("enter the second no");
        str2=sc.next();
        a=Integer.parseInt(str1);
        b=Integer.parseInt(str2);
        try{
            int arr [] =new int[250];
            c=a-b;
            arr[c]=c;

            System.out.println(1);
        }catch (IndexOutOfBoundsException e){
            System.out.println(2);
        }catch (Exception e){
            System.out.println(0);
        }
    }
    }

