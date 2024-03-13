
package date_and_time_formater;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
public class Date_And_Time_Formater {

    public static void main(String[] args) {
      LocalDateTime df =LocalDateTime.now();
      DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
      System.out.println(df.format(f));
      
      ZonedDateTime df1=ZonedDateTime.now();
       DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm:ss z");
      System.out.println(df1.format(f1));
      
      
       ZonedDateTime df2=ZonedDateTime.now();
       DateTimeFormatter f2=DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss z Z");
      System.out.println(df2.format(f2));
      
      
      
      
//      Chronofield


LocalDateTime ld=LocalDateTime.now();
System.out.println(ld.get(ChronoField.DAY_OF_MONTH));
System.out.println(ld.get(ChronoField.AMPM_OF_DAY));
System.out.println(ld.get(ChronoField.YEAR));
System.out.println(ld.get(ChronoField.NANO_OF_SECOND));
    }
    
}
