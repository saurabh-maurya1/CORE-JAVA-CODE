
package lambda_method_reference;

interface MyLambda {
    public int display(String str1,String str2);
}



public class Lambda_Method_Reference {
   
    public static void main(String[] args) {
     
        MyLambda ml=String::compareTo;
        System.out.println(ml.display("hello","hello"));
    }
    
}





/*
package lambda_method_reference;

interface MyLambda {
    public void display(String str);
}



public class Lambda_Method_Reference {




  public static void reverse(String str)
  {
      StringBuffer sb=new StringBuffer(str);
      sb.reverse();// it will modifie the string in term of reverse form
      System.out.println(sb);
  }


  public  void reverse2(String str)
  {
      StringBuffer sb=new StringBuffer(str);
      sb.reverse();// it will modifie the string in term of reverse form
      System.out.println(sb);
  }
 
    public static void main(String[] args) {
            /*   --------------------   
                 If Method are Static
                 --------------------      +/
            
            
        MyLambda ml=System.out::println;
                  //class .object(scope resolution)static method which is println
        ml.display("Hello");
        
                        // class           scope resolution static method
        MyLambda m2=Lambda_Method_Reference::reverse;
        m2.display("welcome");
        
        
        
        
        /*   ___________________________   
              If Method are Not Static
             ---------------------------      +/
        
        
        Lambda_Method_Reference lm=new Lambda_Method_Reference();
        MyLambda m3=lm::reverse2;
        m3.display("maR eerhS iaJ");
        
    }
    
}

*/







/*
package lambda_method_reference;

interface MyLambda {
    public void display(String str);
}



public class Lambda_Method_Reference {
    // create a constructor
    public Lambda_Method_Reference(String s)
    {
        System.out.println(s.toUpperCase());
    }
            
 
    public static void main(String[] args) {
     
        MyLambda ml=Lambda_Method_Reference::new;    new act as Constructor
        ml.display("hello");
    }
    
}
*/