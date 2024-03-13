
package nestedloop_challenges2;

public class NestedLoop_Challenges2 {

    public static void main(String[] args) {
       /*
        Output:
        
        
        *           
      * * *         
    * * * * *       
  * * * * * * *     
* * * * * * * * *   
  * * * * * * * 
    * * * * *   
      * * *     
        *
        
        
        */ 
        for(int i=1; i<=5; i++)
        {
          {
            for(int j=1; j<=5; j++)
            { 
                {  if((j+i)<=5)
                System.out.print("  ");
               else
                System.out.print("* ");
                }
            } 
            
            
            for(int k=5; k>=1; k--)
              {
                if((i+k-1)<=5)
                    System.out.print("  ");
                else
                    System.out.print("* ");
              }
           
           } 
                 System.out.println("");
        }
        
        
        
             for(int i=1; i<=5; i++)
        {
          {
            for(int j=4; j>=1; j--)
            { 
                {  if((j+i)<=4)
                System.out.print("* ");
               else
                System.out.print("  ");
                }
            }
            
            
            for(int k=1; k<=4; k++)
              {
                if((i+k-1)<=4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
              }
                 System.out.println("");
        }
        
        
        
     }
        
        
        /*  Pattern
 -------------------------------------------------------------------------------            
             Output : important
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
             
           for(int i=1; i<=5; i++)
        {
            for(int j=0; j<=i-1; j++)
            {
                System.out.print((j+i)+" ");
            }
            System.out.println("");
        }
        
--------------------------------------------------------------------------        
             Output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
             
         for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
  -------------------------------------------------------           
             Output: 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
             
        
         int count=0;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {     count++;
                System.out.print(count+" ");
             
            }
            System.out.println("");
        }
        
        
             
 ----------------------------------------------------------------------
             Ouput:
*
**
***
****
*****
******
             
             
        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=i; j++)
            {   
                System.out.print("*");
             
            }
            System.out.println("");
        }
             
             
 ----------------------------------------------------------------------------            
             Output:
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1              
        
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {   
                System.out.print(j+" ");
             
            }
            System.out.println("");
        }
             
             
   ----------------------------------------------------------------------------            
             Output:
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1                       
             
             
             for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5-i+1; j++)
            {   
                System.out.print(j+" ");
             
            }
            System.out.println("");
        }
             
 -----------------------------------------------------------
             Output: 
* * * * * 
  * * * * 
    * * * 
      * * 
        *        
             
             
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {   if(i<=j)
                System.out.print("* ");
               else
                System.out.print("  ");
            }
            System.out.println("");
        }
 -----------------------------------------------------------
             Output:             
        * 
      * * 
    * * * 
  * * * * 
* * * * *             
             
             
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {   if((j+i)<=5)
                System.out.print("  ");
               else
                System.out.print("* ");
            }
            System.out.println("");
        }
             
             
             
 
        */
    }}
    

