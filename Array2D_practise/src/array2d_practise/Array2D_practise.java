
package array2d_practise;

public class Array2D_practise {

    public static void main(String[] args) {
        /*
        Output:
        
0 0 0 0 0 
0 0 0 0 
0 0 0 0 0 0 0 0 
        
        */
       int A[][];
       A=new int[3][];
       A[0]=new int[5];
       A[1]=new int[3];
       A[2]=new int[8];
       for(int x[]:A)
       {
           for(int y:x)
           {
               System.out.print(y+" ");
               
           }
           System.out.println("");
       }
           
    }
    
}
/*
 int A[][]=new int[5][5];
        int B[][]={{1,2,3},{2,4,6},{1,3,4}};
        int C[][];
        C=new int[5][5];
        int [][]D=new int[5][5];
        int[]E,F[];// here means int[] integer type array which int[]E; 1D and int[]F[]; 2D array
        E=new int[5];
        F=new int[5][5];
        int[] K,L,M;  // All are 1D Array




 for(int i=0;i<B.length;i++)
       {
           for(int j=0;j<(B[0].length);j++)
           {
               System.out.print((B[i][j])+" ");
           }
           System.out.println("");
       }











for(int x[]:B)
        {
            for(int y : x )
            {
                System.out.print(y+" ");
                
            }
            System.out.println("");
        }





int A[][];
       A=new int[3][];
       A[0]=new int[5];
       A[1]=new int[3];
       A[2]=new int[8];
       for (int i=0; i<A.length; i++)
       { 
           for(int j=0; j<A[i].length; j++)
           {
               System.out.print((A[i][j])+" ");
           }
           System.out.println("");
       }
*/