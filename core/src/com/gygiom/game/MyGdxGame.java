package com.gygiom.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.gygiom.screens.GameScreen;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		 Gdx.app.log("MyGdxGame", "created");
		 setScreen(new GameScreen());
	}
	
}
