
package array_challenges2;
import java.util.*;

public class Array_Challenges2 {

    public static void main(String[] args) {
        /*
        output: 
        05, 09, 06, 10, 12, 07, 
        05, 06, 10, 12, 07, 00,
        */
        int A[]=new int[10];
        A[0]=5;A[1]=9;A[2]=6;A[3]=10;A[4]=12;A[5]=7;
        int n=6;
        int index=1;
  for(int i=0; i<n; i++)
      System.out.format("%02d, ",A[i]);
  System.out.println("");
  for(int i=index; i<n; i++)
      A[i]=A[i+1];
  for(int i=0; i<n; i++)
      System.out.format("%02d, ", A[i]);
        
        
}                               
}

/*      
    Ques.     Left Rotation
              5, 9, 6, 10, 12, 7, 3, 5, 4, 2 
              9, 6, 10, 12, 7, 3, 5, 4, 2, 5 
 

       int A[]={5,9,6,10,12,7,3,5,4,2};
        for(int x: A)
            System.out.print(x+", ");
              System.out.println("");
        int temp=A[0];
        for(int i=1; i<A.length; i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int x: A)
                System.out.print(x+", ");
              System.out.println("");



   Ques.   Right Rotation
             5, 9, 6, 10, 12, 7, 3, 5, 4, 2 
             2, 5, 9, 6, 10, 12, 7, 3, 5, 4 
    
int A[]={5,9,6,10,12,7,3,5,4,2};
        for(int x: A)
            System.out.print(x+", ");
              System.out.println("");
        int temp=A[A.length-1];
        for(int i=A.length-2; i>=0; i--)
        {
            A[i+1]=A[i];
        }
        A[0]=temp;
        for(int x: A)
                System.out.print(x+", ");
              System.out.println("");
    }
}










Ques. insert element inside array using scanner class and display element

        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Array Size");
         int  s=sc.nextInt();
    System.out.println("Enter the Element");
         int A[]=new int[s];
       for(int i=0; i<s; i++)
       {
           A[i]=sc.nextInt();
       }
       for(int x:A)
           System.out.print(x+", ");
    }
}




Ques. insert new Element  in given array


        int A[]=new int[10];
        A[0]=5;A[1]=9;A[2]=6;A[3]=10;A[4]=12;A[5]=7;
        int n=6;
        int index=2;
        for(int i=0; i<n; i++)
            System.out.format("%02d,  ",A[i]);
        System.out.println("");
        for(int i=n-1; i>=index; i--)
            A[i+1]=A[i];
       
        A[2]=15;
        for(int i=0; i<=n; i++)
            System.out.format("%02d,  ",A[i]);
        
Output:
      5 9 6 10 12 7 0 0 0 0 
      5 9 15 6 10 12 7 0 0 0   
        
}
}
*/