
package float_wrapper_demo;

public class Float_Wrapper_Demo {

    public static void main(String[] args) {
      float a=123.2f;
      Float b=123.2f;
     System.out.println(b.equals(a));
     Float c=23.5f/0;
     System.out.println(c.isInfinite());
     System.out.println(c==Float.POSITIVE_INFINITY);// static member;
     Float d=(float)Math.sqrt(-1);// it is NaN =not a number it is imagenary number
     System.out.println(d.isNaN());
     System.out.println(d!=Float.NaN);// here we are useing NOt  equal sysmbol (!=) for perfectly working
     
     
     
     Character x='A';
    System.out.println( Character.isLetter(x));
    
    
   System.out.println( Boolean.parseBoolean("true"));
    
   
    }
    
}
