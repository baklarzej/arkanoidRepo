package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Disposable;

public class Assets implements Disposable{

	public final AssetManager manager = new AssetManager();
	
	public void load(){
		manager.load("Coin.png", Texture.class);
		
		
	}
	
	public void dispose(){
		manager.dispose();
		
	}
}
