                // read the all data inside the  sutdent table;
package database;
import java.sql.*;
public class Database {

    public static void main(String[] args)throws Exception {
Class.forName("org.sqlite.JDBC");
Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\sqllite\\univ.db");
Statement stm = con.createStatement();
ResultSet rs =stm.executeQuery("select * from Students");

while(rs.next()){
    System.out.print(rs.getInt("roll")+" ");
    System.out.print(rs.getString("name")+" ");
    System.out.print(rs.getString("city")+" ");
    System.out.println(rs.getInt(4)+ " ");
    
}
stm.close();
con.close();
    }
    
}
