 
package command_lineargument_challenges;

public class Command_LineArgument_Challenges {

    public static void main(String[] args) {
        
        double s=0;
        for(String x:args )
        {   if(x.matches("[0-9\\.]+"))// 0-9 and decimal(.) is allow
            s=s+Double.parseDouble(x);
        }
        System.out.println("Sum is "+s);
        
      
    }
    
}
