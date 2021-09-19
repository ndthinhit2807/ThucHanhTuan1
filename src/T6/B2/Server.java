/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T6.B2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author ndthi
 */
public class Server {
    static final int PORT = 1234;
    private DatagramSocket socket;

    public Server() {
        try {
            socket = new DatagramSocket(PORT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void action() {
        InetAddress host = null;
        int port;
        String chuoi = "";
        try {
            System.out.println("Server is listening");
            while (true) {
                DatagramPacket packet = receive();
                host = packet.getAddress();
                port = packet.getPort();
                chuoi = new String(packet.getData()).trim();
                if (!chuoi.equals("")) {
                    Scanner scanner = new Scanner(chuoi);
                    scanner.useDelimiter("@");
                    int so1 = scanner.nextInt();
                    String pheptoan = scanner.next();
                    int so2 = scanner.nextInt();
                    if (pheptoan.equals("+")){
                        chuoi = (so1 + so2)+"";
                    }
                    if (pheptoan.equals("-")){
                        chuoi = (so1 - so2)+"";
                    }
                    if (pheptoan.equals("*")){
                        chuoi = (so1 * so2)+"";
                    }
                    if (pheptoan.equals("/")){
                        chuoi = ((float) so1/ so2)+"";
                    }
                    send(chuoi, host, port);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            socket.close();
        }
    }

    private void send(String chuoi, InetAddress host, int port) throws IOException {
        byte[] bufer = chuoi.getBytes();
        DatagramPacket packet = new DatagramPacket(bufer, bufer.length, host, port);
        socket.send(packet);
    }

    private DatagramPacket receive() throws IOException {
        byte[] buffer = new byte[65507];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        return packet;
    }


    public static void main(String[] args) {
        // TODO code application logic here
        new Server().action();
    }
    
}
