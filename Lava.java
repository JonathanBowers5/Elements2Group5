import greenfoot.*;

public class Lava extends Actor {
    public Lava() {
        GreenfootImage image = new GreenfootImage("Lava.png"); 
        image.scale(700, 90);
        setImage(image);  
    }

    public void act() {
        Actor player = getOneIntersectingObject(Character1.class);
        if (player == null) {
            player = getOneIntersectingObject(Character2.class);
        }

        if (player != null) {
            Greenfoot.setWorld(new Stage3()); 
        }
    }
}
