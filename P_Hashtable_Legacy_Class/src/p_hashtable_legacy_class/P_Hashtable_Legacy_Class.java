

                       /* ---------------
                        Generic class
                       ----------------*/         
package p_hashtable_legacy_class;
import java.util.*;
public class P_Hashtable_Legacy_Class {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();// it is implementing map iterface
        
        ht.put(1, "A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5, "E");
     
        
        ht.compute(2, (k,v)->v+"Z");
        ht.computeIfAbsent(7, (k)->"Z"+k);
        System.out.println(ht);
        




    }
    
}




/*
                    ---------------------------------
                    Oldest class which it non generic
                    ---------------------------------



package p_hashtable_legacy_class;
import java.util.*;
public class P_Hashtable_Legacy_Class {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        
        ht.put(1, "A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5, "E");
        
        String s=(String)ht.get(3);
            
        //Enumeration e=ht.elements();// it will show the values
        Enumeration e=ht.keys();// it will show the keys 
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        
       // System.out.println(ht);
        




    }
    
}

*/