
package nested_catch_exception;

public class Nested_catch_Exception {

    public static void main(String[] args) {
      int []A={30,20,10,40,0};
   try
      {  
         
          int c=A[0]/A[3];
          System.out.println("Divison is "+c);
         try{
         
          System.out.println(A[5]);
         } 
         catch(ArrayIndexOutOfBoundsException e)
        {
        System.out.println("Index is Invalid");
        }
         
     }
      catch(ArithmeticException e)
          {
          System.out.println("Denominator should not be 0");
          }
      System.out.println("Bye");
    }
    
}
/*
public class Nested_catch_Exception {

    public static void main(String[] args) {
      int []A={30,20,10,40,0};
      try
      {
          int c=A[0]/A[1];
          System.out.println("Divison is "+c);
            
          System.out.println(A[5]);
      }catch(ArithmeticException e)
      {
          System.out.println("Denominator should not be 0");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Index is Invalid");
      }
    }
    
*/
