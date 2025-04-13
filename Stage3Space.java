import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Stage3 extends World
{
    public Stage3()
    {    
        
        super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("Stage 3 Back.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        
        Character1 character = new Character1(2);  
        addObject(character, 300, 300);

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
