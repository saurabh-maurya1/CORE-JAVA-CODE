
package quantifier_regularexpression;

public class Quantifier_RegularExpression {

    public static void main(String[] args) {
        String str1="abcdef";
        System.out.println(str1.matches(".*"));
        System.out.println(str1.matches("[a-z]*"));
        
        String str2="abcabcabcabcaccabc";// "" here we can use no symbol
        System.out.println(str2.matches("[abc]*"));
        System.out.println(str2.matches("[abc]{2,18}"));//minimum 2 and maximum 18 letter 
        
        String str3="Saurabh@gmail.com";
        System.out.println(str3.matches("(\\w*)@gmail(.*)"));
      
    }
    
}
