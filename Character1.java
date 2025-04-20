import greenfoot.*;

public class Character1 extends Actor {
    int speed = 5;
    int jumpHeight = 10;
    int gravity = 2;
    boolean isJumping = false;

    public void act() {
        movePlayer();
        applyGravity();
        checkHazards();
    }

    public void movePlayer() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
            setImage("Character_Left.png"); 
        } 
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
            setImage("Character_Right.png"); 
        } 
        if (Greenfoot.isKeyDown("up") && !isJumping) {
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
                setLocation(100, 100); // Respawn
            }
        }
    }
}