
package bytearray_stream;
import java.io.*;

public class ByteArray_Stream {

    public static void main(String[] args) throws Exception {
byte b[]={'a','b','c','d','e','f','g','h','i','j'};
ByteArrayInputStream bis=new ByteArrayInputStream(b);
System.out.println(bis.markSupported());
bis.close();
    }
    
}


/*

package bytearray_stream;
import java.io.*;

public class ByteArray_Stream {

    public static void main(String[] args) throws Exception {
byte b[]={'a','b','c','d','e','f','g','h','i','j'};
ByteArrayInputStream bis=new ByteArrayInputStream(b);
int x;
while((x=bis.read())!=-1)
{
    System.out.print((char)x);
}
bis.close();
    }
    
}

*/






/*


package bytearray_stream;
import java.io.*;

public class ByteArray_Stream {

    public static void main(String[] args) throws Exception {
byte b[]={'a','b','c','d','e','f','g','h','i','j'};
ByteArrayInputStream bis=new ByteArrayInputStream(b);
String str=new String(bis.readAllBytes());
System.out.println(str);
bis.close();
    }
    
}

*/