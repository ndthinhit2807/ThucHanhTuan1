/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH_LYTHUYET;
import java.io.*;
import java.util.*;
import java.net.*;
/**
 *
 * @author ASUS
 */
public class client_Tong2so_TCP {
    public static void main(String[] args) throws IOException {
        Socket scon = new Socket("localhost", 8888);
        System.out.println("Đang yêu cầu kết nối server!!");
        DataInputStream din= new DataInputStream(scon.getInputStream());
        DataOutputStream dout = new DataOutputStream(scon.getOutputStream());
        Scanner sc = new Scanner(System.in);
        System.out.println("đã kết nối với server!!");
        // client nhập dữ liệu từ bàn phím và gửi lên server
        while(Boolean.TRUE){            
            
        
            int a,b,tong;
            System.out.println("nhập số a:");
            a = sc.nextInt();
            dout.writeInt(a);
             System.out.println("nhập số b:");
            b = sc.nextInt();
            dout.writeInt(b);
            // client nhận dữ liệu từ server gửi về
            tong = din.readInt();
            System.out.println("tổng 2 số a và b là: " + tong);
        }
        scon.close();
    }
}
