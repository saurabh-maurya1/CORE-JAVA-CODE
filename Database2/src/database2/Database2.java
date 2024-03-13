


                //insert a element inside table;
package database2;
import java.util.*;
import java.sql.*;

public class Database2 {

    public static void main(String[] args)throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:c:\\sqllite\\univ.db");
        Statement stm = con.createStatement();
        stm.executeUpdate("insert into dept values(70,'CHEM')");
        stm.close();
        stm.close();
        
        
    }
    
}
