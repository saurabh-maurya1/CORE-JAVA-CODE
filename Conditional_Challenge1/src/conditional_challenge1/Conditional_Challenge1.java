   
package conditional_challenge1;
import java.util.*;


public class Conditional_Challenge1 {

    public static void main(String[] args) {
 /*         Even or odd
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is Even"); 
        }
        else
        {
            System.out.println("Number is Odd");
        }
        
 
        young or not young
       
       int a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Age");
       a =sc.nextInt();
       if(a>=14&&a<=55)
       {
           System.out.println("Congratulation You are Young");
           
       }
       else
       {
           System.out.println("You are not Young");
       } */
 
     int m1,m2,m3;
     float avg;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your Three Subject mark ");
       m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();
       avg=(m1+m2+m3)/3f;
       if(avg>=70)
       {
           System.out.println("Grade A+");
       }
       else if(60<=avg&&avg<70)
       {
           System.out.println("Grade B+");
       }
       else if (50<=avg&&avg<60)
       {
           System.out.println("Grade C");
           
       }
       else if (40<=avg&&avg<50)
       {
           System.out.println("Grade D");
           
       }
       else
       {
           System.out.println("Grade F");
       }
       
 
 
 
    }
    
}
