package LAB3OOPS;

class Add{
    //public Add(){}
    void sum(int x){
        System.out.println("Sum is "+(x+3));
    }
void sum(int x ,int y){
    System.out.println("sum:"+(x+y));
}
void sum(double x){
    System.out.println("Sum :"+(x+2.5));
}
void sum(double x,double y,int z){
    System.out.println("sUUUM "+(x+y+z));
}
}
public class DemoOverloading {
    public static void main(String[] args) {
        Add A= new Add();
        A.sum(4);
        A.sum(3.4);
        A.sum(3,5);
        A.sum(3.4,5.6,7);
    }
}
