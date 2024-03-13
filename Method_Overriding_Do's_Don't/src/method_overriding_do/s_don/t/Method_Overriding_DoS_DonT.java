
package method_overriding_do.s_don.t;


class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
    
}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class Method_Overriding_DoS_DonT {

    public static void main(String[] args) {
       Sub s=new Sub();
       s.display();
       
    }
    
}




/*

package method_overriding_do.s_don.t;
class A{}                 // dumy class
class B extends A{}

class Super
{
    public A display()
    {
        System.out.println("Super Display");
        return new A();                         // that is only one case when overrided return type is deffernet   it is object of class A
    }
    
}
class Sub extends Super
{
    @Override
    public B display()
    {
        System.out.println("Sub Display");
        return new B();                          // that is only one case when overrided returntype is deffernet   it is object of class B
    }
}

public class Method_Overriding_DoS_DonT {

    public static void main(String[] args) {
       Sub s=new Sub();
       s.display();
       
    }
    
}

*/