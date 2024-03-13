                    // create a table;
package database5;
import java.sql.*;

public class Database5 {

    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:c:\\sqllite\\univ.db");
        Statement stm = con.createStatement();
        //for creation
       stm.executeUpdate("Create table Temp(a integer,b float)");
        //for drop the table
        stm.executeUpdate("drop table book");
        stm.close();
        con.close();
    }
    
}
