
package reflection_practise;
import java.lang.reflect.*;
class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    
    public My(){}
    public My(int x,int y){}
    public void display(String s1,String s2){}
    public int show(int x,int y){return 0;}
}

public class Reflection_Practise {

    public static void main(String[] args) {
        Class c=My.class;
        System.out.println(c.getName());
           System.out.println("\n\n");
        
        
        Field field[]=c.getDeclaredFields();
        for(Field f:field)
        {
            System.out.println(f);
        }
          System.out.println("\n\n");
        
        Constructor con[]=c.getConstructors();
        for(Constructor co:con)
        {
            System.out.println(co);                                     
        }
        
          System.out.println("\n\n");
        
        Method meth[]=c.getMethods();
        for(Method m:meth)
        {
            System.out.println(m);
        }
          System.out.println("\n\n");
        
          
          Parameter param[]=meth[0].getParameters();
           for(Parameter pm:param)
        {
            System.out.println(pm);
        }
          
        
        /*
        My m=new My();
        Class c1=m.getClass();
      */
    }
    
}
