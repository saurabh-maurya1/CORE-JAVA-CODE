
package cubiod_area_volume;
import java.util.*;

public class Cubiod_Area_Volume {

    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      int l,b,h,area,volume;
      System.out.print("Enter Length, Breath and Height: ");
      l=sc.nextInt();
      b=sc.nextInt();
      h=sc.nextInt();
      area=2*(l*b+b*h+h*l);
      volume=l*b*h;
      System.out.println("Area is :"+area+"\n Volume is :"+volume);
    }
    
    
}
