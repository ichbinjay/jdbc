package jdbc;

import java.sql.*;

public class CInsert {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

            CallableStatement cs = con.prepareCall("{call sp(?,?,?)}");
            cs.setInt(1, 55);
            cs.setString(2, "mango");
            cs.setInt(3, 9999);
            cs.execute();
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
