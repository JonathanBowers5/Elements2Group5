import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character1 extends Actor
{
    private int speed = 4;
    private int jumpStrength = -12;
    private int gravity;
    private int velocityY = 0;
    private boolean isJumping = false;

    
    public Character1(int gravity)
    {
        this.gravity = gravity;
    }

    public void act()
    {
        moveLeftRight();
        applyGravity();
        jump();
    }

    
    public void moveLeftRight()
    {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }
    }

    
    public void jump()
    {
        if (Greenfoot.isKeyDown("up") && !isJumping) {
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