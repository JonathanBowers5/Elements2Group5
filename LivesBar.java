import greenfoot.*;
import java.util.ArrayList;

public class LivesBar extends Actor {
    private int lives = 5;
    private GreenfootImage fullHeart = new GreenfootImage("full_heartred.png");
    private GreenfootImage emptyHeart = new GreenfootImage("empty_heartblue.png");
    private ArrayList<Actor> hearts = new ArrayList<>();

    public LivesBar() {
        updateDisplay();
    }

    public void addedToWorld(World world) {
        for (int i = 0; i < 5; i++) {
            Actor heart = new Actor() {};
            heart.setImage(i < lives ? new GreenfootImage(fullHeart) : new GreenfootImage(emptyHeart));
            world.addObject(heart, 30 + i * 40, 30);
            hearts.add(heart);
        }
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
            updateDisplay();
        }
    }

    public int getLives() {
        return lives;
    }

    public void updateDisplay() {
        for (int i = 0; i < hearts.size(); i++) {
            hearts.get(i).setImage(i < lives ? new GreenfootImage(fullHeart) : new GreenfootImage(emptyHeart));
        }
    }
}