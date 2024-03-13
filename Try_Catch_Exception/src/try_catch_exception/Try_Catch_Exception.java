
package try_catch_exception;
import java.util.Scanner;


public class Try_Catch_Exception {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter two number");
int a=10,b=2,c;
a=sc.nextInt();
b=sc.nextInt();
 try {
     c=a/b;
  System.out.println("Devision is "+c);}
 
 
 catch(ArithmeticException e){
     System.out.println("Denominator should not be 0, try again");
     
 }
  System.out.println("Bye");
  
    }
    
}
