import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

class Platform extends Actor {
    public Platform() {
        setImage("platform.png");
    }
}

class Player extends Actor {
    private int velocityY = 0;
    private final int GRAVITY = 1;
    private final int JUMP_STRENGTH = -15;

    public Player() {
        setImage("player.png");
    }

    public void act() {
        applyGravity();
        
    }

    private void checkKeys() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 5, getY());
        }
        if (Greenfoot.isKeyDown("up") && isOnGround()) {
            velocityY = JUMP_STRENGTH;
        }
    }

    private void applyGravity() {
        velocityY += GRAVITY;
        setLocation(getX(), getY() + velocityY);
        
        if (isOnGround()) {
            velocityY = 0;
        }
    }

    private boolean isOnGround() {
        return getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Platform.class) != null;
    }
}


