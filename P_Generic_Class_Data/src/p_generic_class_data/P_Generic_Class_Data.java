                        /* ----------------
                             class MyArray
                           ---------------*/
package p_generic_class_data;
                        
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

public class P_Generic_Class_Data {

    public static void main(String[] args) {
      MyArray<Integer> ma=new MyArray<>();
      ma.append(10);
      ma.append(20);
      ma.append(30);
      ma.display();
    }
    
}



/*                   --------------------
                     generic class Data
                    ---------------------

package p_generic_class_data;

class Data<T>
{
    private T obj;
    public void setData(T v)
    {
        obj=v;
    }
    public T getData()
    {
        return obj;
    }
}

public class P_Generic_Class_Data {

    public static void main(String[] args) {
      Data<Integer> d=new Data<>();  //  Same as Data<Integer> d=new Data<Integer>();  
      d.setData(10);// d.setData(new Integer(10));
      System.out.println(d.getData());
    }
    
}

*/