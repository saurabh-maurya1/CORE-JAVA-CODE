
package p_arraylist_and_iterator;
import java.util.*;

public class P_ArrayList_And_Iterator {

    public static void main(String[] args) {
   ArrayList<Integer> al1=new ArrayList<>(20);
   ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
   
   al1.add(10);
   al1.add(0, 5);
  // al1.addAll(al2);
  al1.addAll(1,al2);
  al1.add(5,70);   
  al1.set(6,100);// remove 90 with 100;
  
  System.out.println(al1.lastIndexOf(70));
  System.out.println(al1.indexOf(70));
  System.out.println(al1.get(5));
  System.out.println(al1.contains(25));
   System.out.println(al1+"\n");
   
   
 /* for(int i=0; i<al1.size();i++)  // here we can we for each loop for(Integer x:al1)
       System.out.println(al1.get(i));
   
   for(Integer x:al1)
       System.out.println(x);
   
   
   
  al1.forEach((x)->{System.out.println(x);});  */
  //al1.forEach(System.out::println);
   
   
   Iterator<Integer> it=al1.iterator();// it will allow only forward direction
  // ListIterators<Integer> it=al1.listIterator();// it will allow bidirectional both direction movement
   
   while(it.hasNext())
           {
               System.out.println(it.next());
           }
   
     
       /* for(ListIterator<Integer> it=al1.listIterator();it.hasNext();)
    {
               System.out.println(it.next());
           }
   
 */
        
        
        al1.forEach(n->show(n));
        
        
        
    }
    static void show(int n)
    {
        if(n>60)
                System.out.println(n);
    }
    
    
}
