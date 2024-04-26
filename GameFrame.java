package com.brainmentors.gaming;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	public GameFrame() {
		Board board = new Board();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Game Dev in Java");
		this.setSize(1100,800);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		add(board);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameFrame();
		
		

	}

}
