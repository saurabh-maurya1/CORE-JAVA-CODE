
package multithreading_constructor_method;
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
       
    }
    public void run()
    {
        int count=1;
        while(true)
        {
           System.out.println(count++);
           try{
           Thread.sleep(500);
           }catch(InterruptedException e)
           {
               System.out.println(e);
           }
        }
    }
}
public class Multithreading_constructor_Method {

    public static void main(String[] args) {
   MyThread t=new MyThread("My Thread 1");
   t.start();
   t.interrupt();
   
   
   
   
    }
    
}
/*
class MyRun implements Runnable
{
    public void run(){}
}

public class Multithreading_constructor_Method {

    public static void main(String[] args) {
       Thread t=new Thread(new MyRun(),"My Name"); 
     
    }
    
}
















class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
    }
}
public class Multithreading_constructor_Method {

    public static void main(String[] args) {
    MyThread t=new MyThread("My Thread 1");
  //  t.setPriority(Thread.MAX_PRIORITY);
    System.out.println("ID "+t.getId());
     System.out.println("Name "+t.getName());
     System.out.println("Priority "+t.getPriority());
     
    t.start();
     System.out.println("State "+t.getState());
     System.out.println("Alive "+t.isAlive());
    }










*/