
package p_generic_methods;
class A{}
class B extends A{}
class C extends B{}
class MyArray<T>
{
    T A[]=(T[]) new Object[10];
    int length =0;
    
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

public class P_Generic_Methods {
   static void fun(MyArray<? super C> obj)// allow c itself and its super class as B and A
   {
       obj.display();
   }
   
 
    public static void main(String[] args) {
        
        MyArray<B> ma1=new MyArray<>();
       
        
        MyArray<C> ma2=new MyArray<>();
        fun(ma1);
        fun(ma2);
        
        
        
    }
    
}



/*

package p_generic_methods;
interface A{}
class B implements A{}
class C implements A{}
class MyArray<T>
{
    T A[]=(T[]) new Object[10];
    int length =0;
    
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

public class P_Generic_Methods {
    static <E> void show(E[] list)  // before the return type parameter  define generic
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        
        show(new String[]{"Hi","Go","Bye"});
        show(new Integer[]{10,292,22,4,5});
        
        
        
        
        
    }
    
}
*/




/*
                   ----------------
                   Variable argument
                   -----------------


package p_generic_methods;
interface A{}
class B implements A{}
class C implements A{}
class MyArray<T>
{
    T A[]=(T[]) new Object[10];
    int length =0;
    
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

public class P_Generic_Methods {
    static <E> void show(E... list)  // before the return type parameter  define generic
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        
        show("Hi","Go","Bye");
        show(10,292,22,4,5);
        
        
        
        
        
    }
    
}


*/




/*


                                --------------------
                                Bounded Generic
                                -------------------
 

package p_generic_methods;
interface A{}
class B implements A{}
class C implements A{}
class MyArray<T>
{
    T A[]=(T[]) new Object[10];
    int length =0;
    
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

public class P_Generic_Methods {
    static <E extends Number> void show(E... list)  // before the return type parameter  define generic
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        
        show("Hi","Go","Bye");
        show(10,292,22,4,5);
        
        
        
        
        
    }
    
}






*/



/*

package p_generic_methods;
interface A{}
class B implements A{}
class C implements A{}
class MyArray<T>
{
    T A[]=(T[]) new Object[10];
    int length =0;
    
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

public class P_Generic_Methods {
   static void fun(MyArray<?> obj)// unbounded and wildcard <?>    (MyArray<?> obj) same as (MyArray obj)
   {
       obj.display();
   }
   
   /*
   static void fun(MyArray<? extends Number> obj) // upper bound
   {
       obj.display();
   }

/*static void fun(MyArray<? super Number> obj)
   {
       obj.display();
   }
   
   

    public static void main(String[] args) {
        
        MyArray<String> ma1=new MyArray<>();
        ma1.append("Hi");
        ma1.append("Bye");
        
        MyArray<Integer> ma2=new MyArray<>();
        ma2.append(10);
        ma2.append(20);
        
        fun(ma1);
        fun(ma2);
        
        
    }
    
}
*/