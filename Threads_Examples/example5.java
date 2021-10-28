package Threads_Examples;
// multithreading in jaava
public class example5 {
} //New Thread is on example 2 so cant use same class name so newThread1 is declared
class NewThread1 implements  Runnable{
    String name; // name of the thread
    Thread t;
    NewThread1(String threadname){
        name =threadname;
        t = new Thread(this,name);
        System.out.println("new Thread "+t);
        t.start();// start the thread
    }
    // this is the entry point for the thread
    public void run(){
        try{
            for (int i = 5;i>0;i--){
                System.out.println(name+": "+i);
                Thread.sleep(1000);// lets wait it for one second
            }
        }catch (InterruptedException e){
            System.out.println(name +"Intterupted");
        }
        System.out.println(name+" exiting from the run  ");
    }
}

// lets make a multidemo thread for working of threads
class MultiThreadDemo{
    public static void main(String[] args) {
        new NewThread1("One");
        new NewThread1("TWO");
        new NewThread1(" three");
        try{
            // wait for the other threads to stop or end
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
        System.out.println("==========main thread exiting=======");
    }
}