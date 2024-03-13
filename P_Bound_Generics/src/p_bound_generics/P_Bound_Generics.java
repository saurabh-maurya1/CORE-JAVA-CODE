
package p_bound_generics;
/*class A{}
class B extends A{}
class C extends A{}
*/
interface A{}
class B implements A{}
class C implements A{}


class MyArray<T extends A>
{
    T A[]=(T[])new Object[10];
    int length=0;
    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length; i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class P_Bound_Generics {

   
    public static void main(String[] args) {
      MyArray<A> ma=new MyArray<>();
       //MyArray<B> ma=new MyArray<>();
      // MyArray<C> ma=new MyArray<>();
      
      
      
        
        
        
        
        
    }
    
}



/*
         if there is no parameter the it will by default object;


              ------------------
              Multiple parameter
              -------------------

package p_bound_generics;
class MyArray<T,K>
{
    T A[]=(T[])new Object[10];
    int length=0;
    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length; i++)
        {
            System.out.println(A[i]);
        }
    }
}
public class P_Bound_Generics {

   
    public static void main(String[] args) {
      MyArray<String,Integer> ma=new MyArray();
    
    
        
        
        
        
        
    }
    
}

*/




/*
  



               ------------------
                subtype
                -----------------
package p_bound_generics;
class MyArray<T>
{
    T A[]=(T[])new Object[10];
    int length=0;
    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length; i++)
        {
            System.out.println(A[i]);
        }
    }
}
class MyArray2<T> extends MyArray<T>
{
    
}
public class P_Bound_Generics {

   
    public static void main(String[] args) {
      MyArray2<String> ma=new MyArray2<>();
      
      ma.append("bye");
      ma.append("sjf");
    
    
        
        
        
        
        
    }
    
}


*/



/*
                -----------------
                Bounded type
                ----------------


package p_bound_generics;
class MyArray<T extends Number>
{
    T A[]=(T[])new Object[10];
    int length=0;
    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length; i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class P_Bound_Generics {

   
    public static void main(String[] args) {
      MyArray2<Float> ma=new MyArray2<>();
      
      ma.append(8.88f);
      ma.append(5.6f);
    
    
        
        
        
        
        
    }
    
}
*/