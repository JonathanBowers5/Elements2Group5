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
    private double dx = 0; 
    private double dy = 0; 
    private double acceleration = 0.2; 
    private double drag = 0.99; 

    /**
     * Act - do whatever the rocketship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        rocketMovement();
        basicPhysics();
    }
      public rocketship() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 6, image.getHeight() / 6);
        image.rotate(90);
        setImage(image);
    }
     private void rocketMovement() {
        if (Greenfoot.isKeyDown("w")) {
            double angle = Math.toRadians(getRotation()); 
            dx += Math.cos(angle) * acceleration; 
            dy += Math.sin(angle) * acceleration; 
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
  private void basicPhysics() {
        dx *= drag; 
        dy *= drag;
        setLocation(getX() + (int) dx, getY() + (int) dy);
 }
}

