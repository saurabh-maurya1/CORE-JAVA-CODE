
package for_loop_practise;

public class For_loop_practise {

    public static void main(String[] args) {
//       for(int i=1; i<=10; i++)    
//       {
//           System.out.print(i);
//       }
/**
 *               int i=1;
 *               for(System.out.println("HI");i<10; i++) {
 *                                System.out.println(i);   
 *                }
*/
       for(int i=1,j=1; i<=10; i++,j=j*2) 
       {
           System.out.println(i+" "+j);
       }
       
       
       
       int i=1;
       for(;i<10; i++) {
                  System.out.println(i);   
                 }
       
       
       int j=0;
       for(;j<10;) {
           i++;
       }
       
       for(;;){
           // it will give infinite loop
           System.out.println("hi");
       }
       
       
//       for(;true;){
//           
//       }
       
    }
    
}
