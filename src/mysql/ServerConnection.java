/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ndthi
 */
public class ServerConnection {
    public Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String URL = "jdbc:sqlserver://localhost:1433;Database = quanlytaikhoan;user=admin;password=123456ab";
            Connection con = DriverManager.getConnection(URL);
            return con;
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Loi",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}