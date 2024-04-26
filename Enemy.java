package com.brainmentors.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends Sprite {

	public Enemy(int x, int speed){
		w=100;
		h=100;
		this.speed = speed;
		this.x = x;
		y=50;
		image = new ImageIcon(Enemy.class.getResource("ninja-star.gif"));
	}
	public void move() {
		if(y>900) {
			y=0;
		}
		y = y + speed;
	}
}
