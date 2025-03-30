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
    
    Platform platform4 = new Platform();
    addObject(platform4, 390, 150);
    
    Platform platform5 = new Platform();
    addObject(platform5, 250, 110);
    
    Platform platform6 = new Platform();
    addObject(platform6, 125, 90 );
    
    Platform platform7 = new Platform();
    addObject(platform7, 100, 90 );
    
    Platform platform8 = new Platform();
    addObject(platform8, 90, 90 );
    
    Portal portal1 = new Portal("World");
    addObject(portal1, 105, 50); 
    }
}
