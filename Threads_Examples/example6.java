package Threads_Examples;

public class example6 {
}
//demojoin alive
class NewThread2 implements Runnable{
    String name;
    Thread t;
    NewThread2(String threadname){
        name= threadname;
        t = new Thread(this,name);
        System.out.println("new thread is: "+t);
        t.start();
    }
    // this is the entry point for the threads
    public void run(){
        try{
            for(int i =5;i>0;i--){
                System.out.println(name+" :"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name+" :"+"INterrupted");
        }
        System.out.println(name+"exiting ");
    }
}

class DemoJoin{
    public static void main(String[] args) {
        NewThread2 ob1= new NewThread2("one");
        NewThread2 ob2= new NewThread2("two");
        NewThread2 ob3= new NewThread2("three");
        System.out.println(" thread one 1 is alive"+ob1.t.isAlive());
        System.out.println("thread two 2 is alive"+ob2.t.isAlive());
        System.out.println(" thread three 3 is alive"+ob3.t.isAlive());
        //wait for the threads to finish
        try{
            System.out.println("waiting for the threads to finish ");
        ob1.t.join(); // join will delete the threads
          ob2.t.join();
           ob3.t.join();
           // Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println("main thread interrupted ");
        }
        System.out.println(" now again checking the threads to be alive or not");
        System.out.println(" thread 1 one is alive"+ob1.t.isAlive());
        System.out.println("thread 2 two is alive "+ob2.t.isAlive());
        System.out.println(" thread 3 three is alive "+ob3.t.isAlive());
        System.out.println("mainthread exiting ==========");
    }
}