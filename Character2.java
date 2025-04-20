import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character2 extends Actor {
    int speed = 5;
    int jumpHeight = 10;
    int gravity = 2;
    boolean isJumping = false;

    private boolean isInvincible = false;
    private int invincibilityTime = 60;
    private int invincibilityCounter = 0;

    public void act() {
        movePlayer();
        applyGravity();

        if (isInvincible) {
            handleInvincibility();
        } else {
            checkHazards();
        }
    }

    public void movePlayer() {
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - speed, getY());
            setImage("Character2_Left.png");
        } 
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + speed, getY());
            setImage("Character2_Right.png");
        } 
        if (Greenfoot.isKeyDown("w") && !isJumping) {
            setLocation(getX(), getY() - jumpHeight);
            isJumping = true;
        }
    }

    public void applyGravity() {
        if (isJumping) {
            setLocation(getX(), getY() + gravity);
            if (isOnGround()) {
                isJumping = false;
            }
        }
    }

    public boolean isOnGround() {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        return ground != null;
    }

    public void checkHazards() {
        if (isTouching(Lava.class) || isTouching(Mentor.class)) {
            Livebars world = (Livebars) getWorld();
            world.loseLife();

            if (world.getLivesBar().getLives() == 0) {
                Greenfoot.stop(); // Game Over
            } else {
                setLocation(200, 100); // Respawn
                isInvincible = true;
                invincibilityCounter = invincibilityTime;
            }
        }
    }

    public void handleInvincibility() {
        invincibilityCounter--;

        if (invincibilityCounter % 10 < 5) {
            getImage().setTransparency(100); // Flashing effect
        } else {
            getImage().setTransparency(255); // Normal
        }

        if (invincibilityCounter <= 0) {
            isInvincible = false;
            getImage().setTransparency(255);
        }
    }
}