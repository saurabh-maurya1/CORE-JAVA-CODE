
package in_annotation;
@FunctionalInterface // interface with one single method 
interface My
{ 
    public void show();
   // public int add(int x,int y);
}

public class In_Annotation {
  
    public static void main(String[] args) {
    
    }
    
}















/*              ----------------
                @Override Method
                ----------------

package in_annotation;
class Parent
{
    public void display(){}
}
class Child extends Parent
{    @Override
    public void display(){}
}

public class In_Annotation {

   
    public static void main(String[] args) {
       
    }
    
}

*/


/*                   
                              --------------------  
                               @Deprecated Method
                              -------------------- 
               ( it is suggest to programmer not use this method because is removed in future)


     class Old
{
    public void display(){
    System.out.println("Hello");
  
    } 
    @Deprecated
    public void show()
    {
        System.out.println("Hi");
    }
    
}

public class In_Annotation {

   
    public static void main(String[] args) {
       Old o=new Old();
       o.show();
    }
    
*/


/*  
                      -------------------------------------------
                      @SuppressWarnings ("deprecation/unchecked")
                      -------------------------------------------  
package in_annotation;

import java.util.List;

class Old
{
    public void display(){
    System.out.println("Hello");
  
    } 
    @Deprecated
    public void show()
    {
        System.out.println("Hi");
    }
    
}

public class In_Annotation {
    static List l;
    
    // @SuppressWarnings("deprecation")
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
     l.add(10); // we are using add method without creating a object
     
        
        // Old o=new Old();
      // o.show();
    }
    
}
*/



/*
                                 ------------------------------------
                                 @SafeVarargs(safe variable argument)
                                -------------------------------------
package in_annotation;

//User Defined geniric class
class My<T>
{
    @SafeVarargs
    //this method should be private or final method
    private void show(T...arg) // it is variable argument which is geniric type it may not be work every type it may not be safe
    {
        for(T x:arg)
            System.out.println(x);
    }
}


public class In_Annotation {
  
    public static void main(String[] args) {
    
    }
    
}



*/