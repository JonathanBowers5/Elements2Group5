import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Stage3 extends World
{
    public Stage3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

   
        GreenfootImage bg = new GreenfootImage("Stage3Background.png");
        setBackground(bg);

        addObject(new Platform (Thread.builder  (
        addObject(new Platform(), 200, 400);
        addObject(new Platform(), 600, 350);
        addObject(new Platform(), 300, 250);
        addObject(new Platform(), 500, 200);

        addObject(new arrow(), 100, 420);
        addObject(new arrow(), 390, 370);
        addObject(new Exit(), 550, 50);
        
        addObject(new Character1(), 100, 300);
        showText("Stage 3: The space act", getWidth() / 2, 30);
    }

        addObject(new InstructionsTutorial(), 400, 470);
    }
}
