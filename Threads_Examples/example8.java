package Threads_Examples;

import javax.swing.plaf.TableHeaderUI;

public class example8 {
}
class A extends Thread{
    public void run(){
        System.out.println("Thread A started");
        for(int i=0;i<=4;i++){
            System.out.println("\t FROM THREAD i="+i);

        }
        System.out.println("exit from A");
    }
}

class B extends  Thread{
    public void run(){
        System.out.println("Thread b started");
        for (int j=0;j<=4;j++){
            System.out.println("\t From Thread B :j="+j);
        }
        System.out.println("exit from B");

    }
}

class C extends  Thread{
    public void run(){
        System.out.println("Thread C started");
        for (int k=0;k<=4;k++){
            System.out.println("From Thread C k"+k);
        }
        System.out.println("exit from thread C");
    }
}

class ThreadPriority{
    public static void main(String[] args) {

        A threadA = new A();
        B threadB = new B();
        C threadC= new C();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Started thread A");
        threadA.start();
        System.out.println(" started thread B");
        threadB.start();
        System.out.println(" Started thread C");
        threadC.start();
        System.out.println("End of the threads");
    }
}