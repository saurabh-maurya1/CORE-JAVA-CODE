
package student_challenges_copy_a_file_io_stream;
import java.io.*;
public class Student_challenges_copy_a_file_io_Stream {
    public static void main(String[] args) throws Exception {
    FileInputStream fis1=new FileInputStream("Source1.txt");
     FileInputStream fis2=new FileInputStream("Source2.txt");
     
     FileOutputStream fos=new FileOutputStream("Destination.txt");
     
     SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
     
     
     int b;
     while((b=sis.read())!=-1)
     {
        fos.write(b);
     }
     sis.close();
   fis1.close();
    fis2.close();
   fos.close();

    }
    
}



/*

package student_challenges_copy_a_file_io_stream;
import java.io.*;
public class Student_challenges_copy_a_file_io_Stream {
    public static void main(String[] args) throws Exception {
    FileInputStream fis=new FileInputStream("Source1.txt");
     FileOutputStream fos=new FileOutputStream("Source2.txt");
     
     
     int b;
     while((b=fis.read())!=-1)
     {
         if(b>=65 && b<=90)fos.write(b+32);
         else fos.write(b);
     }
   fis.close();
   fos.close();

    }
    
}
*/


