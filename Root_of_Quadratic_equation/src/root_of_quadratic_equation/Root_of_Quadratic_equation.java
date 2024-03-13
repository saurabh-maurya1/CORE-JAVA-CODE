
package root_of_quadratic_equation;
import java.util.*;

public class Root_of_Quadratic_equation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

       int a,b,c;
       double r1,r2;
       System.out.print("Enter the value of a , b and c :");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
       r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
       System.out.println("Root r1 is :"+r1);
       System.out.println("Root  r2 is :"+r2);
       System.out.println("Root are "+r1+","+r2);

    }
    
}
    