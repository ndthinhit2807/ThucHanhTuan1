/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4.Thread.Bai1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ndthi
 */
public class Balls extends Thread{
    private JPanel box;
    private static final int xSize = 10;
    private static final int ySize = 10;
    Random r = new Random();
    private int x = r.nextInt();
    private int y= r.nextInt();
    private int dx = 2;
    private int dy =2;
    
    
    
    public Balls(JPanel p){
        box = p;
    }
    
    public void draw(){
        Graphics g = box.getGraphics();
        g.fillOval(x, y, xSize, ySize);
        g.dispose();
    }
    
    public void move(){
        Graphics g = box.getGraphics();
        g.setXORMode(Color.CYAN);
        g.fillOval(x, y, xSize, ySize);
        x+=dx;
        y+=dy;
        Dimension d = box.getSize();
        if (x<0) {
            x=0;
            dx =- dx;
        }
        if (x+xSize>=d.getWidth()) {
            x=d.width-xSize;
            dx =-dx;
        }
        if (y<0) {
             y=0;
            dy =- dy;
        }
        if (y+ySize>=d.getHeight()) {
            y=d.height-ySize;
            dy =-dy;
        }
        g.fillOval(x, y, dx, xSize);
        g.dispose();
    }
    
    public void run(){
        draw();
        for (int i = 0; i < 100000; i++) {
            move();
            try {
                sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
