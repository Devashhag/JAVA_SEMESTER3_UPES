package STRING_HANDLING;

import java.util.Scanner;

//17.Write program to replace first occurrence of right neighbor of 2nd x by left
// neighbor of 1st x. Input imgpxugxutkl output imgpxpgxutkl. Input bcxdefxgh output bcxdefxch.
public class prb17 {
    public static void main(String[] args) {
        System.out.println("Enter the string"); //input is imgpxugxutkl
      Scanner sc = new Scanner(System.in);
      String a= sc.next();
      int q=a.indexOf('x');
     //  System.out.println(q);//4

        char b = a.charAt(q-1);
       // System.out.println(b); //p

        String c = a.substring(q+1);
    //    System.out.println(c); //ugxutkl

        int w=c.indexOf('x');
      //  System.out.println(w);//2

        char d = c.charAt(w+1);
        //System.out.println(d); //u

        System.out.println(a.substring(0, a.indexOf(d)) + b + a.substring(a.indexOf(d)+1));
    }
}
