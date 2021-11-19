/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Graphics;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author tk
 */
public class Menu extends JPanel{
    Singleplayer oneplayer;
    Twoplayer twoplayer;
    
    private ImageIcon bg = new ImageIcon("imagee/1.gif");
    private ImageIcon name = new ImageIcon("imagee/name.png");
    private ImageIcon btone = new ImageIcon("imagee/sp.png");
    private ImageIcon bttwo = new ImageIcon("imagee/twop.png");
    private ImageIcon btexit = new ImageIcon("imagee/exit.png");
    public JButton BOne = new JButton(btone);
    public JButton BTwo = new JButton(bttwo);
    public JButton BExit = new JButton(btexit);
    
    public void setButton(){
        setLayout(null);
        add(BOne);
        BOne.setBounds(465, 285, 290, 90);
        add(BTwo);
        BTwo.setBounds(470, 400, 280, 90);
        add(BExit);
        BExit.setBounds(500, 500, 200, 90);
        
        //Transparent Button
        BOne.setOpaque(false);
        BOne.setContentAreaFilled(false);
        BOne.setBorderPainted(false);
        BTwo.setOpaque(false);
        BTwo.setContentAreaFilled(false);
        BTwo.setBorderPainted(false);
        BExit.setOpaque(false);
        BExit.setContentAreaFilled(false);
        BExit.setBorderPainted(false);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg.getImage(),0,0,1200,800,this);
        g.drawImage(name.getImage(),-120,-475,1500,1600,this);
        g.drawImage(btone.getImage(), -10, -75, 1200, 1200, this);
        g.drawImage(bttwo.getImage(), -15, 35, 1200, 1200, this);
        g.drawImage(btexit.getImage(), -20, 150, 1200, 1200, this);
	
    }
    
    void playMusic(){
        try{
            File musicPath = new File("song/BG.wav");
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else{
                System.out.println("Can't find file");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}