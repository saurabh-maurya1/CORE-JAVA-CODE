
package string_method2;

public class String_Method2 {

    public static void main(String[] args) {
        
        String str1="Mr. Shahrukh Khan";
        System.out.println(str1.startsWith("Mr."));
         System.out.println(str1.startsWith("Shah",4));// here 4 denote index
         System.out.println(str1.endsWith("Khan"));
         System.out.println(str1.charAt(4));
         System.out.println(str1.length());
         // you can print whole character with the using of the for loop
 /*  for(int i=0; i<str1.length();i++)   //   here i<= not using because length of the string
                                         //  is 17 and index is 0-16 so it will print below 17
                                        //   it means maximum 16 index
     System.out.print(str1.charAt(i));
*/
        String str2="www.udemy.co.in";
        System.out.println(str2.indexOf("."));// dot is appering from start
          System.out.println(str2.indexOf(".",4));// after 4rth index . dot is appering
        System.out.println(str2.lastIndexOf("."));// dot is appering right hand side
    }
    
}
