package Threads_Examples;

public class example7 {
}
// demo synchronized statement where we are using  synchronzationn with the help of join method as well as alive method
class Callme1{
    void call(String msg){
        System.out.println("["+msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.println("]");
    }
}
class Caller2 implements Runnable{
    String msg;
    Callme1 target;
    Thread t;
    public Caller2(Callme1 targ,String s){
        target=targ;
        msg=s;
        t = new Thread(this);
        t.start();
    }
    //synchronized calls to call
    public void run(){
        synchronized (target){ //synchronized block
        target.call(msg);
    }}
}

class Synchro1{
    public static void main(String[] args) {
        Callme1 target = new Callme1();
        Caller2 ob1= new Caller2(target,"hello");
        Caller2 ob2= new Caller2(target,"Synchronized");
        Caller2 ob3 = new Caller2(target,"world");
        // lets wait for the threads to end
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e){
            System.out.println("interruption has occoured");

        }

    }
}