
package variable_argument;

public class Variable_argument_practise {
       static void showList(int start,String ...S)
       {
           for(int i=0;i<S.length;i++)
           {
               System.out.println((start+". "+S[i]));
               start++;
           }
       }
   
            
    public static void main(String[] args) {
        showList(5,"john","Smith","Ajay","Ahmed","Saurabh","Denesh");
    
    }
    
}
/*
    
    static void show(int ...A)// here you can't take int[]A which will work only 
                             //  for array not integer argument
    {
        for(int x:A)
        {
            System.out.println(x);
        }
    }
            
    public static void main(String[] args) {
      show();
      show(10,20,30);
      show(new int[]{3,5,7,9,11,13,15});
    }
    
}






public class Variable_argument_practise {
       static void showList(String ...S)
       {
           for(int i=0;i<S.length;i++)
           {
               System.out.println((i+1+". "+S[i]));
           }
       }
   
            
    public static void main(String[] args) {
        showList("john","Smith","Ajay","Ahmed","Saurabh","Denesh");
    
    }
    
}
*/