
package joda_date_time_api;
import java.time.LocalDate;
import java.util.*;
import java.time.*;

public class Joda_Date_Time_API {

    public static void main(String[] args) {
        // Using old API
Date d = new Date();
System.out.println(d);
  // lets try to modify them
  Date d1 = new Date();
  d1.setHours(21);
  System.out.println(d1);
        
        
      //New API
      LocalDate dt = LocalDate.now();
      System.out.println(dt);
        
      LocalDate d2=LocalDate.now(Clock.systemDefaultZone());
      System.out.println(d2);
        
      LocalDate d3= LocalDate.now(ZoneId.of("Asia/Kolkata"));        
      System.out.println(d3);
      
      LocalDate d4 = LocalDate.of(2020, Month.MARCH, 3);
      System.out.println(d4);
      
      LocalDate d5 = LocalDate.ofEpochDay(1);
      System.out.println(d5);
      
      LocalDate  d6=LocalDate.parse("2020-02-03");
      System.out.println(d6);
      
      LocalDate d7 = LocalDate.parse("2020-03-03");
      LocalDate d8 = d7.plusMonths(6);
      System.out.println(d8);
      
      LocalTime t = LocalTime.now();
      System.out.println(t);
      LocalTime t2 = t.minusHours(2);
      System.out.println(t2);
      
      
      LocalDateTime ldt = LocalDateTime.now();
      System.out.println(ldt);
    }
    
}
