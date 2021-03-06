package jdbc;

import java.sql.*;
import java.util.Scanner;

public class SPinsert {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?)");
            Scanner sc = new Scanner(System.in);
            for (int c = 0; c < 10; c++) {
                System.out.println("Enter rno");
                stmt.setInt(1, sc.nextInt());
                System.out.println("Enter Name");
                stmt.setString(2, sc.next());
                System.out.println("Enter Branch");
                stmt.setString(3, sc.next());
                stmt.executeUpdate();
            }
            sc.close();
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
