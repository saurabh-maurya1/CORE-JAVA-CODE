
package p_arrays_comparator;
import java.util.*;
class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}
public class P_Arrays_Comparator {
    public static void main(String[] args) {
  Integer a[]={2,4,6,8,1,3,5,7};
 // Arrays.sort(a);
 Arrays.sort(a, new My());
  
  for(int x:a)
      System.out.println(x);
        
        
        
        
        
        
    }
     
}






/*



package p_arrays_comparator;
import java.util.*;
public class P_Arrays_Comparator {
    public static void main(String[] args) {
  int a[]={2,4,6,8,1,3,5,7};
  int b[]={1,4,6,8,1,3,5,7};
  int c[]=Arrays.copyOf(a, a.length);
  //Arrays.fill(c,10);
  
  Arrays.sort(c);
  
  
  System.out.println(Arrays.binarySearch(c,2));// after sorting  it will give element 2 index 
//  for(int x:c)
//      System.out.println(x);
 // System.out.println(Arrays.compare(a, b));
        
        
        
        
        
        
        
    }
    
}

*/