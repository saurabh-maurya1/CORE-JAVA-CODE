
package object_class;
class Myobject
{
 public String toString()
 {
     return"MY Object";
 }
 public int hashCode()
 {
     return 100;
 }
 public boolean equals(Object o)
 {
     return this.hashCode()==o.hashCode();
 }
}
//class Myobject2 extends Myobject
//{
//    
//}

public class Object_Class {

   
    public static void main(String[] args) {
  Myobject o1=new Myobject();
//     System.out.println(o1);
     Myobject o2=new Myobject();
     System.out.println(o1.equals(o2));
//     System.out.println(o1.hashCode());
//      System.out.println(o2.hashCode());
    }
    
}
/*
package object_class;


public class Object_Class {

   
    public static void main(String[] args) {
 Object o1=new Object();
 System.out.println(o1);// by default toString method call
 Object o2=new Object();
 System.out.println(o1.equals(o2));
 Object o3=o1;//both referencess refering same Object
 System.out.println(o1.equals(o3));
System.out.println(o1.hashCode());// it will give uniquecode
        
        
    }
    
}
*/