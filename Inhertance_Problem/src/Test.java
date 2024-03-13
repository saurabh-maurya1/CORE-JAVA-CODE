class Parent
{
    public Parent()
    {
        System.out.println("Non param of parent");
    }
    public Parent(int x)
    {
        System.out.println("param of parent "+x);
    }
}
class Child extends Parent
{
   public Child()
   {
       System.out.println("Non param of Child");
   }
   public Child(int x)
   {
       System.out.println("param of child");
       
   }
  public Child(int x,int y)
          
  {     super(x);
      System.out.println("2 param of child "+y);
  }
}


public class Test {
    public static void main(String[] args) {
        
      
        Child gn=new Child(10,20);
    }
    
}
