package LAB7Demo;

public class num4 {
    public static void main(String[] args) {
        int a,b,c,d,e,f; a=25;b=4;c=0;d=3;
        try{
            e=a/b;System.out.println(e);
            e=a/c;System.out.println(e);
            e=a/d;System.out.println(e);}
       finally {
            System.out.println("Continue");
            e=a/d;System.out.println(e);
        }
        }
}
