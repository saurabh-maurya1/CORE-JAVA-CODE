
package p_arraydeque;
import java.util.*;
public class P_ArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        
        
       //dq.pollLast(); insert last and  delete at the last it means that it will behave like stack
    //   dq.pollFirst();  insert last and delete at the first it means that it will behave like queue
        
        /*dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        */
                dq.forEach((x)->System.out.println(x));

        
        
        
        
    }
    
}
