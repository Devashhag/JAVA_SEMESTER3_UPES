package LAB7Demo;

import java.io.DataInputStream;
import java.io.IOException;

public class num5 {
    public static void main(String[] args) {
        { int i;float x,y,k,l;String a=" ",b;
            try
            {
                DataInputStream o=new DataInputStream(System.in);
                a=o.readLine();
                a=a.trim();//trim()is a built-in function that eliminates leading and trailing spaces.  removes extra spaces
            }
            catch(IOException e){ }
            i=a.indexOf("");
            b=a.substring(0,i);
            try
            {
                x=Float.parseFloat(b);
            }catch(Exception e){
                x=5;
            }
            b=a.substring(i+1);
            y=Float.parseFloat(b.trim());
            k=x+y;
            l=x*y;
            System.out.println(k+""+l);
    }

}}
