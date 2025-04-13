import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Stage2 extends World
{
    public Stage2()
    {    
        super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("3.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        addObject(new Character1(), 300, 300); // Character is placed here

        // Add platforms at specific positions
        addObject(new Platform(), 120, 350);  // Platform 1
        addObject(new Platform(), 600, 300);  // Platform 2
        addObject(new Platform(), 100, 215);  // Platform 3
        addObject(new Platform(), 630, 155);  // Platform 4
        addObject(new Platform(), 50, 90);    // Platform 5
        
        // Portal object to move to another world (if needed)
        addObject(new Portal2(), 45, 45); 
    }
}