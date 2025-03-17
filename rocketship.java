import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocketship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocketship extends Actor
{
    private int speed = 3;
    /**
     * Act - do whatever the rocketship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        rocketMovement();
    }
      public rocketship() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 6, image.getHeight() / 6);
        image.rotate(90);
        setImage(image);
    }
     private void rocketMovement() {
        if (Greenfoot.isKeyDown("w")) {
            move(speed); //forward
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-speed); //backward
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-5); //left
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(5); // right
        }
 }
}

