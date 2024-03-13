
package variable_argument_challenges;

public class Variable_Argument_Challenges {
// Calculate Discount using varargs
       static double discount(int...Price)
       {
          int sum=0;
          double amount=0;
          for(int i=0; i<Price.length;i++)
          {
              sum=sum+Price[i];
              
          }
          if(sum<500)
           amount=sum*0.1;
          else if(sum>500&&sum<1000)
                amount=sum*0.15;
          else if(sum>1000)
               amount= sum*0.20;
           return  amount;
       }
    public static void main(String[] args) {
        System.out.println("Save amount ₹"+discount(100,200,100));
        System.out.println("Save amount ₹"+discount(100,200,100,400));
        
        System.out.println("Save amount ₹"+discount(2000,1000,1500));
       
    }
    
}

/*
// maximum of numbers using varagrs
     

static int max(int...A)
       {
           if(A.length==0){
           return    Integer.MIN_VALUE;}
           int m=A[0];
           for(int i=1; i<A.length;i++)
           {
               if(A[i]>m)
                   m=A[i];
           }
           return m;
           
       }
    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(2,3,56));
        
        System.out.println(max(2,3,56,21,5,21,58));
       
    }
    
}

// sum of all element using varagrs
       static int sum(int...A)
       {
          int s=0;
          for(int i=0; i<A.length; i++)
          {
              s=s+A[i];
          }
          return s;
       }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(2,3,56));
        
        System.out.println(sum(2,3,56,21,5,21,58));
       
    }
    
}
*/
