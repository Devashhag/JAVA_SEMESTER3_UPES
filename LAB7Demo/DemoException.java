package LAB7Demo;

public class DemoException {
    public static void main(String[] args) {
        int a,b,c,d,e;a=25;b=4;c=0;d=3;

        try {
            e=a/b;
            System.out.println(e);
            e=a/c;
            System.out.println(e);
            e=a/d;
            System.out.println(e);

        } catch (Exception E) {
            System.out.println("Execution Continue this line has error");
        }

        e=a/d;System.out.println(e);
        System.out.println("Hari");
    }
}
