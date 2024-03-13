
package multithreading_thread_class;


public class MultiThreading_Thread_Class extends Thread {
public void run()
    {
       int i=1;
       while(true)
       {
           System.out.println(i+"Hello");
           i++;
       }
    }
    public static void main(String[] args) {
        MultiThreading_Thread_Class    t=new MultiThreading_Thread_Class();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
    
}



/*
class MyThread extends Thread
{
    public void run()
    {
       int i=1;
       while(true)
       {
           System.out.println(i+"Hello");
           i++;
       }
    }
    
}

public class MultiThreading_Thread_Class {

    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
    
}

*/