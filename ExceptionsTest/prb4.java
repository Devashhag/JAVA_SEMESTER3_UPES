package ExceptionsTest;

import java.util.Scanner;

public class prb4 {
    public static void main(String[] args) {
//unable to solve the program
        //will do it another day

Scanner sc = new Scanner(System.in);
        //StringBuilder sb = new StringBuilder();
       // StringBuilder sb2= new StringBuilder();
        System.out.print("Enter a string: ");
        String str= sc.next();

        try{
            int a=Integer.parseInt(str);

            int n=0;
            String p = null;
            int arr [] =new int[a+1];
            arr[0]= Integer.parseInt(p);
if(n%2==0||n%2==1){
                    System.out.println(0);
                }
////else if (arr[a]%2==0 ||arr[a]%2==1){
   // System.out.println(2);
//}

        }catch (NumberFormatException e){ //if not an integer
            System.out.println(1);
        }
    }
}
