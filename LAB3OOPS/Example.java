package LAB3OOPS;

 class Check {
     int x=10,y=15;
    public static void printMsg(){
        System.out.println("Inside the static method");
    }
    public void fa(){
        x=2*x;
        y=x+y;
    }
     public void fa(Check a){
         x=2*a.x;
         y=a.x+a.y;
     }
     void printData(){
         System.out.println("X = "+x);
         System.out.println("Y = "+y);

     }

}

class Demo{
    public static void main(String[] args) {
        // if we are not using static in check class then use the lines
        //Check A=new Check();
        //A.printMsg();
        Check.printMsg();
        Check A =new Check();
        Check B =new Check();
        Check C=new Check();

        A.printData();
        A.fa();
        System.out.println("Data of A");
        A.printData();
        System.out.println("Data of B");
        B.printData();
        System.out.println("Data of C");
        C.fa(B);
        C.printData();
    }
}