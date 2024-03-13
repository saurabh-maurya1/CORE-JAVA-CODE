
package multithreading_runnable_class;
 class MyRunnable implements Runnable
 { 
     public void run()
    {
        int i= 1;
        while(true)
        {
            System.out.println(i+"Hello");
        }
    }
     
 }
public class MultiThreading_Runnable_Class {
   
    
    public static void main(String[] args) {
       MyRunnable t=new MyRunnable();
       Thread th=new Thread(t);
       th.start();
       int i=1;
       while(true)
       {
           System.out.println(i+"World");
           i++;
       }
    }
    
}


/*

public class MultiThreading_Runnable_Class implements Runnable {
    public void run()
    {
        int i= 1;
        while(true)
        {
            System.out.println(i+"Hello");
        }
    }

    
    public static void main(String[] args) {
       MultiThreading_Runnable_Class t=new  MultiThreading_Runnable_Class();
       Thread th=new Thread(t);
       th.start();
       int i=1;
       while(true)
       {
           System.out.println(i+"World");
           i++;
       }
    }
 
*/