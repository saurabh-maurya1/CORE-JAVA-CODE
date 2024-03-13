
package p_properties;
import java.util.*;
import  java.io.*;
public class P_Properties {
    public static void main(String[] args)throws Exception {
   Properties p=new Properties();
/*   p.setProperty("Brand", "Dell");
   p.setProperty("Processor", "i7");
   p.setProperty("OS", "Windows10");
   p.setProperty("Model", "Latitude");
        
   
   p.store(new FileOutputStream("C:\\Users\\saura\\Documents\\Desktop\\MyData.txt"), "Laptop");
   p.storeToXML(new FileOutputStream("C:\\Users\\saura\\Documents\\Desktop\\MyData.xml"), "Laptop");
//        System.out.println(p);
        
        */
        
// Read the file
//p.loadFromXML(new FileInputStream("C:\\Users\\saura\\Documents\\Desktop\\MyData.xml"));
 p.load(new FileInputStream("C:\\Users\\saura\\Documents\\Desktop\\MyData.txt"));


//        System.out.println(p);
System.out.println(p.getProperty("Name"));
    }
    
}
