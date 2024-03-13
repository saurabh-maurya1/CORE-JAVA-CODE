
package method_challenges1;


public class Method_Challenges1 {
    int maxSize(int A[])
    {    
       int maxSize=A[0];
        for(int i=1; i<A.length;i++)
        {
            if(maxSize<A[i])
                maxSize=A[i];
        }
        return(maxSize);   
        
    }
    public static void main(String[] args) {
        Method_Challenges1 x=new Method_Challenges1();
        int A[]={3,2,5,6,7,22,12,32};
        System.out.println(x.maxSize(A));// creating an Object of the class and use maxSize method
    }
}


/*

  Find no is Prime



package method_challenges1;


public class Method_Challenges1 {
    static boolean Isprime(int n)
    {
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
    System.out.println(Isprime(45));
    }
}



GCD of a two number

    static int gcd(int m,int n)
    {    
        while(m!=n)
        {    
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return(m);   
        
    }
    public static void main(String[] args) {
        int x,y;
        x=35;
        y=465;
        System.out.println("gcd : "+gcd(x,y));
    }
}


    int gcd(int m,int n)
    {    
        while(m!=n)
        {    
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return(m);   
        
    }
    public static void main(String[] args) {
        Method_Challenges1 x=new Method_Challenges1();
        
        System.out.println(x.gcd(25,52));// creating an Object of the class and use gcd
    }
}
*/