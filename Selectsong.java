/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author tk
 */
public class Selectsong extends JPanel implements ActionListener{
    private ImageIcon bg2 = new ImageIcon("imagee/1.gif");
    private ImageIcon n = new ImageIcon("imagee/ss.png");
    private ImageIcon nextL = new ImageIcon("imagee/nextL.png");
    private ImageIcon nextR = new ImageIcon("imagee/nextR.png");
    private ImageIcon nsong = new ImageIcon("imagee/ns.png");
    
    private ImageIcon s1 = new ImageIcon("imagee/blackmamba.png");
    private ImageIcon s2 = new ImageIcon("imagee/เอาไงดีว้า.png");
    
    public JButton Beasy = new JButton();
    public JButton Bmed = new JButton();
    public JButton Bhard = new JButton();
    public JButton NextL = new JButton();
    public JButton NextR = new JButton();
    
    Selectsong(){
        setLayout(null);
        add(Beasy);
        Beasy.setBounds(200, 583, 160, 80);
        add(Bmed);
        Bmed.setBounds(500, 583, 160, 80);
        add(Bhard);
        Bhard.setBounds(800, 583, 160, 80);
        add(NextL);
        NextL.setBounds(90, 325, 50, 50);
        add(NextR);
        NextR.setBounds(1050, 325, 50, 50);
        
        //Transparent Button
        Beasy.setOpaque(false);
        Beasy.setContentAreaFilled(false);
        Beasy.setBorderPainted(false);
        Bmed.setOpaque(false);
        Bmed.setContentAreaFilled(false);
        Bmed.setBorderPainted(false);
        Bhard.setOpaque(false);
        Bhard.setContentAreaFilled(false);
        Bhard.setBorderPainted(false);
        NextL.setOpaque(false);
        NextL.setContentAreaFilled(false);
        NextL.setBorderPainted(false);
        NextR.setOpaque(false);
        NextR.setContentAreaFilled(false);
        NextR.setBorderPainted(false);
        
        Beasy.addActionListener(this);
	Bmed.addActionListener(this);
	Bhard.addActionListener(this);
    }
    
    private int choice = 0;
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Beasy){
            
        }
        else if(e.getSource() == Bmed){
            
        }
        else if(e.getSource() == Bhard){
            
        }
        else if(e.getSource() == NextL){
            choice++;
           
        }
        else if(e.getSource() == NextR){
            choice--;
        }
    }
    
    private int[] song = new int [30];
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg2.getImage(), 0, 0, 1200, 800, this);
        g.drawImage(n.getImage(), 130, -360, 1000, 1000, this);
        g.drawImage(s1.getImage(), -165, -300, 1500, 1500, this);	 
        g.drawImage(nsong.getImage(), 375, 170, 600, 600, this);	 
        g.drawImage(nextL.getImage(), 90, 325, 50, 50, this);	 
        g.drawImage(nextR.getImage(), 1050, 325, 50, 50, this);	
        
        //Album
        for(int i=0;i<30;i++){
            song[i] = i+1;
        }
        if(song[0] == 1){
            g.drawImage(s2.getImage(), -165, -300, 1500, 1500, this);
        }
    }
   
    
}
