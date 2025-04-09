import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Stage3 extends World {

    private int spawnTimer = 0;

    public Stage3() {    
        super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("Placeholder.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        addObject(new Character1(), 300, 300); 
        
        addObject(new Platform(), 120, 350);
        addObject(new Platform(), 600, 300);
        addObject(new Platform(), 100, 215);
        addObject(new Platform(), 630, 155);
        addObject(new Platform(), 50, 90);
        
        addObject(new Portal(), 45, 45);
        
        addObject(new Meteor(2), 200, 0);
        addObject(new Meteor(3), 400, -100);
        addObject(new Meteor(1), 100, -200);
    }
    
    public void act() {
        spawnTimer++;

        if (spawnTimer >= 120) { // ~2 seconds at 60fps
            int x;
            do {
                x = Greenfoot.getRandomNumber(getWidth());
            } while (x >= 0 && x <= 120); // Avoid portal area (around x = 45–50)

            int speed = Greenfoot.getRandomNumber(2) + 1;
            addObject(new Meteor(speed), x, 0);

            spawnTimer = 0;
        }
    }
}
