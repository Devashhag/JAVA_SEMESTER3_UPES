package LAB9_Threads;

//4.Write a Java program to create five threads with different priorities.
// Send two threads of the highest priority to sleep state.
// Check the aliveness of the threads and mark which thread is long lasting
// for normal threads that are not set as max priority
//CODE BY DEVASHISH AGARWAL 500082411

class Mythreadq extends Thread {
    Mythreadq(String name) {
        super(name);
    }

    public void run() {
        for(int i=0;i<=5;i++){

        try {
            System.out.println("executing " + this.getName());
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
} }

//for the threads that are max set as priority
// putting the threads to sleep
class Mythreadpri extends Thread{
    Mythreadpri(String name){
        super(name);
    }
    public void run(){
        for (int i=0;i<=5;i++){
            try
            {
                System.out.println("exrcuting the max priority "+this.getName());
                Thread.sleep(5000);//for 10 seconds sleep
            }catch (InterruptedException e){
                System.out.println("THE THREADS GETS INTERRUPTED");
            }
        }
    }

}
//m1 min
//m2 max
//m3 max
//m4 norm
//m5 min

public class q4 {
    public static void main(String[] args) {
        Mythreadq m1 = new Mythreadq("thread 1");

        Mythreadpri m2 = new Mythreadpri("thread 2"); //sleep
        Mythreadpri m3 = new Mythreadpri("Thread 3"); //sleep

        Mythreadq m4 = new Mythreadq("Thread 4");
        Mythreadq m5 = new Mythreadq("thread 5");

//check the threads are alive or not
        System.out.println("before executing threads are alive or not-->");
        if (m1.isAlive()) {
            System.out.println("Thread is alive." + m1);
        } else {
            System.out.println("thread is not alive" + m1);
        }
        m1.setPriority(Thread.MIN_PRIORITY);

        if (m2.isAlive()) {
            System.out.println("Thread is alive" + m2);
        } else {
            System.out.println("thread is not alive" + m2);
        }
        m2.setPriority(Thread.MAX_PRIORITY);

        if (m3.isAlive()) {
            System.out.println("thread is alive" + m3);
        } else {
            System.out.println("thread is not alive" + m3);
        }
        m3.setPriority(Thread.MAX_PRIORITY);

        if (m4.isAlive()) {

            System.out.println("thread is alive" + m4);
        } else {
            System.out.println("thread is not alive" + m4);
        }

        m4.setPriority(Thread.NORM_PRIORITY);


        if (m5.isAlive()) {
            System.out.println("thread is alive" + m5);

        } else{
            System.out.println("thread is not alive"+m5);
        }
        m5.setPriority(Thread.MIN_PRIORITY);


        m2.start();
        m3.start();
        m1.start();
        m4.start();
        m5.start();



        System.out.println("after executing and start method the threads are alive or not-->");

        if (m1.isAlive()) {
            System.out.println("Thread is alive." + m1);
        } else {
            System.out.println("thread is not alive" + m1);
        }
        if (m2.isAlive()) {
            System.out.println("Thread is alive" + m2);
        } else {
            System.out.println("thread is not alive" + m2);
        }
        if (m3.isAlive()) {
            System.out.println("thread is alive" + m3);
        } else {
            System.out.println("thread is not alive" + m3);
        } if (m4.isAlive()) {

            System.out.println("thread is alive" + m4);
        } else {
            System.out.println("thread is not alive" + m4);
        }
        if (m5.isAlive()) {
            System.out.println("thread is alive" + m5);

        } else{
            System.out.println("thread is not alive"+m5);
        }

    }

    }
//CODE BY DEVASHISH AGARWAL 500082411