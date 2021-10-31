package Lab3Assignment;
//11.Implement a=b/c as a=b.divide(c), where a, b and c are objects of class Comp.
//[Hint: a/b is defined as a*b.conjugate()/b.magnitude2()]
//CODE BY DEVASHISH AGARWAL 500082411
//Q10 ALSO INCLUDED IN THIS PART OF PROGRAM
import java.util.Scanner;

class Comp {
    float real, img;

    public Comp(float a, float b) {
        this.real = a;
        this.img = b;
    }

    public Comp() {}

    public void getComp(float a, float b) {
        real = a;
        img = b;
    }
    public void conj(){
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

    public void add(Comp x) {
        real = real + x.real;
        img = img + x.img;
    }

    public void add(Comp x, Comp y) {
        real = x.real + y.real;
        img = x.img + y.img;
    }

    public Comp add3(Comp x ) {
        Comp c;
        float a, b;
        c = new Comp();
        a = real + x.real;
        b = img + x.img;
        c.getComp(a, b);
        return (c);
    }
    public Comp divide(Comp x){ // tdiv
        Comp A1 =new Comp();
        x.conj();
        A1=mul(this,x);
        float denomenator = x.magnitude()*x.magnitude();
        A1.real=A1.real/denomenator;
        A1.img=A1.img/denomenator;
        return  A1;
    }


    public float getreal() {
        return (real);
    }

    private float getimaginary() {
        return (img);
    }

   public static  Comp mul(Comp b ,Comp c) {
        // To prevent the change in value of real to reflect in img
        Comp A1= new Comp();
        float originalReal;
        float originalImg ;
      //b*c.conjugate()/c.magnitude()^2
        originalReal = (b.real * c.real) - (b.img * c.img);
        originalImg = (b.real * c.img) + (b.img * c.real);

        A1.real =originalReal;
        A1.img=originalImg;
        return A1 ;
    }
}



class q11 {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


    Comp a = new Comp();
    Comp b = new Comp(2,-7);
    Comp c= new Comp(4,3);

    System.out.println("Printing both complex numbers");
    //  a.print1();
    b.print1();
    c.print1();

    a= b.divide(c);
    // for 2 agrunemnts passing a=Comp.divide(b,c);

    System.out.println("Updated a");
    a.print2();


    input.close();
}
}


//CODE BY DEVASHISH AGARWAL 500082411