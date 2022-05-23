/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author vignan
 */
public class Insert {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
            
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("insert into employee values(7, 'sita',6000)");
            System.out.print("Done");
            con.close();
        }catch(Exception e){
            System.out.print(e);
        }
    }
}
