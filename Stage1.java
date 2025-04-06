import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends World
{

    /**
     * Constructor for objects of class Stage1.
     * 
     */
    public Stage1()
    {    
    // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    super(600, 400, 1); 
    GreenfootImage Platform = new GreenfootImage(150, 20);
    GreenfootImage bg = new GreenfootImage("Placeholder.png");
    addObject(new Character1(), 300, 300); 
    addObject(new Platform(), 500, 390);
    addObject(new arrow(), 100, 220);
    addObject(new Platform(), 200, 390);
    addObject(new Platform(), 500, 210);
    addObject(new Platform(), 200, 120);
    addObject(new Exit(), 50, 75);
}
}
