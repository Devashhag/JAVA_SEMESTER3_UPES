package Threads_Examples;
/// this code is from thread creation part 1
public class example1 {
}
class newThread extends Thread{
    newThread(){ //constructor
        super("Demo Thread");
        System.out.println("Child Thread is "+ this );
        start(); //The start() method of thread class is used to begin the execution of thread
    }
        public void run(){
            try{
                for (int i =5;i>0;i--){
                    System.out.println("Child thread:"+i);
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                System.out.println("child thread just got interrupted");
            }
            System.out.println("exiting the child thread from run method");
        }

}
class ExtendThread{
    public static void main(String[] args) {
      //  newThread newThread = new newThread(); //create a new thread
        // u can use any of the two methods in it
        new newThread();
        try{
            for(int i=5;i>0;i--){
                System.out.println("MAIN THREAD: "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(" MAIN THREAD INTERRUPTED");
        }
        System.out.println("MAIN THREAD EXITING ");
    }
}