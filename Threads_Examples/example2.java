package Threads_Examples;
// REMEMBER  POINT TO NOTE DOWN THAT THE THREADS ARE A TOTALLY DIFFERENT SUBJECT
// IN THREADS WHEN USING THE TRY CATCH BLOCK ITS NOTED THAT THE THREADS ARE USUALLY DONE WITH THE CATCH
// BLOCK IN THE ""INTTERUPTED EXCEPTION"" ONLY
// DO NOT USE ANY OTHER EXCEPTION IT WILL EITHER NOT WORD OR CREATE THE PROBLEM IN THE PROGRAM

public class example2 {
}
class NewThread implements Runnable{
    Thread t;
    NewThread(){
   t = new Thread(this ," demo thread");
        System.out.println("child thread is "+t);
        t.start();
    }
    public void run(){
        try{
            for(int i =5;i>0;i--){
                System.out.println("child thread "+i);
                Thread.sleep(500);// we are making the thread to sleep for about 500 milliseconds
            }
        }
        catch (InterruptedException e){
            System.out.println("CHILD INTERRUPTED ");
        }
        System.out.println("Exiting Child thread");
    }
}
class ThreadDEMO{
    public static void main(String[] args) {
        new NewThread(); // this is another way of making thread
//      NewThread t1=  new NewThread(); // thats how we make a new thread
        // or we can make it like

        try{
            for(int i =5;i>0;i--){
                System.out.println("MAIN THREAD IS "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("main thread interrupted --------------");
        }
        System.out.println("--------------exiting the main thread---------");
    }
}

