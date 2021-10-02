package LAB8;
//2.Write a program that converts all characters of a string in capital letters. (Use StringBuffer to store a string). Don’t use inbuilt function.
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

StringBuilder sb = new StringBuilder();
Scanner sc = new Scanner(System.in);
        System.out.println("enter the lowercase string");

        String str=sb.toString();

       str=sc.next();
      // sb= new StringBuilder(sc.next());
        char chars[] = str.toCharArray();


        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 'a' && chars[i] <= 'z') {

                chars[i]=(char) (chars[i]-32);
            }
        }
        System.out.print("Upper case string is : ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }




    }
}
