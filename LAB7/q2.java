//2.Create an exception class, which throws an exception
// if operand is nonnumeric in calculating modules. (Use command line arguments).
//) String getMessage() - prints the exception message
//method to extract method from exception class

//CODE BY DEVASHISH AGARWAL 500082411
package LAB7;
class MyCustomException extends Exception  {

    @Override
    public String getMessage() { ////This method returns the detailed message of this Throwable instance.
        return "this is numeric argument passed";
    }

}
public class q2 {
    public static void main(String[] args) {
int a =0;
try{// The parseInt function converts its first argument to a string, parses that string, then returns an integer or NaN .
            a=Integer.parseInt(args[0]);
    throw new MyCustomException();

}catch(NumberFormatException e){
    System.out.println(e);
    System.out.println("number format error occured or non numeric argument passed");
}

catch (Exception e){
    System.out.println(e.getMessage());

}

    }}
//CODE BY DEVASHISH AGARWAL 500082411





//sirs code
/*class MyException extends Exception{
    public MyException(String S){
        super(S);
    }
}
public class LabSevenQ2 {
    public static void main(String[] args) {
        try {char t=args[1].charAt(0);
            if(!(Character.isDigit(t)))
                throw new MyException(" Not an Integer");
            }
            int x =int.parseint(args[0]); //inside the try block
            int y =Integer.parseint(args[1]);
            sout(x%y);
         catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

}*/

