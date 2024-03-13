
package conditonal_statement_days_name;
import java.util.*;


public class Conditonal_Statement_Days_name {


    public static void main(String[] args) {
        
        
        
        /*
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("Monday");
            
        }
        else if(a==2)
        {
            System.out.println("Tuesday");
        }
        else if(a==3)
        {
            System.out.println("Wednesday");
        } 
        else if(a==4)
        {
            System.out.println("Thursday");
        }
        else if(a==5)
        {
            System.out.println("Friday");
            
        }
        else if(a==6)
        {
            System.out.println("Saturday");
        }
        else if(a==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Day Number");
        }
      */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a URL (httpX://www.XYZ.com) format");
        String url=sc.nextLine();
        int a=url.indexOf(":");
        String str1=url.substring(0,a);
       
            if(str1.equals("http"))
            {
                System.out.println("Protocol: Hyper Text Tranfer");
            }
            else if(str1.equals("https"))
            {
                System.out.println("protocol: Secure Hyper Text Tranfer ");
            }
            else if(str1.equals("ftp"))
            {
                System.out.println("protocol: File Tranfer ");
            } 
            else
            {
                System.out.println("Other Protocol");
            }
       
        int b=url.lastIndexOf(".");
        String str2=url.substring(b);
        
        if(str2.equals(".com"))
        {
                System.out.println("Website: commercial");
            }
           
        else if(str2.equals(".org"))
            {
                System.out.println("Website: Organisation");
            }
        else if(str2.equals(".net"))
            {
                System.out.println("Website: Network");
            }
         
        else if(str2.equals(".gov"))
            {
                System.out.println("Website: Government");
            }
           
       else
          {
            System.out.println("Website : Other");
          }
        }
}
    

