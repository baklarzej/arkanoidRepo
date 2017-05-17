package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Player extends Rectangle{
	
	private Texture texture;
	private int speedX = 100;
	public Player (Texture texture){
		
		this.texture = texture;
		this.x = 200;
		this.y = 20;
		this.width = texture.getWidth();
		
	}
	public void draw(SpriteBatch batch){
		batch.draw(texture, this.x, this.y);
	}
	
	public void moveR(){
			if(x <= (380 - this.width))
		x += speedX * Gdx.graphics.getDeltaTime();
		
		 
	}
	public void moveL(){
		if(x >= (20))
	x -= speedX * Gdx.graphics.getDeltaTime();
	
	 
}
	public void dispose(){
		texture.dispose();
	}
}
