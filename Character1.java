import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character1 extends Actor {
    int speed = 5;
    int jumpHeight = 10;
    int gravity = 2=
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
/**
 * Write a description of class Character1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character1 extends Actor
{
    /**
     * Act - do whatever the Character1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 10;      
    int jumpHeight = 8;   
    int health = 12;     

    public void act()
    {
        

    }
}
