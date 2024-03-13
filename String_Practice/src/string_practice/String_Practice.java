
package string_practice;


public class String_Practice {

   
    public static void main(String[] args) {
        String str1="Java Program";// here "java program" is a string litral which is occupy in space
                                         // pool
         String str2=new String("JAVA"); // new string is created in heap
         
        System.out.println(str1);
        System.out.println(str2);
        
        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        System.out.println(str3);
        
        byte b[]={65,66,67,68,69};
        String str4=new String(b,1,4);  // first 1 indicate that start from array 1st index
                                      //  and 4 indicate that take only 4 string
        System.out.println(str4);
        
        
        
        // checking java pool 
        
        String str5="java";
        String str6="java";     // comparing these two if they are refering same object then 
        System.out.println(str5==str6); // it will become true
     
  
    }
    
}
