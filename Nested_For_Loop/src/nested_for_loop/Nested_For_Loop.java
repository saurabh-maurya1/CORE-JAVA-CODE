
package nested_for_loop;

public class Nested_For_Loop {

    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=2; j++)
            {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println("");
        }
       
    }
    
}
