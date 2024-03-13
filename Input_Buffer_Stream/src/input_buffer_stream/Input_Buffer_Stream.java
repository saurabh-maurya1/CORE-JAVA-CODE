
package input_buffer_stream;
import java.io.*;
public class Input_Buffer_Stream {

    public static void main(String[] args) throws Exception {
FileInputStream fis=new FileInputStream("C:/MyJava/Test.text");
BufferedInputStream bis=new BufferedInputStream(fis);


  System.out.print((char)bis.read());
  System.out.print((char)bis.read());
  bis.mark(10);
  System.out.print((char)bis.read());
  System.out.print((char)bis.read());
  bis.reset();
  System.out.print((char)bis.read());
  System.out.print((char)bis.read());


    }
    
}



/*
package input_buffer_stream;
import java.io.*;
public class Input_Buffer_Stream {

    public static void main(String[] args) throws Exception {
FileInputStream fis=new FileInputStream("C:/MyJava/Test.text");
BufferedInputStream bis=new BufferedInputStream(fis);

int x;
while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }





    }
    
}

*/




/*
package input_buffer_stream;
import java.io.*;
public class Input_Buffer_Stream {

    public static void main(String[] args) throws Exception {
FileInputStream fis=new FileInputStream("C:/MyJava/Test.text");
BufferedInputStream bis=new BufferedInputStream(fis);

int x;
while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }





    }
    
}

*/