

       // insertion of data inside database throigh the user by using PreparedStatement ;
package database4;
import java.sql.*;

public class Database4 {

    public static void main(String[] args)throws Exception {
       Class.forName("org.sqlite.JDBC");
       Connection con=DriverManager.getConnection("jdbc:sqlite:c:\\sqllite\\univ.db");
       PreparedStatement stm = con.prepareStatement("insert into Students values(?,?,?,?)");
       java.util.Scanner sc = new java.util.Scanner(System.in);
       System.out.println("Enter Student data");
       int r = sc.nextInt();
       sc.nextLine();
        String name = sc.nextLine();
       String city = sc.nextLine();
       int dno = sc.nextInt();
       stm.setInt(1, r);
       stm.setString(2,name);
       stm.setString(3,city);
       stm.setInt(4, dno);
       stm.executeUpdate();
       stm.close();
       con.close();
    }
    
}
