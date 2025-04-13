import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Platform extends Actor
{
    public Platform() 
    {
        GreenfootImage image = new GreenfootImage(100, 10);
        image.setColor(Color.GRAY);
        image.fill();
        setImage(image);
    }
}
