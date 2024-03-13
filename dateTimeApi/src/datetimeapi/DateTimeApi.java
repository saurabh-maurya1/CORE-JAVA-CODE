
package datetimeapi;

import java.util.Date;


public class DateTimeApi {

    public static void main(String[] args) {
        System.out.println("In miliSecond "+System.currentTimeMillis());
        
        System.out.println("In Year "+System.currentTimeMillis()/1000/60/60/24/365);
        Date d = new Date();
        System.out.println("Current date in Indian standard time zone "+d);
        
        
          Date d1 = new Date(System.currentTimeMillis());
        System.out.println("Current date in Indian standard time zone "+d1);
        
        
          Date d3 = new Date("1/1/1980");
        System.out.println("Current date in Indian standard time zone "+d3);
        
          Date d4 = new Date();
        System.out.println(d4.getTime()); // it will give current time in milli second
        System.out.println(d4.getDay());
        System.out.println(d4.getMonth());
        System.out.println(d4.getYear()+1900);
    }
    
}
