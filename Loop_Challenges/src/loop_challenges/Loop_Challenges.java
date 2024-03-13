
package loop_challenges;
import java.util.*;

public class Loop_Challenges {

    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        
   //     table of any number
        for(int i=1; i<=10;i++)
        {
            System.out.println(a+" x "+i+" = "+(a*i));
        }
          


  // Sum of n number
/*         Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
       int a = sc.nextInt();
            int sum=0;
       for(int i=1;i<=a; i++)
        {

            sum=sum+i;
            if(i==a)
            System.out.print(i);
            else
                System.out.print(i+"+");
        }
        System.out.println(" = "+sum);
*/


/*
Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
       int a = sc.nextInt();
            int fact=1;
       for(int i=1;i<=a; i++)
        {

            fact=fact*i;
            if(i==a)
            System.out.print(i);
            else
                System.out.print(i+" x ");
        }
        System.out.println(" = "+fact);
        */
    }
    
}
