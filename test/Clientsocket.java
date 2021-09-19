
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndthi
 */
public class Clientsocket {
     
    public void connect(int a) {
        try {
            Socket scon;
            scon = new Socket("localhost",8888);
            JOptionPane.showMessageDialog(null, "Da ket noi");
            DataInputStream din= new DataInputStream(scon.getInputStream());
            DataOutputStream dout = new DataOutputStream(scon.getOutputStream());
                
            
        
            
            
            dout.writeInt(a);
            
             System.out.println(din.readInt());
             
             
            
//            // client nhận dữ liệu từ server gửi về
//            tong = din.readInt();
//            System.out.println("tổng 2 số a và b là: " + tong);
        
//        scon.close();
        } catch (IOException ex) {
            Logger.getLogger(Clientsocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
