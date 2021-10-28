package Threads_Examples;
// non synchronoized example
public class example4 {
}
class CallMe{
    void call (String msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.println("]");
    }
}
class Caller1 implements Runnable{
    String msg;
    CallMe target;
    Thread t;
    public  Caller1(CallMe targ,String s){
        target=targ;
        msg=s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);

    }

}

class Synchr{
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
        // wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}