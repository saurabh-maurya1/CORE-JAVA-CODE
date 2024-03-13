
package stream_data_streams;
import java.io.*;
class Student
{
    int rollno;
    String name;
    String dept;
    Float avg;
    
}
public class Stream_Data_Streams {
    public static void main(String[] args) throws Exception{
   FileInputStream fis=new FileInputStream("C:\\MyJava\\Student2.txt");
        DataInputStream dis=new DataInputStream(fis);
        Student s=new Student();
        
     s.rollno=dis.readInt();
          s.name=dis.readUTF();

     s.avg=dis.readFloat();
     s.dept=dis.readUTF();
     
     System.out.println("Roll No :"+s.rollno);
System.out.println("Name :"+s.name);
System.out.println("Average :"+s.avg);
System.out.println("Dept :"+s.dept);
     
        
        dis.close();
        fis.close();
        
        
        
        
    }
    
}






/*


       ------------------
         write the file
      -----------------

package stream_data_streams;
import java.io.*;
class Student
{
    int rollno;
    String name;
    String dept;
    Float avg;
    
}
public class Stream_Data_Streams {
    public static void main(String[] args) throws Exception{
   FileOutputStream fos=new FileOutputStream("C:\\MyJava\\Student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        Student s=new Student();
        
        s.rollno=10;
        s.name="Saurabh";
        s.dept="CSE";
        s.avg=50.2f;
        
        
        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.dept);
        
        dos.close();
        fos.close();
        
        
        
        
    }
    
}

*/