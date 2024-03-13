
package matching_symbol;

public class Matching_Symbol {

    public static void main(String[] args) {
       String str1="5";// a,A ,8,% you can use any only one symbol 
       System.out.println(str1.matches("."));
       
       String str2="a";// you can use anyone of abc 
       System.out.println(str2.matches("[abc]"));
       System.out.println(str2.matches("[a-zA-Z0-9]"));// a,b,c,d,e,1,2,3,4,5,6-----
       System.out.println(str2.matches("[a-z][0-9]"));// a3 a8 b9 k9 d9 ----     allow
       System.out.println(str2.matches("[^abc]"));
       System.out.println(str2.matches("A|B"));
       System.out.println(str2.matches("XZ"));  // password matching 
       
    }
    
}
