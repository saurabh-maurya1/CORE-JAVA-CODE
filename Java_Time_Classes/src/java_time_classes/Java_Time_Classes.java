
package java_time_classes;
import java.util.*;
import java.time.*;

public class Java_Time_Classes {

   
    public static void main(String[] args) {
         ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        
        OffsetDateTime odt=OffsetDateTime.now();
        System.out.println(odt);
        
        ZonedDateTime z= ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(z);
        
        MonthDay md = MonthDay.now();
        System.out.println(md);
        
        
        Period p =Period.of(2, 2, 10);
        System.out.println(p.addTo(LocalDate.now()));
        
        Instant i= Instant.now();
        System.out.println(i);
        
            }
    
}
