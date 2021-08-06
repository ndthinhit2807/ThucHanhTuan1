/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;
import javax.swing.*;
import java.sql.*;

public class MyAccess {
    private Connection con;
    private Statement stmt;

    public MyAccess() {
        try {
            MyConnection myConnection = new MyConnection();
            con = myConnection.getConnection();
            stmt = con.createStatement();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"loi dbacess");
            System.out.println("");
        }
    }
    public int Update(String str){
        try {
            int i = stmt.executeUpdate(str);
            return i;
        }catch (Exception ex){
            return -1;
        }
    }
    public ResultSet Query(String str){
        try {
            ResultSet resultSet = stmt.executeQuery(str);
            return resultSet;
        }catch (Exception ex){
            return null;
        }
    }
}