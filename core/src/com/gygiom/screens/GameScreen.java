/**
 * 
 */
/**
 * @author MaximLoguntsov
 *
 */
package com.gygiom.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.gygiom.gameworld.GameRenderer;
import com.gygiom.gameworld.GameWorld;
import com.gygiom.gyHelpers.InputHandler;
import com.gygiom.gameobjects.Bird;

public class GameScreen implements Screen {
    
    private GameWorld world;
    private GameRenderer renderer;
    
    public GameScreen() {
    	float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world);
        
        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
       
        Bird bird = world.getBird();
        InputHandler handler = new InputHandler(bird);
        Gdx.input.setInputProcessor(handler);
    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");     
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");        
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");       
    }

    @Override
    public void dispose() {
        // Оставьте пустым
    }

}