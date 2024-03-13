
package p_stringtokenizer;
import java.util.*;
import java.io.*;
public class P_StringTokenizer {

    public static void main(String[] args)throws Exception {
         
        
        FileInputStream fis=new FileInputStream("C:\\Users\\saura\\Desktop\\Data.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);
        StringTokenizer stk=new StringTokenizer(data,","); 
        
        ArrayList<Integer> al=new ArrayList<>();
        String s;
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(Integer.valueOf(s));
        }
              al.forEach(System.out::println);
        System.out.println(al);

        
        
    }
    
}



/*

package p_stringtokenizer;
import java.util.*;
import java.io.*;
public class P_StringTokenizer {

    public static void main(String[] args) {
         
        String data="name=vijay;address=delhi;country=india;dept=cse";//key=value; pair  here key&value are token and =&; are delimeter
        // String data="name=vijay\naddress=delhi\ncountry=india\ndept=cse"; // if it has new line (\n) there is no need of to give delemiter as \n 
       
        // String data="name=vijay address=delhi country=india dept=cse";// if delemeter is space " " so we have to give delemeter as space  in given below 
        
        StringTokenizer stk=new StringTokenizer(data,"=;");
        
        String s;
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            System.out.println(s);
        }
        
        
        
    }
    
}

*/





/*

package p_stringtokenizer;
import java.util.*;
import java.io.*;
public class P_StringTokenizer {

    public static void main(String[] args)throws Exception {
         
        
        FileInputStream fis=new FileInputStream("C:\\Users\\saura\\Documents\\Desktop\\Student.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);
        StringTokenizer stk=new StringTokenizer(data,"=");
        
        String s;
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            System.out.println(s);
        }
        
        
        
    }
    
}
*/