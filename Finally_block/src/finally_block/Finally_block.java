
package finally_block;

public class Finally_block {
    static void meth1()throws Exception
  {  try
        {
          throw new Exception(); 
        }
      finally
        {
            System.out.println("Final Message");
        }
 }
    public static void main(String[] args)throws Exception {
       
        meth1();
        
        
        
        
        
        
        
        
        
        
    }  
}
/*

package finally_block;

public class Finally_block {
    public static void main(String[] args) {
        try
        {
System.out.println(10/2);
        }
        catch(ArithmeticException e)
        {
        System.out.println(e);
        }
        
    //  finally
        {
System.out.println("Final Message");
         }
    }  
}

*/