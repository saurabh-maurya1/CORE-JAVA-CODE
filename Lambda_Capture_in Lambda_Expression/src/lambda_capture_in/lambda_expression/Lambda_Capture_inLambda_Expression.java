
package lambda_capture_in.lambda_expression;

interface MyLambda
{
    public void display(); 
}
class UseLambda
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}
class Demo
{  
     public void method1()
     {
        UseLambda ul=new UseLambda();
        ul.callLambda(()->{System.out.println("Hello");});
     }
}
public class Lambda_Capture_inLambda_Expression {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
    
}
/*       
            ------------------------------------------------------
            Lambda Expression with local variable it is modifiable
            ------------------------------------------------------

interface MyLambda
{
    public void display();
}
class Demo
{
    public void method1()
    {
        MyLambda ml=()->{
            int count=0;
            count++;
            System.out.println("Hi");
            System.out.println("Bye"+count);
        };
        ml.display();
    }
}
public class Lambda_Capture_inLambda_Expression {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
    
}

*/




/*
package lambda_capture_in.lambda_expression;

interface MyLambda
{
    public void display();
}
class Demo
{  
    int temp=100;
    public void method1()
    { final int count=0;// it should be final or not modifiable in future effectively final;
        MyLambda ml=()->{
            
            System.out.println("Hi"+(++temp));
            System.out.println("Bye"+count);
        };
        ml.display();
    }
}
public class Lambda_Capture_inLambda_Expression {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
    
}
*/