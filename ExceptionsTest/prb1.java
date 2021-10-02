package ExceptionsTest;

import java.util.Scanner;

public class prb1 {
    public static void main(String[] args) {
    int a,b,c,d;
        String str1, str2;
    Scanner sc = new Scanner(System.in);
        System.out.println(" enter the first no");
    str1=sc.next();

        System.out.println("enter the second no");
    str2=sc.next();
    a=Integer.parseInt(str1); //args as string parses and then result as int or nan
    b=Integer.parseInt(str2);

try{
  int arr [] = new int [250];
    c=a-b;
  arr[c]=c;
    System.out.println("the bigger no is "+a);
}catch (Exception e){
    System.out.println("the bigger no is "+b);
}

    }}

