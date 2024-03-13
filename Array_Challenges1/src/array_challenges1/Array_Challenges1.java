
package array_challenges1;
import java.util.*;


public class Array_Challenges1 {

    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
    int max,SMax;
     max=SMax=A[0];
     for(int i=1; i<A.length; i++)
     {
        if(A[i]>max)  
        {    SMax=max;
            max=A[i];
        }
        else if(A[i]>SMax && A[i]<max)
        {
          SMax=A[i];   
        }
     }
     System.out.println("Max is "+max+" Second Max is"+SMax);
    }  }
     
   // Ques. finding sum of all element in side the array  
//    int y=0;
//     for(int x : A)
//     {
//        y=y+x;
//         
//     }
//     System.out.println(y);


 /*for(int i=0; i<A.length; i++)
     {
        sum=sum+A[i]; 
     }
     System.out.println(sum);
  


Ques. Searching a element inside

 int A[]={3,9,7,8,12,6,15,5,4,10};
     int key=6;
     int a=1;
     int s=0;
     for(int i=0; i<A.length; i++)
     {
          if(key==A[i])
          {
              System.out.println("Element Found");
                s=s+a;
                System.exit(0);
          }
          
     }       
     if(s==0)
               System.out.println("Not Found");
  



  
 Ques. Searching a element inside 

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key :");
     int A[]={3,9,7,8,12,6,15,5,4,10};
     int key=sc.nextInt();
     
     for(int i=0; i<A.length; i++)
     {
          if(key==A[i])
          {
              System.out.println("Element Found");
               
                System.exit(0);
          }
     }
     System.out.println("Not Found");





int A[]={3,9,7,8,12,6,15,5,4,10};
    
     int max=A[0];
     int SMax=0;
     {
     for(int x : A)
     {
        if(x>max)  
        {
            max=x;
        }
     }
     for(int x : A )
     {
       if(max>x&&x>SMax)
        {
            SMax=x;
        }   
     }
     }
     System.out.println("Max is "+max+" Second Max is"+SMax);
    }  }










    int A[]={3,9,7,8,12,6,15,5,4,10};
    
     int max=A[0];
     int SMax=A[0];
     {
     for(int i=1; i<A.length; i++)
         
     {
        if(A[i]>max)  
        {
            max=A[i];
        }
     }
     for(int i=1; i<A.length; i++)
     {
       if(max>A[i]&&A[i]>SMax)
        {
            SMax=A[i];
        }   
     }
     }
     System.out.println("Max is "+max+" Second Max is"+SMax);
    }  }
  




  
        int A[]={3,9,7,8,12,6,15,5,4,10};
    int max,SMax;
     max=SMax=A[0];
     for(int i=1; i<A.length; i++)
     {
        if(A[i]>max)  
        {    SMax=max;
            max=A[i];
        }
        else if(A[i]>SMax)
        {
          SMax=A[i];   
        }
     }
     System.out.println("Max is "+max+" Second Max is"+SMax);
    }  }
     
*/