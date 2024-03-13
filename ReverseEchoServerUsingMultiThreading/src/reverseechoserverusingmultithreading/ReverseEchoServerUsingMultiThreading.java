
package reverseechoserverusingmultithreading;
import java.net.*;
import java.io.*;

public class ReverseEchoServerUsingMultiThreading extends Thread {
  Socket stk;
  int count;
  public ReverseEchoServerUsingMultiThreading(Socket st, int c){
      stk=st;
      this.count=c;
  
  }
  public void run(){
      try{
          BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
          PrintStream ps = new PrintStream(stk.getOutputStream());
           
          String msg ;
          StringBuilder sb;
          do{
              msg=br.readLine();
           System.out.println("Recieve From Client "+count+" "+msg);

              sb=new StringBuilder(msg);
              sb.reverse();
              msg=sb.toString();
              
              
              ps.println(msg);
          }while(!msg.equals("dne"));
          System.out.println("Disconnected Client "+count);
          stk.close();
      }catch(Exception e){}
  }
 
    public static void main(String[] args)throws Exception {
    ServerSocket ss = new ServerSocket(2000);
    int count = 1;
    Socket stk;
    ReverseEchoServerUsingMultiThreading re;
    do{
        stk = ss.accept();
        System.out.println("Client connected :"+count);
        re=new ReverseEchoServerUsingMultiThreading(stk,count);
        count++;
        re.start();
    }while(true);
    }
    
}


class Client 
{
    public static void main(String[] args) throws Exception
    {    System.out.println("Clint Server is Start you can perform Operation ");

        Socket stk=new Socket("192.168.1.107", 2000);
        
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        
        do
        {
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("Recieve From Server "+msg);
            
        }while(!msg.equals("dne"));
        stk.close();
    }    
}