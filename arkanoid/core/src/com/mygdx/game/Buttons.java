package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.environment.PointLight;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

public class Buttons extends Rectangle {

	
	private Texture texture;
	

	public Buttons(Texture texture) {

		this.texture = texture;
		this.height = 40;
		this.width = 100;

	}

	public void draw(SpriteBatch batch) {
		batch.draw(texture, this.x, this.y);
	}

	

	public void dispose() {
		texture.dispose();
	}

}
