package LAB7Demo;

import java.io.DataInputStream;

public class num3 {
    private static int read1(){
        int i=2,j;
        String a;
        try{
            //Java DataInputStream class allows an application to read primitive data from
            // the input stream in a machine-independent way. Java application generally
            // uses the data output stream to write data that can later be read by a data input stream.
            DataInputStream o= new DataInputStream(System.in);
            //The readLine() method of Console class in Java is used to read a single line of text from the console.
            // ... Return value: This method returns the string containing the
            // line that is read from the console. It returns null if the stream has ended
            a=o.readLine();
            i=Integer.parseInt(a);//converts arguments tp string ,then parses and then returns int
        }
        catch (Exception t){
            System.out.println("not a number "+t);

        }
        return  i;
    }

    public static void main(String[] args) {
        int i,a,f[]={8,12,34,16};
        a=num3.read1();
        try{
            System.out.println(f[a]);
        i=25/0;
            System.out.println(i);
        }catch (Exception t){
            System.out.println("stop "+t);
        }/*
        catch (ArrayIndexOutOfBoundsException t)
          {System.out.println("Illegal Memory reference"+t);}
      catch (ArithmeticException t)
          {System.out.println("Wrong Division"+t);}
    }*/
}}
