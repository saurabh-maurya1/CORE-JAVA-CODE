
package parameter_in_lambda_expression;
@FunctionalInterface
interface MyLambda
{
    public int add(int x,int y);
}


public class Parameter_In_Lambda_Expression {

   
    public static void main(String[] args) {
        MyLambda m=(a,b)->a+b;
     System.out.println( m.add(50,60));
     
     
     
     
     /*
      MyLambda m=(a,b)->{return (a+b);};
     System.out.println( m.add(50,60));
     */
    }
    
}


/*
package parameter_in_lambda_expression;
@FunctionalInterface
interface MyLambda
{
    public void display(String str);
}


public class Parameter_In_Lambda_Expression {

   
    public static void main(String[] args) {
        MyLambda m=(s)->{System.out.println(s);};// lambda Expression
      
        
        m.display("Hello World");
    }
    
}

*/