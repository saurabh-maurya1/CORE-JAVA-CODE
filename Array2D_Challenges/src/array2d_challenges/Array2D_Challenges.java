
package array2d_challenges;

public class Array2D_Challenges {

    public static void main(String[] args) {
        
       String arr[]={"java","python","pascal","smalltalk","ada","basic"};
       java.util.Arrays.sort(arr);
       for(String x: arr)
           System.out.print(x+" ");
        
        
    
        
      
    }
    
}
/*
          Addition of Two Matrix




       int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        int C[][]=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                  C[i][j]=A[i][j]+B[i][j];
                  System.out.format("%02d ",C[i][j]);
            }
            System.out.println("");
        }




        Multiplication of Matrix

 int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        int C[][]=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                 for( int k=0; k<A.length; k++)
                   {
                     C[i][j]=C[i][j]+(A[i][k]*B[k][j]);
                    }
                 System.out.format("%03d ",C[i][j]);
            }
            System.out.println("");
        }
*/