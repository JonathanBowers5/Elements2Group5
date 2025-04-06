import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsTutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsTutorial extends Actor
{
    /**
     * Act - do whatever the InstructionsTutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    GreenfootImage image = new GreenfootImage("InstructionsOne.png");
    image.scale(300, 50); // or whatever size you want
    setImage(image);
    }
}
