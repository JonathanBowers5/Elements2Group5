import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playbutton extends Actor
{
    /**
     * Act - do whatever the Playbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            System.out.println("Pressed");
        }
    }
    
        public Playbutton() {
        GreenfootImage image = getImage(); // Get the current image
        image.scale(200, 200); // Change width and height
        setImage(image); // Apply the resized image
    }
}
