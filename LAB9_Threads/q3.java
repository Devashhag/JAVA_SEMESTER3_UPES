package LAB9_Threads;
//3.Write a program to launch 10 threads.
// Each thread increments a counter variable. Run the program with synchronization.

class TenThreads
{
    static int i = 1;
    synchronized void ten(String s)
    {
        try {
            System.out.println(s + i);
            i++;
        } catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class tenthreads1 extends Thread
{
    String s;
    TenThreads m;
    tenthreads1(String name,TenThreads M)
    {
        s = name;
        m = M;
        start();
    }

    public void run()
    {
        m.ten(s);  ///just like target.call message in the example 7
    }
}

public class q3 {
    public static void main(String[] args)
    {
        TenThreads t  = new TenThreads();
        new tenthreads1("Thread 1: ", t);
        new tenthreads1("Thread 2: ", t);
        new tenthreads1("Thread 3: ", t);
        new tenthreads1("Thread 4: ", t);
        new tenthreads1("Thread 5: ", t);
        new tenthreads1("Thread 6: ", t);
        new tenthreads1("Thread 7: ", t);
        new tenthreads1("Thread 8: ", t);
        new tenthreads1("Thread 9: ", t);
        new tenthreads1("Thread 10: ", t);

    }

}
