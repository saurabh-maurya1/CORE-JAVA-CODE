
package demo_try_with_resource;
import java.io.*;
import java.util.*;

public class Demo_try_With_Resource {

    static Scanner sc;
    static void Divide() throws Exception  //FileNotFoundException
    {
        try(FileInputStream fi=new FileInputStream("C:\\Users\\saura\\Documents\\Desktop\\Demo.txt"); Scanner sc=new Scanner(fi);)
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
       
    }
    public static void main(String[] args) throws Exception {
      try
      {
        Divide();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      

    }
    
}


/*

package demo_try_with_resource;
import java.io.*;
import java.util.*;

public class Demo_try_With_Resource {

    static FileInputStream fi;
    static Scanner sc;
    static void Divide() throws Exception  //FileNotFoundException
    {
        fi=new FileInputStream("C:\\Users\\saura\\Documents\\Desktop\\Demo.txt");
        try
        {
        sc=new Scanner(fi); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        finally
        {
        fi.close();
        sc.close();   
        }
    }
    public static void main(String[] args) throws Exception {
      try
      {
        Divide();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      int x=sc.nextInt();
      System.out.println(x);

    }
    
}

*/