import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
     GreenfootImage image = new GreenfootImage("lift-closed.png");
     setImage(image);
     
     if (isTouching(arrow.class)) {
            Greenfoot.setWorld(new Stage2());
        }
    }
}
