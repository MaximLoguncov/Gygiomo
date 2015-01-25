package com.gygiom.gyg;

import com.badlogic.gdx.Game;
import com.gygiom.screens.SplashScreen;
import com.gygiom.gyHelpers.AssetLoader;

public class gyg extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}