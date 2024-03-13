
package resource_input_stream_file;
import java.io.*;

public class Resource_Input_Stream_File {

   
    public static void main(String[] args) throws Exception {
     //   try (FileInputStream fis = new FileInputStream("C:/MyJava/Test.text"))
     try (FileReader fr = new FileReader("C:/MyJava/Test.text")){  // here fileInputstream and filereader both are same theing
        int  x;
//        do
//        {        int  x;

//            x=fis.read();
//            if(x!=-1)
//            System.out.print((char)x);
//        }while(x!=-1);

      while((x=fr.read())!=-1) 
              {
                  System.out.print((char)x);
              }
      
         
     }
    }
    
}



/*

package resource_input_stream_file;
import java.io.*;

public class Resource_Input_Stream_File {

   
    public static void main(String[] args) throws Exception {
     try (FileInputStream fis = new FileInputStream("C:/MyJava/Test.text")){
         byte[]b=new byte[fis.available()];// available method will give the information how many byte present inside the file
         fis.read(b);
         String str=new String(b);
         System.out.println(str);
         
         
     }
    }
    
*/