
package p_treeset;
import java.util.*;
public class P_TreeSet {
    public static void main(String[] args) {
          // here we implement collection and sortedset
       TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40)) ;
       ts.add(25);
       System.out.println(ts.ceiling(55));
        System.out.println(ts);
        
        
        System.out.println(ts.headSet(40));
     System.out.println(ts.tailSet(30));  
        
        
        
        
        
    }
    
}
