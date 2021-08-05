package mysql;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ServerAccess {
    private Connection con;
    private Statement stmt;

    public ServerAccess() {
        try {
            ServerConnection myConnection = new ServerConnection();
            con = myConnection.getConnection();
            stmt = con.createStatement();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"loi dbacess");
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
