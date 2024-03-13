
package throws_throw_practise;
class NegativeDimentsionException extends Exception
{
    public String toString()
    {
        return " Dimension of a Rectangle can not be negative";
    }
}

public class Throws_Throw_practise {
   static int area(int l, int b) throws NegativeDimentsionException
   {  if(l<0||b<0)
   {
       throw new NegativeDimentsionException();
   }
       return l*b;
   }
   static void  meth1()throws NegativeDimentsionException
   {
       System.out.println("Area is "+area(-10, 5));
   }
    
    
    public static void main(String[] args)  {
    try
    {
        meth1();
    }catch(NegativeDimentsionException e)
    {
        System.out.println(e);
    }
    }
    
}
/*

package throws_throw_practise;


public class Throws_Throw_practise {
    static int meth1()
    {
        return 10/0;
    }
    static void meth2()
    {
        meth1();
    }
    static void meth3()
    {
        meth2();
    }
    
    
    
    
    
    public static void main(String[] args) {
       try
       {
        meth3();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
    
}





package throws_throw_practise;


public class Throws_Throw_practise {
   static int area(int l, int b) throws Exception
   {  if(l<0||b<0)
   {
       throw new Exception();
   }
       return l*b;
   }
   static void  meth1()throws Exception
   {
       System.out.println("Area is "+area(-10, 5));
   }
    
    
    public static void main(String[] args) throws Exception {
     meth1();
    }
    
}







public class Throws_Throw_practise {
   static int area(int l, int b) throws Exception
   {  if(l<0||b<0)
   {
       throw new Exception();
   }
       return l*b;
   }
   static void  meth1()throws Exception
   {
       System.out.println("Area is "+area(-10, 5));
   }
    
    
    public static void main(String[] args)  {
    try
    {
        meth1();
    }catch(Exception e)
    {
        System.out.println(e);
    }
    }
*/