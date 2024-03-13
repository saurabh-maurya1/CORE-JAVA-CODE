
package method_overriding_ex1;
class TV
{
    public void switchON(){System.out.println("TV is Switched ON");}
    public void changeChannel(){System.out.println("Tv Channel is Changes");}
}

class SmartTV extends TV
{   @Override
    public void switchON(){System.out.println("Smart TV is Switched ON");}
    @Override
    public void changeChannel(){System.out.println("Smart TV Channel is Changes");} 
    public void browse(){System.out.println("Smart TV Browsing");}
}
public class Method_Overriding_ex1 {

    public static void main(String[] args) {
       TV t=new SmartTV();
     
     t.switchON();
   t.changeChannel();
        
        
        
    }
    
}
