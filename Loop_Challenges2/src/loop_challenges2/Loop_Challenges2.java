
package loop_challenges2;
import java.util.*;


public class Loop_Challenges2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rev=0;
        System.out.println("Enter a number");
        int num=sc.nextInt();


        for(int i=num; i>0;i=i/10)
        {    
                rev=rev*10+i%10;
              
        }
        if(rev==num)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
       
        
        /*
         // reverse of a number
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int sum = 0;
        while(x>0) {
            sum = sum*10+x%10;
               x /=10;
        }
        System.out.println(sum);
        */
                
        
    }
    
}
