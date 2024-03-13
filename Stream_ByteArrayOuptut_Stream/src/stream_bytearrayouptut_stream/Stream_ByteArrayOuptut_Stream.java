
package stream_bytearrayouptut_stream;

import java.io.*;

public class Stream_ByteArrayOuptut_Stream {


    public static void main(String[] args) throws Exception{

ByteArrayOutputStream bos=new ByteArrayOutputStream(20);   
    bos.write('a');
    bos.write('b');
    bos.write('c');
    bos.write('d');
    
    
   bos.writeTo(new FileOutputStream("C:\\Users\\saura\\Documents\\Desktop\\Test.txt"));
   
    
    
    bos.close();
    
    
    }
   
    
    
}





/*





package stream_bytearrayouptut_stream;

import java.io.*;

public class Stream_ByteArrayOuptut_Stream {


    public static void main(String[] args) throws Exception{

ByteArrayOutputStream bos=new ByteArrayOutputStream(20);   
    bos.write('a');
    bos.write('b');
    bos.write('c');
    bos.write('d');
    
    
    byte b[]=bos.toByteArray();
    
    for(byte x:b)
        System.out.println((char)x);
        //System.out.println(x);
        
    
    
    bos.close();
    
    
    }
   
    
    
}

*/