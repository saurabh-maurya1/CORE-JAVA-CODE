
package reverseecho;
import java.net.*;
import java.io.*;
public class ReverseEcho {

    public static void main(String[] args)throws Exception {

        ServerSocket ss = new ServerSocket(2000);
                Socket stk = ss.accept();
      
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps =new PrintStream(stk.getOutputStream());
       System.out.println("Server is start ");
        
        String msg;
        StringBuilder sb;
        do{  //reading
            msg=br.readLine();
            System.out.println("Recieve From Client "+msg);
            //string change into StringBuilder and reverse
            sb = new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
            
             //writing
             ps.println(msg);
        }while(!msg.equals("dne"));
        stk.close();
        
        
        
        
        
    }
    
}


// i can add new class also but insted of new Class we are wirte down here only



  class Client {

    public static void main(String[] args)throws Exception {
System.out.println("Clint Server is Start you can perform Operation ");
       Socket stk = new Socket("192.168.1.107", 2000);
        
       BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps =new PrintStream(stk.getOutputStream());
      
        
        
        String msg;
        do{  //reading
            msg=keyb.readLine();
            //send to the server
            ps.println(msg);
            //recive the server msg;
            msg=br.readLine();
            //print the server message
            System.out.println("Recieve From Server "+msg);
        }while(!msg.equals("dne"));
        stk.close();
        
        
        
        
        
    }
    
}