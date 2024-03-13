
package input_stream_file;
import java.io.*;
//import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

public class Output_Stream_File {

    public static void main(String[] args) throws Exception {
          
       // try with Resource
        try (FileOutputStream fos = new FileOutputStream("C:/MyJava/Test.text")) {
            String str="Learn Java Programming" ;
            byte b[]=str.getBytes();
            fos.write(b);
        }
             }
    }


    
    
    
    








/*

package input_stream_file;
import java.io.*;
//import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

public class Input_Stream_File {

    public static void main(String[] args) {
          try{
              FileOutputStream fos=new FileOutputStream("C:/MyJava/Test.text");
             String str="Learn Java Programming" ;
             byte b[]=str.getBytes();
             fos.write(b, 6, str.length()-6);
             /*  for(byte x:b) 
                     fos.write(x);   
                                     +/
            //fos.write(str.getBytes());
             // for.write(b);
              //fos.close();
              
              
          }
          catch(FileNotFoundException e)
          {
              System.out.println(e);
              
          }catch(IOException e)
          {
              System.out.println(e);
          }

    
    
    }
    
}

*/