package LAB7Demo;

public class num2 {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        a=25;b=4;c=0;d=3;
        try{
            e=a/b;
            System.out.println(e);
        }catch (ArithmeticException t){
            System.out.println("error1"+t);
        }

        try{
            e=a/c;
            System.out.println(e);
        }catch (ArithmeticException t){
            System.out.println("error2\nreason "+t);
        }

        try {
            e=a/d;
            System.out.println(e);
        }catch (ArithmeticException t){
            System.out.println("error3"+t);
        }
    }

}

