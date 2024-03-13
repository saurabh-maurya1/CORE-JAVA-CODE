
package multithreading_daemon_join_yield;
class MyThread extends Thread
{
    public void run()
    { 
        int count=1;
        while(true)
        {
            System.out.println(count++ +" MY Thread");
        }
    }
}

public class MultiThreading_Daemon_join_yield {


    public static void main(String[] args) throws Exception{
       MyThread t=new MyThread();
       t.start();

        int count=1;
        while(true)
        {
            System.out.println(count++ +" Main");
            Thread.yield();
        }
    }
    
}


/*
class MyThread extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}

public class MultiThreading_Daemon_join_yield {


    public static void main(String[] args) throws Exception{
       MyThread t=new MyThread();
       t.setDaemon(true);

       t.start();
//       try{
//           Thread.sleep(100);
//       }catch(Exception e){}


       Thread mainThread=Thread.currentThread();
       mainThread.join();
    }
    


Deamon will over then main will terminated so output will not apeear in the screen
yeild will give the most preority to uper class to print the output 
}

*/