/**
 * 
 */
/**
 * @author Максим
 *
 */
package com.gygiom.gameworld;

import com.gygiom.gyHelpers.AssetLoader;
import com.gygiom.gameobjects.Bird;
import com.gygiom.gameobjects.ScrollHandler;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;


public class GameWorld {

    private Bird bird;
    private ScrollHandler scroller;
    private Rectangle ground;
    private int score = 0;
    
    public GameWorld(int midPointY) {
        bird = new Bird(33, midPointY - 5, 17, 12);
        //трава должна начинаться на 66 писеля ниже midPointY
        scroller = new ScrollHandler(null, midPointY + 66);
        ground = new Rectangle(0, midPointY + 66, 137, 11);
    }

    public void update(float delta) {
        // добавим лимит по дельте, так что если будут тормоза
        // во время обновленя, то работа с колизией не будет нарушена

        if (delta > .15f) {
            delta = .15f;
        }

        bird.update(delta);
        scroller.update(delta);

        if (scroller.collides(bird) && bird.isAlive()) {
            scroller.stop();
            bird.die();
            AssetLoader.dead.play();
        }

        if (Intersector.overlaps(bird.getBoundingCircle(), ground)) {
            scroller.stop();
            bird.die();
            bird.decelerate();
        }
    }

    public Bird getBird() {
        return bird;

    }

    public ScrollHandler getScroller() {
        return scroller;
    }
    
    public int getScore() {
        return score;
    }
    
    public void addScore(int increment) {
        score += increment;
    }
}
