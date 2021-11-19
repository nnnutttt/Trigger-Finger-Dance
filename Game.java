/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
/**
 *
 * @author tk
 */
public class Game extends JFrame implements ActionListener{
    Menu menu = new Menu();
    Singleplayer oneplayer = new Singleplayer();
    Twoplayer t = new Twoplayer();
    Selectsong ss = new Selectsong();
    public Game(){
        this.setSize(1200,800);
//        this.add(menu);
//        menu.setButton();
//        menu.playMusic();
        
        this.add(oneplayer);
        oneplayer.playMusic();
        
        menu.BOne.addActionListener(this);
	menu.BTwo.addActionListener(this);
	menu.BExit.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == menu.BOne){
            this.remove(menu);
            this.setSize(1200, 800);
            add(ss);
            invalidate();
            validate();
        }
        else if(e.getSource() == menu.BTwo){
            this.remove(menu);
            this.setSize(1200, 800);
            add(ss);
            invalidate();
            validate();
        }
        else if(e.getSource() == menu.BExit){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        JFrame window = new Game();
        window.setSize(1200,800);
        window.setTitle("Trigger Finger Dance");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}