package com.gui;

import javax.swing.*;
import java.awt.*;

public class GridLay extends JFrame{

	JButton jbs[] = new JButton[9];
	public static void main(String[] args) {
		GridLay gl = new GridLay();
	}
	
	public GridLay(){
		for(int i=0; i<9; i++){
			jbs[i] = new JButton(String.valueOf(i));
			this.add(jbs[i]);
		}
		
		//set gridlayout
		this.setLayout(new GridLayout(3,3,10,10));
		this.setTitle("borderLayout test");
		this.setSize(200, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//block window size change
		this.setResizable(false);
		//set visible
		this.setVisible(true);
	}
	
}
