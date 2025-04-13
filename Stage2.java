import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Stage2 extends World
{
    public Stage2()
    {    
        super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("3.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        addObject(new Character1(), 300, 300); 

        addObject(new Platform(), 120, 350);
        addObject(new Platform(), 600, 300);
        addObject(new Platform(), 100, 215);
        addObject(new Platform(), 630, 155);
        addObject(new Platform(), 50, 90);
        
        addObject(new Portal2(), 45, 45);
    }
}