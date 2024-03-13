 
package static_blocks;
class Test{
     static
     {
         System.out.println("Block 1");
     }
      static 
    {
        System.out.println("Block 2");
    }
    
} 

public class Static_blocks {
     /*static
     {
         System.out.println("Block 1");
     }*/
    
    public static void main(String[] args) {
       
        System.out.println("Main");
         Test t=new Test();
    }
    
   /* static 
    {
        System.out.println("Block 2");
    }*/
}


/*
class Test
{
    static{
        System.out.println("Block 4");
    }
    static
    {
        System.out.println("Block 5");
    }
}

public class Pt {
    static {
        System.out.println("Block 1");
    }
    public static void main(String [] args)
    {
System.out.println("Block 3");
Test t=new Test();
    }
    static
    {
        System.out.println("Block 2");
    }

}

*/