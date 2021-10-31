//3.Write a class Worker and derive classes DailyWorker and SalariedWorker from it.
// Every worker has a name and a salary rate. Write method ComPay (int hours) to compute
// the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works.
// The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are.
// Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism
// to write this program.

//CODE BY DEVASHISH AGARWAL 500082411
package LAB4;
class Worker{
    String name;
    int rate;
    Worker(String name){
        this.name =name;
    }

    void show(){
        System.out.println(" name is "+name);
    }
}
class DailyWorker extends Worker{
int rate;
DailyWorker(String name, int rate){
    super(name);
    this.rate=rate;
}
void Compay(int days){
    show();
    System.out.println("salary is "+(rate*days));
}
}

class SalariedWorker extends Worker{
int rate ;
SalariedWorker(String name ,int rate){
super(name);
this.rate=rate;

}
void Compay(){
int hours=40;//given in question
    show();
    System.out.println("the salary is "+(rate*hours));
}

}
public class q3 {
    public static void main(String[] args) {
DailyWorker d1 =new DailyWorker("amit",1000);

d1.Compay(30);
SalariedWorker s1 =new SalariedWorker("rahul",60);
s1.Compay();

    }
}
//CODE BY DEVASHISH AGARWAL 500082411
