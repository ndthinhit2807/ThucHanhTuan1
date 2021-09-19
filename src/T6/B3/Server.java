/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T6.B3;

import javax.swing.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author ndthi
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chat app = new Chat();
////         Chat c = new Chat();
//                app.setVisible(true);
        DatagramSocket socket = null;
        String strContent="";
        try {
            byte[] buffer = new byte[1024];
            socket = new DatagramSocket(1234);
            DatagramPacket receivePacket;
            String stReceive;
             boolean ktFinish = false;
            while (!ktFinish){
                receivePacket = new DatagramPacket(buffer,buffer.length);
                socket.receive(receivePacket);
                stReceive = new String(receivePacket.getData(),0,receivePacket.getLength());
                JOptionPane.showMessageDialog(null, stReceive);
                strContent = app.getcontentchat();
                strContent += "\nNhan : " + stReceive;
                app.setchatcontent(strContent);
                if (stReceive.equals("end.")||stReceive.equals("end.")){
                    ktFinish = true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            socket.close();
        }
    }
    
}
