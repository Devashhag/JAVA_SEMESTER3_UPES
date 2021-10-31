package String_Buffer;
import java.io.*;
import java.lang.*;
//CODE BY DEVASHISH AGARWAL 500082411
//FROM VIRTUAL LAB 1-3 JAVA FRIDAY

public class prb00 {
    public static void main(String[] args) {

        StringBuffer a;
        String b;
        int i;
        try{
            DataInputStream o= new DataInputStream(System.in);
            a=new StringBuffer(" ");
            b=o.readLine();
            a=a.append(b);
            System.out.println("the input string is "+a);

            i=a.indexOf("x");  // gives u the index value of first x   we are using index of method
            System.out.println(i);

            i=a.indexOf("xy"); // index value of xy
            System.out.println(i);

            a.setCharAt(6,'X'); //sets the character value on the given index value
            System.out.println( "using the set char at method "+a);

            a.insert(3,"tty");
            System.out.println(" the inserted (tty) element is "+a);

            a.append("ghij");
            System.out.println("appended :)"+a);

            a.reverse();
            System.out.println("reversed string is "+a);

            a.delete(4,7);
            System.out.println("deleted the char at position 4 and 7 respectively "+a);

            a.deleteCharAt(5);
            System.out.println(a);

            a.replace(3,7,"was");
            System.out.println("replaced the characters from index 3 to 7 "+a);

            a.setLength(5);
            System.out.println("only the 5 chars will print using set.lenght method"+a);

            b=a.toString();
            System.out.println("b is "+b);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
//CODE BY DEVASHISH AGARWAL 500082411