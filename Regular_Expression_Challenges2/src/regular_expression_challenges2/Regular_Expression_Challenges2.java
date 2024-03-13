         /* 
            Remove Special Character from a string
            Remove Extra Space from String
             Find number of world in a String
*/
          
package regular_expression_challenges2;


public class Regular_Expression_Challenges2 {

    public static void main(String[] args) {
        // Remove Special Character
        String str="abc@d#25338555Adj#%%#@&(%";
    
        System.out.println(str.replaceAll("\\W+",""));// [^a-zA-Z0-9]
        
          // Remove extra spaces
        String str2="          dkajlkd                d dda      fjda lkd ad dkd     ";
        System.out.println(str2.replaceAll("\\s+"," ").trim());//use for the give gap every character (\\s*"," "));
                                                      // trim() remove starting and ending space
        // count word     String str2=str.trim().replaceAll("\\W+"," ").replaceAll("\\s+"," ");
        String str3="   abc def jek  ";
       str3 = str3.replaceAll("\\s+"," ").trim();
         String Words[]=str3.split("\\s");
         System.out.println(Words.length);
        
        
        

    }
    
}
