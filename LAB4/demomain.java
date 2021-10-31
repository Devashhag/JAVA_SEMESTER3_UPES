package LAB4;
//EXAMPLE FROM VIRTUAL LAB FRIDAY 1-3
class Parent{
    private int x;
    protected int y;
    public int z;
    public Parent(){} //constructor
    public  Parent(int x,int y ,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void printData(){
        System.out.println("x "+x);
        System.out.println("y "+y);
        System.out.println("z "+z);
    }
}
class Child extends Parent{
    int t;
    public Child(){} //default constructor
    public  Child(int x,int y,int z ,int t){
        super(x,y,z);
        this.t=t;
    }
    public void printData(){
        System.out.println("In class child");
        super.printData();
        System.out.println("t "+t);

    }
    public void sum(){
        System.out.println("sum "+(y+z+t));//inherited from parent x cant be inhereted bcz itz private
    }

    public void print() {
    }
}
class Demomain{
    public static void main(String[] args) {
        Parent P = new Parent(2,3,4); //passing reference Parent P
        P.printData();  // this is dynamic polymorphism
        P=new Child(10,11,12,13);
        P.printData();  // this is also dynamic polymorphism
        Child C =new Child(2,3,4,5);
        C.printData();
     // error here ??  ((Child)P.sum());
    }
}
