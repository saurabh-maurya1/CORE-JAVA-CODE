
package method_over_riding;
class Super
{
    public void display()
    {
        System.out.println("Super class Display");
    }
    
}
class Sub extends Super
{
    
    public  void display()
    {
        System.out.println("Sub Class Display");
    }
}

public class Method_Over_Riding {

    public static void main(String[] args) {
      Super sup=new Sub();
              sup.display();
//        Sub s=new Sub();
//        s.display();
    }
    
}
