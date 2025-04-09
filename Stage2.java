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
        
    GreenfootImage bg = new GreenfootImage("Placeholder.png");
    bg.scale(getWidth(), getHeight());
    setBackground(bg);
    
    addObject(new Character1(), 300, 300); 

    
    Platform platform1 = new Platform();
    addObject(platform1, 120, 350);
    
    Platform platform2 = new Platform();
    addObject(platform2, 600, 300);
    
    Platform platform3 = new Platform();
    addObject(platform3, 100, 215);
    
    Platform platform4 = new Platform();
    addObject(platform4, 630, 155);
    
    Platform platform5 = new Platform();
    addObject(platform5, 50, 90);
    
    
    addObject(new Portal2(), 45, 45);
    

    }
}