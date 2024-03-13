
package switch_case_challenges1;
import java.util.*;


public class Switch_Case_Challenges1 {

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter Domain Name");
        String str=sc.nextLine();
         String str2=str.substring(str.lastIndexOf(".")+1);
         switch(str2)
                 {
                     case "com": System.out.println("Commercial");
                     break;
                     case "gov": System.out.println("Government");
                     break;
                     case "net": System.out.println("Network");
                     break;
                     case "org": System.out.println("Organistaion");
                     break;
                     default: System.out.println("Other");
                 }
        
        
        
        
        
        
        
        
        /*
        
        
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        month=sc.nextInt();
        switch(month)
        {
            case 1: System.out.println("Jan");
            break;
            case 2: System.out.println("Feb");
            break;
            case 3: System.out.println("Mar");
            break;
            case 4: System.out.println("Api");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("Jun");
            break;
            case 7: System.out.println("Jul");
            break;
            case 8: System.out.println("Aug");
            break;
            case 9: System.out.println("Sep");
            break;
            case 10: System.out.println("Oct");
            break;
            case 11: System.out.println("Nov");
            break;
            case 12: System.out.println("Dec");
            break;
            default : System.out.println("Invalid");
            
        }
        
        
        /*
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        day=sc.nextInt();
        switch(day)
        {
            case 1: System.out.println("Mon");
            break;
            case 2: System.out.println("Tue");
            break;
            case 3: System.out.println("Wed");
            break;
            case 4: System.out.println("Thu");
            break;
            case 5: System.out.println("Fri");
            break;
            case 6: System.out.println("Sat");
            break;
            case 7: System.out.println("Sun");
            break;
            default : System.out.println("Invalid");
        }
        */
        
        
        
        
        
        
        
        
       
    }
    
}
