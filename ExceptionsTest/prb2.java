package ExceptionsTest;

import java.util.Scanner;

public class prb2 {
    public static void main(String[] args) {
   float a,b;
   int c;
   String str1,str2;
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no");
     str1=sc.next();
        System.out.println("enter the second no");
     str2=sc.next();
     a=Float.parseFloat(str1);
     b=Float.parseFloat(str2);
     try{
         float arr[]= new float[250];
         c=(int)(a-b);
         arr[c]=c;
         System.out.println("the bigger no is "+a);
     }catch (Exception e){
         System.out.println(" the bigger no is "+b);
     }
    }
    }

