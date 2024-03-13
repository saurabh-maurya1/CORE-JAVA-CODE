
package string_method3;


public class String_Method3 {

   
    public static void main(String[] args) {
        String str1="The Geeza Pyramid";
        String str2="The Geeza Pyramid";
        String str3=new String("The Geeza Pyramid");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));// captial or small does not matter it is not case sensitive
        System.out.println(str1==str2);// comparing refrences both are refrencing same object in pool
        System.out.println(str1==str3);// comparing refrences str1   in pool and str3 in heap so o/p is false
        System.out.println(str2.equals(str3));//it is comparing the content what they are holding so o/p is true
        System.out.println(str1.contains("Geeza"));// search in str1
        
        
        String str4="pyramid";// lower case (small letter) in ASCII 97-122
        String str5="Pyramid";// upper case (capital letter) in ASCII 65-90
        System.out.println(str4.compareTo(str5)); // so str4>str5 o/p is positive
        
        String str6="The great wall";
        String str7=" of china";
        System.out.println(str6.concat(str7));// concate two string
        System.out.println(str6+str7);
        
        
   
    }  
    
}
