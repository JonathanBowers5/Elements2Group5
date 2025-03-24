import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow extends Actor
{
    private int pulseTimer = 0;
    private GreenfootImage baseArrow;
    private double scale = 1.0;
    private boolean growing = true;

    /**
     * Act - do whatever the arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        baseArrow = new GreenfootImage("arrow.png");
        setImage(baseArrow);
        pulse();
    }
    
    private void pulse() {
        if (growing) {
            scale += 0.02;
            if (scale >= 1.2) growing = false;
        } else {
            scale -= 0.02;
            if (scale <= 0.8) growing = true;
        }

        int newWidth = (int)(baseArrow.getWidth() * scale);
        int newHeight = (int)(baseArrow.getHeight() * scale);

        GreenfootImage scaled = new GreenfootImage(baseArrow);
        scaled.scale(newWidth, newHeight);
        setImage(scaled);
    }
}    
