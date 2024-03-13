

/* Find if a Number is Binary or not.
   Find is a Number is Hexa-Decimal or not 
   Find is the data is Date format (dd/mm/yyy)
*/


package regular_expression_challenges;

public class Regular_Expression_Challenges {

    public static void main(String[] args) {
        
        int b=1010001101;
       String str=b+"";
                                    //String str2=String.valueOf(b);
       
        System.out.println(str.matches("[1][01]*"));
        
        int a=0X54E010;
        String str2=a+"";
        System.out.println(str2.matches("([0-9A-F]+)"));
        
        
        String d="12/12/1185";
        System.out.println(d.matches("^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/[0-9]{4}$"));
       // ^ => it represents the beginning of a line or string. 
       // $ => symbol is placed at the very end of the regular expression.
    }
    
}
