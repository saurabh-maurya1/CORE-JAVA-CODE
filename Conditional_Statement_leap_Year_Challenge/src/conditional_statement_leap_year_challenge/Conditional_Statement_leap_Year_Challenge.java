
package conditional_statement_leap_year_challenge;
import java.util.*;


public class Conditional_Statement_leap_Year_Challenge {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year ");
        int i=sc.nextInt();
        if(i%4==0)
        {
            if(i%100==0)
            {
                if(i%400==0)
                {
                    System.out.println("Year is leap year");
                }
                else
                {
                    System.out.println("Year is not leap year");
                }
            }
            else
            {
                System.out.println("Year is leap Year");
            }
        }
        else
        {
            System.out.println("Year is not leap Year");
        }
               
        
    }
    
}
