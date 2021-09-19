/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T3;
import java.io.*;
import java.util.*;
import java.net.*;
/**
 *
 * @author ASUS
 */
public class server_Tong2so_TCP {
    public static void main(String[] args) throws IOException {
        // khởi tạo socket server
        ServerSocket ssv = new ServerSocket(8888);
        System.out.println("server đang đợi kết nối từ client!!!");
        // socker server chắp nhận kết nối từ client
        Socket scon = ssv.accept();
        DataInputStream in = new DataInputStream(scon.getInputStream());
        DataOutputStream out = new DataOutputStream(scon.getOutputStream());
        System.out.println("server đã kết nối với client!!!");
        while(Boolean.TRUE)
        {
            // server nhận dữ liệu từ client
            int a,b,tong;
            a = in.readInt();
            System.out.println("số a là: " + a);
            b = in.readInt();
            System.out.println("số b là: " + b);
            //server xử lý dữ liệu
            tong = a+b;
            // server gửi dữ liệu về cho client
            out.writeInt(tong);
        }
        // thực hiện đóng kết nối
        scon.close();
    }
}
