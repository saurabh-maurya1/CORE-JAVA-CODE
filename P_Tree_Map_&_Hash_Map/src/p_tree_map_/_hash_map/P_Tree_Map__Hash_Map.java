
package p_tree_map_._hash_map;
import java.util.*;
import java.util.Map.*;
public class P_Tree_Map__Hash_Map {

   
    public static void main(String[] args) {
      TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
    tm.put(4, "E");
    tm.put(6, "G");
      System.out.println(tm.ceilingEntry(5).getValue());
      System.out.println(tm);
      System.out.println(tm.get(3));
      Entry<Integer,String> e=tm.firstEntry();
      System.out.println(e.getKey()+" "+e.getValue());
      
    }
    
}
        //hashMap
/*
package demo;
 import java.util.*; 
class Demo { public static  void main(String[] args) {
HashMap<Integer,String> tm  = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
tm.put(4, "E");
tm.put(5, "G");
 System.out.println(tm);
 System.out.println(tm.get(3));
 } }
*/