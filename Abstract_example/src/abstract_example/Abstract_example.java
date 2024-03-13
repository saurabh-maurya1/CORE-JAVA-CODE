
package abstract_example;

abstract class Super
{  
    public Super(){ System.out.println("Super constructor");}
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
}
class Sub extends Super
{     @Override
    public void meth2(){System.out.println("Sub Meth2");}
  
}
public class Abstract_example {

   
    public static void main(String[] args) {
        Super s=new Sub() ;
        s.meth1();
        s.meth2();
        
    }
    
}
