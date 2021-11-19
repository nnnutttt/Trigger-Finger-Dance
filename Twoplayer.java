/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author tk
 */                        
public class Twoplayer extends JPanel implements ActionListener, KeyListener{
    final int PANEL_WIDTH = 1200;
    final int PANEL_HEIGHT = 800;

    private ImageIcon up = new ImageIcon("imagee/up.png");
    private ImageIcon down = new ImageIcon("imagee/down.png");
    private ImageIcon right = new ImageIcon("imagee/right.png");
    private ImageIcon left = new ImageIcon("imagee/left.png");
    Image bg;
    Image cup;
    Image cleft;
    Image cdown;
    Image cright;
    Image cdelete;
    
    Timer timer;
    int xLVelocity = 1;
    int yLVelocity = 2;
    int xUVelocity = 1;
    int yUVelocity = 2;
    int xRVelocity = 1;
    int yRVelocity = 2;
    int xDVelocity = 1;
    int yDVelocity = 2;
    int xup = 1, xleft = 1, xright = 1, xdown = 1;
    int yup = 2, yleft = 4, yright = 6, ydown = 8;

    public Twoplayer(){
        //this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        cup = new ImageIcon("imagee/cup.png").getImage();
        cleft = new ImageIcon("imagee/cleft.png").getImage();
        cdown = new ImageIcon("imagee/cdown.png").getImage();
        cright = new ImageIcon("imagee/cright.png").getImage();
        bg = new ImageIcon("imagee/เอาไงดีว้า.jpg").getImage();
        timer = new Timer(10, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    @Override
    public void paint(Graphics g){       
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, 1200, 800, this);
        //arrow
        g2D.drawImage(cleft, xleft-5, yleft-570, 2000, 2000, this);
        g2D.drawImage(cdown, xdown+145, ydown-570, 2000, 2000, this);
        g2D.drawImage(cup, xup+283, yup-570, 2000, 2000, this);
        g2D.drawImage(cright, xright+435, yright-570, 2000, 2000, this);
        //frame arrow
        g.drawImage(left.getImage(), 300, 580, 150, 150, this);
        g.drawImage(down.getImage(), 450, 580, 150, 150, this);
        g.drawImage(up.getImage(), 590, 580, 150, 150, this);
        g.drawImage(right.getImage(), 740, 580, 150, 150, this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        yleft = yleft + 1 + yLVelocity;
        ydown = ydown + 1 + yDVelocity;
        yup = yup + 1 + yUVelocity;
        yright = yright + 1 + yRVelocity;
        repaint();
    }
    
    //@Override
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT){
            if(yleft < 680){
                System.out.print("MISS");
                //DeleteL();
                xLVelocity = 1000;
                yLVelocity = 1000;
            }
            if(yleft >= 680 && yleft <= 710){
                System.out.print("BAD");
                //DeleteL();
                xLVelocity = 1000;
                yLVelocity = 1000;
            }
            if(yleft >= 710 && yleft <= 725){
                System.out.print("COOL");
                //DeleteL();
                xLVelocity = 1000;
                yLVelocity = 1000;
            }
            if(yleft >= 725 && yleft <= 735){
                System.out.print("GREAT");
                //DeleteL();
                xLVelocity = 1000;
                yLVelocity = 1000;
            }
            if(yleft >= 735 && yleft <= 740){
                System.out.print("PERFECT");
                //DeleteL();
                xLVelocity = 1000;
                yLVelocity = 1000;
            }
            if(yleft >= 740 && yleft <= 780){
                System.out.print("COOL");
                //DeleteL();
                xLVelocity = 1000;
                yLVelocity = 1000;
            }
            if(yleft > 780){
                System.out.print("MISS");
                //DeleteL();
                xLVelocity = 1000;
                yLVelocity = 1000;
            }
        }
        if(key == KeyEvent.VK_DOWN){
            if(ydown < 680){
                System.out.print("MISS");
                //DeleteL();
                xDVelocity = 1000;
                yDVelocity = 1000;
            }
            if(ydown >= 680 && ydown <= 710){
                System.out.print("BAD");
                //DeleteL();
                xDVelocity = 1000;
                yDVelocity = 1000;
            }
            if(ydown >= 710 && ydown <= 725){
                System.out.print("COOL");
                //DeleteL();
                xDVelocity = 1000;
                yDVelocity = 1000;
            }
            if(ydown >= 725 && ydown <= 735){
                System.out.print("GREAT");
                //DeleteL();
                xDVelocity = 1000;
                yDVelocity = 1000;
            }
            if(ydown >= 735 && ydown <= 740){
                System.out.print("PERFECT");
                //DeleteL();
                xDVelocity = 1000;
                yDVelocity = 1000;
            }
            if(ydown >= 740 && ydown <= 780){
                System.out.print("COOL");
                //DeleteL();
                xDVelocity = 1000;
                yDVelocity = 1000;
            }
            if(ydown > 780){
                System.out.print("MISS");
                //DeleteL();
                xDVelocity = 1000;
                yDVelocity = 1000;
            }
        }
        if(key == KeyEvent.VK_UP){
            if(yup < 680){
                System.out.print("MISS");
                //DeleteL();
                xUVelocity = 1000;
                yUVelocity = 1000;
            }
            if(yup >= 680 && yup <= 710){
                System.out.print("BAD");
                //DeleteL();
                xUVelocity = 1000;
                yUVelocity = 1000;
            }
            if(yup >= 710 && yup <= 725){
                System.out.print("COOL");
                //DeleteL();
                xUVelocity = 1000;
                yUVelocity = 1000;
            }
            if(yup >= 725 && yup <= 735){
                System.out.print("GREAT");
                //DeleteL();
                xUVelocity = 1000;
                yUVelocity = 1000;
            }
            if(yup >= 735 && yup <= 740){
                System.out.print("PERFECT");
                //DeleteL();
                xUVelocity = 1000;
                yUVelocity = 1000;
            }
            if(yup >= 740 && yup <= 780){
                System.out.print("COOL");
                //DeleteL();
                xUVelocity = 1000;
                yUVelocity = 1000;
            }
            if(yup > 780){
                System.out.print("MISS");
                //DeleteL();
                xUVelocity = 1000;
                yUVelocity = 1000;
            }
        }
        if(key == KeyEvent.VK_RIGHT){
            if(yright < 680){
                System.out.print("MISS");
                //DeleteL();
                xRVelocity = 1000;
                yRVelocity = 1000;
            }
            if(yright >= 680 && yright <= 710){
                System.out.print("BAD");
                //DeleteL();
                xRVelocity = 1000;
                yRVelocity = 1000;
            }
            if(yright >= 710 && yright <= 725){
                System.out.print("COOL");
                //DeleteL();
                xRVelocity = 1000;
                yRVelocity = 1000;
            }
            if(yright >= 725 && yright <= 735){
                System.out.print("GREAT");
                //DeleteL();
                xRVelocity = 1000;
                yRVelocity = 1000;
            }
            if(yright >= 735 && yright <= 740){
                System.out.print("PERFECT");
                //DeleteL();
                xRVelocity = 1000;
                yRVelocity = 1000;
            }
            if(yright >= 740 && yright <= 780){
                System.out.print("COOL");
                //DeleteL();
                xRVelocity = 1000;
                yRVelocity = 1000;
            }
            if(yright > 780){
                System.out.print("MISS");
                //DeleteL();
                xRVelocity = 1000;
                yRVelocity = 1000;
            }
        }
    }
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void keyReleased(KeyEvent e){}
    
    void playMusic(){
        try{
            File musicPath = new File("song/aow_ngi_d_wa.wav");
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
            else{
                System.out.println("Can't find file");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Aow_ngi_d_wa(String namesong){
        int[] a = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4,
                   1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4,
                   1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4,
                   1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4,
                   1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4,
                   1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4,};
        for(int i=0;i<96;i++){
            if(a[i] == 1){
                KeyEvent ke = new KeyEvent(new Component() {}, 0, 0, 0, KeyEvent.VK_UP);
                this.keyPressed(ke);
            }
        }
        
    }
    
}