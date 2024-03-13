
package file_class;
import java.io.*;
public class File_class {

    public static void main(String[] args)throws Exception {
        File f=new File("c:\\MyJava\\Data.txt");
        f.setWritable(true);
        FileOutputStream fos =new FileOutputStream("c:\\MyJava\\Data.txt");
        
      
        
    }
    
}



/*



package file_class;
import java.io.*;
public class File_class {

    public static void main(String[] args)throws Exception {
        File f=new File("c:\\MyJava");
        System.out.println(f.isDirectory());
        String list[]= f.list();
        
        for(String x:list )
        {
            System.out.println(x);
        }
        
        
        
        
    }
    
}
*/




/*

package file_class;
import java.io.*;
public class File_class {

    public static void main(String[] args)throws Exception {
        File f=new File("c:\\MyJava");
        System.out.println(f.isDirectory());
        File list[]= f.listFiles();
        
        for(File x:list )
        {
            System.out.print(x.getName()+" ");
            System.out.println(x.getPath());
        }
        
        
        
        
    }
    
}
*/