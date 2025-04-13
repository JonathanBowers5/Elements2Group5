import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character2 extends Actor
{
    private int speed = 5;
    private int jumpStrength = -10;
    private int gravity = 1;
    private int velocityY = 0;
    private boolean isJumping = false;

    public void act()
    {
        moveLeftRight();
        applyGravity();
        jump();
    }

    public void moveLeftRight()
    {
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - speed, getY());
            setImage("Boy_Spaceman.png");
        }
        if (Greenfoot.isKeyDown("d")) { 
            setLocation(getX() + speed, getY());
            setImage("Boy_Spaceman2.png");
        }
    }

    public void jump()
    {
        if (Greenfoot.isKeyDown("w") && !isJumping) { 
            velocityY = jumpStrength; 
            isJumping = true;
        }
    }

    public void applyGravity()
    {
        setLocation(getX(), getY() + velocityY);
        velocityY += gravity;

        if (isTouching(Platform.class) && velocityY > 0) {
            while (isTouching(Platform.class)) {
                setLocation(getX(), getY() - 1);
            }
            velocityY = 0;
            isJumping = false;
        }
    }
}