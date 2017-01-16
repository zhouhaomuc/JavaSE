package com.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Gui extends JFrame{
	JButton jb1 = null;
	public static void main(String[] args) {
		Gui gui = new Gui();		
	}
	
	public Gui(){
		
		jb1 = new JButton("im button");
		this.add(jb1);
		this.setTitle("Hello Wrold!");
		this.setSize(400,260);
		this.setLocation(300, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
