import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends World
{

    /**
     * Constructor for objects of class Stage2.
     * 
     */
    public Stage2()
    {    
    // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    super(600, 400, 1); 
        
    GreenfootImage bg = new GreenfootImage("Stage 2 Back.png");
    bg.scale(getWidth(), getHeight());
    setBackground(bg);
    
    Platform platform1 = new Platform();
    addObject(platform1, 100, 350);
    
    Platform platform2 = new Platform();
    addObject(platform2, 300, 300);
    
    Platform platform3 = new Platform();
    addObject(platform3, 500, 250);
    }
}
