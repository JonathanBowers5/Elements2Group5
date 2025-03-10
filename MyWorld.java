import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main menu world for Gravity Guys.
 */
public class MyWorld extends World {
    
    public MyWorld() {    
        // Create a new world with 600x400 pixels.
        super(600, 400, 1); 
        
        // Set background1
        GreenfootImage bg = new GreenfootImage("space_background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
       
    }
}
