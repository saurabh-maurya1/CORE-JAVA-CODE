
package calendrar_and_timezone;
import  java.util.*;
public class Calendrar_and_timeZone {

    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        GregorianCalendar gc1 = new GregorianCalendar();
        TimeZone tz = gc1.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
        
        
        // change the timezone
        
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz2 = gc2.getTimeZone();
        System.out.println(tz2.getDisplayName());
        System.out.println(tz2.getID());
        
        
    }
    
}
