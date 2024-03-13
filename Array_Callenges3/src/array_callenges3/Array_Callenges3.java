 
package array_callenges3;

public class Array_Callenges3 {

    public static void main(String[] args) {
        
         
        //Increasing Size of an Array
        
        int A[]={ 8,6,10,9,2};
        System.out.println(A.length);       
        int B[]=new int[2*A.length];
        for(int i=0,j=0; i<A.length; i++,j++)
        {  
            B[j]=A[i];
        }
        A=B;
        B=null;
        System.out.println(A.length);
}}
/*
   Copying an Array
 
        int n=10;
        int j=0; 
        int A[]=new int[n];
        int B[]=new int [n];
        A[0]=8;A[1]=6;A[2]=10;A[3]=9;A[4]=2;A[5]=15;A[6]=7;A[7]=13;A[8]=14;A[9]=11;
      
          for(int x:B)
             System.out.format("%02d, ", x);   
           System.out.println("");
       
        for(int i=0; i<n; i++) 
       {
           B[j]=A[i];
           j++;
       }
        for(int x:B)
             System.out.format("%02d, ", x);   
           System.out.println("");
      
         

   Reverse copying an array
           int n=10;
        int A[]=new int[n];
        int B[]=new int [n];
        A[0]=8;A[1]=6;A[2]=10;A[3]=9;A[4]=2;A[5]=15;A[6]=7;A[7]=13;A[8]=14;A[9]=11;
      
          for(int x:A)
             System.out.format("%02d, ", x);   
           System.out.println("");
      
        for(int i=n-1,j=0; i>=0; i--,j++) 
       {
           B[j]=A[i];
           
       }
        for(int x:B)
             System.out.format("%02d, ", x);   
           System.out.println("");
    }
}
      
         
*/
