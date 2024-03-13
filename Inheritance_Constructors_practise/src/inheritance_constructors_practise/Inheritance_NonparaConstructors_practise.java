
package inheritance_constructors_practise;
class Parent
{
    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}
class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor");
}
        
}
public class Inheritance_NonparaConstructors_practise {

    public static void main(String[] args) {
        GrandChild c=new GrandChild();
        
    }
    
}
