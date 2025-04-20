import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LivesBar extends Actor {
    private int lives = 5;
    private int maxLives = 5;
    private GreenfootImage heartFull;
    private GreenfootImage heartEmpty;

    public LivesBar() {
        heartFull = new GreenfootImage("full_heartred.png");
        heartEmpty = new GreenfootImage("empty_heartblue.png");
        update();
    }

    public void act() {
        
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
            update();
        }
    }

    public void gainLife() {
        if (lives < maxLives) {
            lives++;
            update();
        }
    }

    public int getLives() {
        return lives;
    }

    public void update() {
        int heartWidth = heartFull.getWidth();
        int spacing = 5;
        int imageWidth = (heartWidth + spacing) * maxLives;
        int imageHeight = heartFull.getHeight();

        GreenfootImage image = new GreenfootImage(imageWidth, imageHeight);

        for (int i = 0; i < maxLives; i++) {
            if (i < lives) {
                image.drawImage(heartFull, i * (heartWidth + spacing), 0);
            } else {
                image.drawImage(heartEmpty, i * (heartWidth + spacing), 0);
            }
        }

        setImage(image);
    }
}