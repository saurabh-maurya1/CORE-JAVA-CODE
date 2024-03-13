
package method_practise;

public class Method_practise {
    
   // call the method inside the class create an object then call in side the main method
    
    
      static void inc(int x)
      {
          x++;
          System.out.println(x);
      }
    
    
    public static void main(String[] args) {
          int a=10,b=15;
        inc(a);
        System.out.println(a);
       
    }
    
}


/*
       call the method inside the class(main method) when it create as static



     static int max(int x,int y)
      {
          if(x>y)
              return x;
          else
                return y;
      }
    
    
    public static void main(String[] args) {
        int a=10,b=15;
        System.out.println(max(a,b));
       
    }








  
   // call the method inside the class create an object then call in side the main method
    
    
       int max(int x,int y)
      {
          if(x>y)
              return x;
          else
                return y;
      }
    
    
    public static void main(String[] args) {
          int a=10,b=15;
Method_practise mp = new Method_practise();

        System.out.println(mp.max(a,b));
       
    }
    
}
*/