
package p_linkedhashmap;
import java.util.*;
public class P_LinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5/*,.75f,true*/){
           
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>5;
            }


        };                                                                 // ture=means wheather you wants to order of access if yes then it will make ture
                                                                                // 0.75 means loading factore
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4, "D");
        lhm.put(5,"E");
      
      
      String s=lhm.get(2);
     s=lhm.get(5);
     s=lhm.get(1);
     lhm.put(6, "F");
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));
        
        
        
        
    }
    
    
    
    
}




/*

package p_linkedhashmap;
import java.util.*;
public class P_LinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5);;
        
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4, "D");
        lhm.put(5,"E");
        lhm.put(6, "F");
        lhm.put(9, "I");
        lhm.put(8, "H");
      String s=lhm.get(2);
     s=lhm.get(5);
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));
        
        
        
        
    }
    
    
    
    
}

*/







/*

package p_linkedhashmap;
import java.util.*;
public class P_LinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,.75f,true);;// ture=means wheather you wants to order of access if yes then it will make ture
                                                                                // 0.75 means loading factore
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4, "D");
        lhm.put(5,"E");
        lhm.put(6, "F");
        lhm.put(9, "I");
        lhm.put(8, "H");
      String s=lhm.get(2);
     s=lhm.get(5);
     s=lhm.get(1);
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));
        
        
        
        
    }
    
    
    
    
}



*/