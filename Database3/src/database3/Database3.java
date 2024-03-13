                 
package database3;
import java.sql.*;
public class Database3 {
    public static void main(String[] args)throws Exception {
Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:c:\\sqllite\\univ.db");
        Statement stm = con.createStatement();
        // delete the data
        stm.executeUpdate("delete from dept where deptno>=60");
        // update the data
        stm.executeUpdate("Update dept set dname='Chem' where deptno=50");
        stm.close();
        con.close();
        
        
        
        
    }
    
}
