
package string_challenges;


public class String_challenges {

    // find if the email id is on gmail
    // Find username and domain name from email
    public static void main(String[] args) {
      String str1="programmer@gmail.com";

       
          int i=str1.indexOf("@");
          String a=str1.substring(0,i);
          String b=str1.substring(i+1);// here you can use (i+1,str1.length)
                                       //System.out.println(b.startsWith("gmail"));
          int e=str1.indexOf(".");
          String c=str1.substring(i+1,e); // String c=b.substring(0,e);
          System.out.println("User name : "+a+"\n Domain name : "+b);
          System.out.println(c.equals("gmail"));
          

    }
    
}
