package jdbc;

import java.sql.*;

public class Pinsert {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

            PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?)");
            stmt.setInt(1, 11);
            stmt.setString(2, "alu");
            stmt.setInt(3, 3000);
            stmt.executeUpdate();
            System.out.print("Done");
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
