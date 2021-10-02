package STRING_HANDLING;


import java.util.Scanner;
//the first program on string handling
public class kapil {
    public static void main(String[] args) {
        String a,b,c;
        try{
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the first string");
            a=sc.next();
            System.out.println("enter the second string");
            b=sc.next();
            c=a+b;
            b=a.substring(2,5);//2 included 5 excluded
            System.out.println(b);
            System.out.println(c);//add up the strings
        }catch ( Exception e){
            System.out.println(e);
        }
    }
}
