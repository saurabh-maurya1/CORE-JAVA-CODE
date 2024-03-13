
package integer_wrapper_demo;


public class Integer_wrapper_Demo {

    public static void main(String[] args) {
       int m1=15;
       Integer m2=m1;
       Integer m3=15;
       System.out.println(m2.equals(m1));
       System.out.println(m2.equals(m3));
       Integer m4=Integer.valueOf("123");
       Integer m5=Integer.valueOf("A7", 16);
       Integer m6=Integer.decode("0xA7");
       System.out.println(m6);
       System.out.println(Integer.parseInt("123"));
       System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
       System.out.println(Integer.toBinaryString(40));
       System.out.println(Integer.sum(78, 80));
     
       
    }
    
}
