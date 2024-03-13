
package loop_challenges1;
import java.util.*;

public class Loop_Challenges1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
//        
//           Display Digit
//        int num=sc.nextInt();
//        for(int i=num; i>0; i=(i/10))
//        {
//            int r=(i%10);
//            System.out.print(r+" ");
//        }
        

  // count digit of a number
//              int count=0;
//            int n=sc.nextInt();
//        for(int i=n; i>0; i=(i/10))
//        {
//          count++;
//         
//        }
//        System.out.println(count);




// Finding a number is Armstrong or not
         int j=0;
        int num=sc.nextInt();
        for(int i=num; i>0; i=i/10)
        {
             int r=i%10;
              j=j+(r*r*r);
              
        }
        if(j==num)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
    
}
