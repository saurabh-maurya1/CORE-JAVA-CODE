
package interface_example_1;
class Phone
{
    public void call(){System.out.println("Phone call");}
    public void sms(){System.out.println("Phone sendig sms");}
    
}
interface ICamera
{
    void click();
    void record();
}
interface IMusicPlayer
{
    void play();
    void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall(){System.out.println("Smart Phone video calling");}
    public void click(){System.out.println("Smart Phone Clicking Photo");}
    public void record(){System.out.println("Smart Phone recording video");}
    public void play(){System.out.println("Smart phone playing music");}
    public void stop(){System.out.println("Smart phone Stop playing music");}
}

public class Interface_example_1 {

    public static void main(String[] args) {
      SmartPhone s =new SmartPhone();
	Phone p = s;
	p.call();
	p.sms();
	ICamera i = s;
	i.click();
	i.record();
	IMusicPlayer im=s;
	im.play();
	im.stop();
     s.videoCall();
    }
    
}
