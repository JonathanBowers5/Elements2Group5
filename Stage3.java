import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Stage3 extends World
{
    public Stage3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

   
        GreenfootImage bg = new GreenfootImage("Stage3Background.png");
        setBackground(bg);

        addObject(new Platform(), 100, 350);
        addObject(new Platform(), 300, 300);
        addObject(new Platform(), 500, 250);
        addObject(new Platform(), 200, 150);
        addObject(new Platform(), 400, 100);

        addObject(new arrow(), 90, 320);
        addObject(new arrow(), 290, 270);


        addObject(new Exit(), 550, 50);

        addObject(new InstructionsTutorial(), 300, 370);
    }
}
