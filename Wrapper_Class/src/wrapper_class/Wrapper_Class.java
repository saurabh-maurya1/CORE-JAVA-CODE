
package wrapper_class;


public class Wrapper_Class {

   
    public static void main(String[] args) {
   Integer I=new Integer(10);
   Integer a=Integer.valueOf(10);// better method to assign
   Integer b=10; //proper method   Internally it will call Integer.valueOf(); method
                   
   
   Byte c=15;
   Byte d=Byte.valueOf("15");
   
   
   /*
                   e(object) of this box   this process is called boxing or wrapping arround premitive
                -------
               | bb=15 |
               --------
 */   
   
   byte bb=15;
   Byte e=Byte.valueOf(bb);
   
   Short f=Short.valueOf("123");
   Float  g=12.22f;
   
   
   Float h=Float.valueOf("12.22");
   float x=h.floatValue();  // Unboxing
   float y=h;              // this property called as AutoUnboxing;
   
   
   Double J=Double.valueOf(123.456);
   Character k=Character.valueOf('A');
   Boolean l=Boolean.valueOf("true");
   
   
    
   int m=10;
    Integer n=Integer.valueOf(m);     //this is boxing            //  Integer n=m; primetive is converted into object this is called as Autoboxing
    int p=n; // AutoUnboxing    //int p=n.intValue();  it is Unboxing
       
    }
    
}
/*

int a = 10;
Integer l = Integer.valueOf(a);// boxing
Integer m=a; // autoboxing
int b =l.intValue();//unboxing
int k = l;//autoUnboxing

*/