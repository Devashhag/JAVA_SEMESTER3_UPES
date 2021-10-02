package LAB7Demo;
import java.io.*;
import java.lang.*;
public class num1 {
    public static void main(String[] args) {
        String a,b;
        char c;
       // a="abc";
        //ex from javatutopoints
        a="sachin tendulkar";//space is also taken or considered in the case of strings
        //remember that in ssubstring the value starts from 0 and if (2,5) iis given then the string starts from 2+1 =3 and ends the same 5 means 5
        try{
            b=a.substring(2,5);//substring means where string starts and ends
            System.out.println(b);
            c =a.charAt(9);
            System.out.println(c);
        }catch (Exception e){
            System.out.println("the exception is "+e);
        }
        System.out.println("harri");
    }
}
