import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character1 extends Actor {
    int speed = 5,10;
    int jumpHeight = 10;
    int gravity = 2=-10;
    int health = 100;
    boolean isJumping = false;

    public void act() {
        movePlayer();
        applyGravity();
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
}

}
