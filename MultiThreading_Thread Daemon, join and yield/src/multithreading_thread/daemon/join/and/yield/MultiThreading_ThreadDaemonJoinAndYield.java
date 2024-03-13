
package multithreading_thread.daemon.join.and.yield;
 /*                           ---------------------
                                   yield Thread 
                              -------------------- 
*/
class MyThread extends Thread {
public void run(){
    int count=1;
    while(true){
        System.out.println("MyThread "+count++);
    }
}
}
public class MultiThreading_ThreadDaemonJoinAndYield {

    public static void main(String[] args)throws Exception {
       MyThread t = new MyThread();
       t.setDaemon(true);
       t.start();
        int count=1;
    while(true){
        System.out.println("MainThread "+count++);
        Thread.yield();
    }
    }
    
}



/*
            ---------------------
                Daemon Thread 
            --------------------
    "Daemon Thread are dependent Thread if the  main application is terminating then Daemon thread is also Terminate."


class MyThread extends Thread {
public void run(){
    int count=1;
    while(true){
        System.out.println(count++);
    }
}
}
public class MultiThreading_ThreadDaemonJoinAndYield {

    public static void main(String[] args) {
       MyThread t = new MyThread();
       t.setDaemon(true);
       t.start();
       try{Thread.sleep(100);}catch(Exception e){}
    }
    
}







                            ---------------------
                               join Thread 
                            --------------------

class MyThread extends Thread {
public void run(){
    int count=1;
    while(true){
        System.out.println(count++);
    }
}
}
public class MultiThreading_ThreadDaemonJoinAndYield {

    public static void main(String[] args)throws Exception {
       MyThread t = new MyThread();
       t.setDaemon(true);
       t.start();
       Thread mainThread = Thread.currentThread();
       mainThread.join();
    }
    
}








                        















*/