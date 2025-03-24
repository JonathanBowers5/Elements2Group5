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
    GreenfootImage image = getImage();
    image.scale(image.getWidth()*2/5, image.getHeight()*2/5);
    }
}
