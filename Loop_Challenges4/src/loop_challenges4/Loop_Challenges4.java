 
      /* Arithmatic Progration(A.P) Series*/


      
package loop_challenges4;
import java.util.*;

public class Loop_Challenges4 {

    public static void main(String[] args) {
       
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Starting term a diffrence D");
//        
//        int a=sc.nextInt();
//        int d=sc.nextInt();
//        System.out.println("Enter How many term you want");
//        int t=sc.nextInt();
//        int j=a;
//      
//        for(int i=0; i<t; i++)
//        {
//            System.out.print(j+",");
//            j+=d;
//        }



   // GP Series
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter a and r value");
//      int a,r,t,j;
//      a=sc.nextInt();
//      r=sc.nextInt();
//      System.out.println("How many term");
//      t=sc.nextInt();
//      j=a;
//      for(int i=0; i<t; i++)
//      {
//          System.out.print(j+", ");
//          j=j*r;
//      }
//        



      // Fibonacci Series
      int a,c,b;
     a=0;
      b=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of term of fibonacci Series");
      int t=sc.nextInt();
      System.out.print(a+", "+b+", ");
      for(int i=1; i<t-2; i++)
      {    
            c=a+b;
            
          System.out.print(c+", ");
      
            a=b;
            b=c;
      }
    }
    
}





/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter how many term you want to print");
   int size =sc.nextInt();
   int[] fibbo =new int[size];
   fibbo[0]=0;
   fibbo[1]=1;
   for(int i=2; i<fibbo.length; i++){
       fibbo[i]=fibbo[i-1]+fibbo[i-2];
   }
        for (int x:fibbo
             ) {
            System.out.print(x+" ");
        }
    }
 }

*/