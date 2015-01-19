/**
 * 
 */
/**
 * @author ћаксим
 *
 */
package com.gygiom.gameworld;

import com.gygiom.gameobjects.Bird;
import com.gygiom.gameobjects.ScrollHandler;

public class GameWorld {

    private Bird bird;
    private ScrollHandler scroller;

    public GameWorld(int midPointY) {
        bird = new Bird(33, midPointY - 5, 17, 12);
        // трава должна начинатьс€ на 66 пикселей ниже midPointY
        scroller = new ScrollHandler(midPointY + 66);
    }

    public void update(float delta) {
        bird.update(delta);
        scroller.update(delta);
    }

    public Bird getBird() {
        return bird;

    }

    public ScrollHandler getScroller() {
        return scroller;
    }
}