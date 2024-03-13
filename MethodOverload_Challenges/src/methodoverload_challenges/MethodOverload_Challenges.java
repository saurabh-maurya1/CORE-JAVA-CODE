
package methodoverload_challenges;

public class MethodOverload_Challenges { 
    
static boolean validate(String name)
{
    return name.matches("[a-zA-Z\\s]+");
} 
static boolean validate(int a)
{
     return a>3&&a<15;
}
    
    public static void main(String[] args) {
       System.out.println(validate("SAURABH"));
        
        
        
      
    
    }
    
}


/*     Area of the circle rectangle and trapiziam



static int area(int l,int b)
    {
          int R=l*b;
          return R;
    } 
    static double area(int r)
    {
       double C=Math.PI*r*r;
       return C;
    }
    static double area(int a,int b,int h)
    {
        double T=(a+b)*h/2d;
        return T;
    }
    
    public static void main(String[] args) {
        System.out.println(area(2));
        




reverse value printing

        static int reverse(int a)
    {   int rev=0;
        
        while(a>0)
    {
        rev=(rev*10)+(a%10);
        a=a/10;
    } return rev;
        
    }   
     static int[] reverse(int arr[])
    {
        int[]temp=new int[arr.length];
        for(int i=arr.length-1,j=0; i>=0; j++,i--)
        {
            temp[j]=arr[i];
            
        }
        for(int x:temp)
          System.out.print(x+", ");
        System.out.println("");
        return temp;
    }
            
    






    
    public static void main(String[] args) {
      int A[]={3,4,6,7,8,2};
      reverse(A);
      
      for(int x:A)
          System.out.print(x+", ");
        
        
        
       
*/