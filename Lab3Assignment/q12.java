package Lab3Assignment;
//12.Implement a=b/c as a=Comp.divide(b, c), where a, b and c are objects of class Comp.
//[Hint: a/b is defined as a*b.conjugate()/b.magnitude2()]
/*
import java.util.Scanner;
class Comp1 {
    float real, img;

    public Comp1(float a, float b) {
        this.real = a;
        this.img = b;
    }

    public Comp1() {}

    public void getComp1(float a, float b) {
        real = a;
        img = b;
    }
    public void conj(){
        real =real;
        img=-img;
    }
    public void print2(){
        System.out.println(real+" "+img+"i");
    }
    public void print1() {
        System.out.println(real + "+" + img + "i");
    }

    public void duble() {
        real = 2 * real;
        img = 2 * img;
    }

    public void ktimes(int k) {
        real = k * real;
        img = k * img;
    }

    private float magsq() {
        return real * real + img * img;
    }

    public float magnitude() {
        float t;
        t = (float) Math.sqrt(this.magsq());
        return (t);
    }

    public void add(Comp1 x) {
        real = real + x.real;
        img = img + x.img;
    }

    public void add(Comp1 x, Comp1 y) {
        real = x.real + y.real;
        img = x.img + y.img;
    }

    public Comp1 add3(Comp1 x ) {
        Comp1 c;
        float a, b;
        c = new Comp1();
        a = real + x.real;
        b = img + x.img;
        c.getComp1(a, b);
        return (c);
    }
    public static Comp1 divide(Comp1 x, Comp1 y){
        Comp1 A1 =new Comp1();
        Comp1 A2 = new Comp1();
        x.conj();
        y.conj();
        A1=mul(x);
        A2=mul(,y);
        float denomenator = x.magnitude()*x.magnitude();
        float denomenator1 =y.magnitude()*y.magnitude();
        A1.real=A1.real/denomenator;
        A1.img=A1.img/denomenator;
        A2.real=A2.real/denomenator1;
        A2.img=A2.img/denomenator1;
        return  A1;

    }


    public float getreal() {
        return (real);
    }

    private float getimaginary() {
        return (img);
    }

    public static  Comp1 mul(Comp1 b ,Comp1 c) {
        // To prevent the change in value of real to reflect in img
        Comp1 A1= new Comp1();
        Comp1 A2 =new Comp1();
        float originalReal;
        float originalImg ;
        //b*c.conjugate()/c.magnitude()^2
        originalReal = (b.real * c.real) - (b.img * c.img);
        originalImg = (b.real * c.img) + (b.img * c.real);

        A1.real =originalReal;
        A1.img=originalImg;
        A2.real=originalReal;
        A2.img=originalImg;
        return A1 ;
        return A2;
    }
}

public class q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Comp1 a = new Comp1();
        Comp1 b = new Comp1(2,-7);
        Comp1 c= new Comp1(4,3);

        System.out.println("Printing both complex numbers");
         a.print1();
        b.print1();
        c.print1();

        a= Comp1.divide(b,c);
        // for 2 agrunemnts passing a=Comp.divide(b,c);

        System.out.println("Updated a");
        a.print2();


        input.close();
    }
}
*/
