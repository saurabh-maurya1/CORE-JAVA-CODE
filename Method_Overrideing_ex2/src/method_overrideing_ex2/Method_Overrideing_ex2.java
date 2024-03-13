
package method_overrideing_ex2;

class Car
{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}
}


class LuxaryCar extends Car
{
 public void start(){System.out.println("LuxaryCar Started");}
    public void accelerate(){System.out.println("LuxaryCar is Accelerated");}
    public void changeGear(){System.out.println("LuxaryCar Gear Changed");}
    public void openRoof(){System.out.println("Sun Roof is Opened");}
}

public class Method_Overrideing_ex2 {

    public static void main(String[] args) {
        LuxaryCar c=new LuxaryCar();
        c.accelerate();
        c.changeGear();
        c.start();
        c.openRoof();
        
    }
    
}
