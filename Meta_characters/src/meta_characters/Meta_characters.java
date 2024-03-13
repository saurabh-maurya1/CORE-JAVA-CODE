
package meta_characters;


public class Meta_characters {

public static void main(String[] args) {
                        String str1="a";
                    System.out.println(str1.matches("\\w"));// anything alphabet and number
                    System.out.println(str1.matches("\\d"));//  take digit
                    System.out.println(str1.matches("\\s"));// take space
                    System.out.println(str1.matches("\\W")); // Neither alphabet nor digit
                    System.out.println(str1.matches("\\D"));//  Not Digit
                    System.out.println(str1.matches("\\S"));// Not space

    }
    
}
