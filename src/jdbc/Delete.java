package jdbc;

import java.sql.*;

public class Delete {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

            Statement stmt = con.createStatement();

            stmt.executeUpdate("delete from employee where eno=7");
            System.out.print("Done");
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
