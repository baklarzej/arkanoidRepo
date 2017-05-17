package com.mygdx.game;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Animation.PlayMode;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.graphics.Camera;

public class Arkanoid extends Game {

	private SpriteBatch batch;
	private Assets assets;
	private Player coin;
	public int gamestage = 0;
	private Player player;
	private Texture coinTexture;
	private Camera camera;
	private MouseControl mouse;

	Texture rect;

	public void create() {
		coinTexture = new Texture("Coin.png");
		coin = new Player(coinTexture);
		mouse = new MouseControl();

		assets = new Assets();
		assets.load();
		assets.manager.finishLoading();

		if (assets.manager.update()) {
			loadData();
		}

		batch = new SpriteBatch();
	}

	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		controls();

		batch.begin();
		// menu
		if (gamestage == 0) {
			controls();
		}
		// game
		if (gamestage == 1) {
			game();

		}

		// ranking
		if (gamestage == 2) {
			ranking();
		}

		batch.end();

	}

	public void dispose() {

		System.out.print("dispose");
		batch.dispose();

	}

	private void loadData() {
		Texture coin = assets.manager.get("Coin.png", Texture.class);
	}

	private void game() {
		coin.draw(batch);
	}

	public void menu() {

	}

	public void ranking() {

	}

	public void controls() {
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			coin.moveR();
		}
		if (Gdx.input.isKeyJustPressed(Keys.P)) {
			gamestage++;
		}

		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			coin.moveL();
		}

	}

	public boolean touchDown(int screenX, int screenY, int pointer, int button) {

		return false;
	}

}
