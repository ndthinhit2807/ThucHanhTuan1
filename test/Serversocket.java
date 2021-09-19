
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndthi
 */
public class Serversocket {
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    
    public void connect(){
        int a;
        try {
            ServerSocket ssv = new ServerSocket(8888);         
            // socker server chắp nhận kết nối từ client
            Socket scon = ssv.accept();
            DataInputStream din = new DataInputStream(scon.getInputStream());
        DataOutputStream dout = new DataOutputStream(scon.getOutputStream());
        
            // server nhận dữ liệu từ client
            
            a = din.readInt();
            System.out.println(a);
            System.out.println(fibonacci(a));
            dout.writeInt(fibonacci(a));
            
            
            
        
        } catch (IOException ex) {
            Logger.getLogger(Serversocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
