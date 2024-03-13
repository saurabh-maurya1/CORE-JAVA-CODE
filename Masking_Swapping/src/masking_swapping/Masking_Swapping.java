
package masking_swapping;
import java.util.*;


public class Masking_Swapping {

    public static void main(String[] args) {
     // Swaping of two number
      int a=12,b=5;
      a=a^b;
      b=a^b;
      a=a^b;
      System.out.println("a :"+a+" b : "+b);
     
      //merging of two number
      
      byte x=9,y=5;
      y=(byte)(y<<4);
      
      x=(byte)(x|y);        // it print binary         it print decimal
      //    x=01011001
      System.out.println(Integer.toBinaryString(x)+" "+x);
      // masking

      System.out.println((x&0b11110000)>>4);
      System.out.println(x&0b00001111);

    }
    
}
