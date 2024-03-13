
package interface_do.s_don.t;
interface Test
{
    
   final static int X=10; // it is by default final static       
   public abstract void meth1();  // by default it is public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
     private void meth6() // it will only use by default method it will not use outside of the interface 
    {
        System.out.println("Meth6 of Test");
    }
    default void meth5()
    {
        meth6();  // here private method will call
        System.out.println("Meth5 of Test");
    }
}
interface Test2 extends Test
{
     void meth4();
}
class My implements Test2
{
   public void meth1(){}
   public void meth2(){}
  
   public void meth4(){}
   //public  void meth5(){}  //that is overided default
   
}
public class Interface_DoS_DonT {

    public static void main(String[] args) {
        
        
       System.out.println(Test.X);
       Test.meth3();
        My m=new My();
       m.meth5();
        
       
    }
    
}
