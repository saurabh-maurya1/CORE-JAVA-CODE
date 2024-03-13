
package incremen_decrement;

public class Incremen_Decrement {

    public static void main(String[] args) {
        int x=5,a=5;
        int y=x++;
        System.out.println(x+" "+y);
        
        int z=++a;
        System.out.println(a+" "+z);
        
        int u=5,v=4,w;
       w=2*u++ +3* ++u;        //w=2*u++ +3*++u then 2*5+3*7=31
       System.out.println(w);    // 2*5+3*5=25
       float f=5.65f;                                                                                                                                                                                           
      f++;
      System.out.println(f);
      
      char c='A';
      c++;
      System.out.println(c);
      
      byte b=3;  
      b++;      //b+=1; you can also use     //but here b=b+1; is error because b is byte and 1 is a integer type literal
      System.out.println(b);                // so byte + int =int lossy conversion show
    }                                      // when b++ then is byte type data it modify same type
    
}
