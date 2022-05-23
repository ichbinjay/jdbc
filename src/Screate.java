package jdbc;
import java.sql.*;
public class Screate{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
            
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("create table student (rno int, name varchar(20), branch varchar(20))");
            System.out.print("Done");
            con.close();
        }catch(Exception e){
            System.out.print(e);
        }
    }
}
