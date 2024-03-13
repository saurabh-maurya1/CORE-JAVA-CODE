 
package string_method;

public class String_Method {

    public static void main(String[] args) {
        String str=new String("netbeans  ");
        int len=str.length();
        System.out.println(len); // length of string
        
        String str2=str.toUpperCase();
        String str3=str.toLowerCase();
        String str4=str.trim(); //Remove spaces in the string
        String str5=str.substring(3,8);
        String str6=str.replace('e','M');
        
        
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
    }
    
}
