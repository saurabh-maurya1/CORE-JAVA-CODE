
package lamda_expression;
@FunctionalInterface
interface MyLambda
{
    public void display();
}

public class Lambda_Expression {

   
    public static void main(String[] args) {
        MyLambda m=()->{System.out.println("Hello World");};// lambda Expression
      
        
        m.display();
        
        
        
        /*
         MyLambda m=new MyLambda(){  // Anonimus Inner Class
            public void display()
            {
                System.out.println("Hello World");
            }
       };
        */
        
        }
    }
    



/*
package lamda_expression;
@FunctionalInterface
interface MyLambda
{
    public void display();
}
class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}
public class Lambda_Expression {

   
    public static void main(String[] args) {
        MyLambda m=new My();
        m.display();
    }
    
}

*/