
package local_inner_static_classes;

class Outer
{ int x=10;
static int y=20;
static class My
        {
            public void show()
            { 
                System.out.println(""+y);
            }
        }
    }

public class Local_Inner_Static_classes {

    
    public static void main(String[] args) {
      Outer.My m=new Outer.My();
      m.show();
    }
    
}
/*
class Outer
{
    public void display()
    {
        class Inner
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }
       new Inner().show();  // Inner i=new Inner();

    }
}



package local_inner_static_classes;
 interface My     //abstract or interface
{
    abstract public void show();
}
class Outer
{
    public void display()
    { 
      new My(){public void show (){System.out.println("Hello");}}.show();
//My m=new My(){public void show (){System.out.println("Hello");}};
         
        }
       

    }

public class Local_Inner_Static_classes {

    
    public static void main(String[] args) {
      Outer o=new Outer();
      o.display();
    }
    
}
*/