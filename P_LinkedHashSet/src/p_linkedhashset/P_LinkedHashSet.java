
package p_linkedhashset;

import java.util.*;
public class P_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
        //HashSet<String> lhs=new HashSet<>(10);
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        
       Iterator<String> itr=lhs.iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next());
       }
        
        
        
        
    }
    
}


/*

package p_linkedhashset;

import java.util.*;
public class P_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        
       lhs.forEach(System.out::println); 
        
        
        
        
        
    }
    
}
*/