package com.gygiom.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.gygiom.screens.GameScreen;
import com.gygiom.gyHelpers.AssetLoader;

public class MyGdxGame extends Game {

    @Override
    public void create() {
        Gdx.app.log("GYGGame", "created");
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
