/**
 * 1. extends JFrame
 *
 */
package com.gui;
import javax.swing.*;
import java.awt.*;

public class Border extends JFrame{
	
	JButton jb1, jb2, jb3, jb4, jb5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Border bl = new Border();
	}
	
	public Border(){
		jb1 = new JButton("mid");
		jb2 = new JButton("nor");
		jb3 = new JButton("eas");
		jb4 = new JButton("sou");
		jb5 = new JButton("wes");
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.EAST);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.WEST);
		
		//set window
		this.setTitle("borderLayout test");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
