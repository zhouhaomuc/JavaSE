package com.gui;
import java.awt.*;
import javax.swing.*;
public class Flowout extends JFrame{
	private JButton jb1, jb2, jb3, jb4, jb5, jb6;
	
	public static void main(String[] args) {

		Flowout fl = new Flowout();
	}
	
	public Flowout(){
		jb1 = new JButton("1");
		jb2 = new JButton("2");	
		jb3 = new JButton("3");
		jb4 = new JButton("4");
		jb5 = new JButton("5");
		jb6 = new JButton("6");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		
		//set Layout 
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		//this.setLayout(null);
		//set window attibutes
		this.setTitle("borderLayout test");
		this.setSize(200, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		this.setResizable(false);
		//set visible
		this.setVisible(true);
	}
}
