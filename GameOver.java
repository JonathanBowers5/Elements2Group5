import greenfoot.*;

public class GameOver extends World {
    public GameOver() {    
        super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("Game over.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }

    public void act() {
        if (Greenfoot.mouseClicked(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                int x = mouse.getX();
                int y = mouse.getY();

                
                if (x >= 150 && x <= 250 && y >= 250 && y <= 300) {
                    Greenfoot.setWorld(new MyWorld());
                }

                
                else if (x >= 350 && x <= 450 && y >= 250 && y <= 300) {
                    Greenfoot.stop();
                }
            }
        }
    }
}
