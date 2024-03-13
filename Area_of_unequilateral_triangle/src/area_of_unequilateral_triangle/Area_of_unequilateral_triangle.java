 
package area_of_unequilateral_triangle;
import java.util.*;


public class Area_of_unequilateral_triangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float area,s,a,b,c;
        System.out.println("Enter the Side of triangle");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2f;
       area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("Area of the Triangle is :"+area);
        
    }
    
}
