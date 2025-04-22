import greenfoot.*;

public class SpaceshipPart extends Actor {
    public SpaceshipPart() {
        GreenfootImage image = new GreenfootImage("spaceship_part.png");
        image.scale(40, 40); 
        setImage(image);
    }

    public void act() {
        Actor character = getOneIntersectingObject(Character1.class);
        if (character == null) {
            //character = getOneIntersectingObject(Character2.class);
        }

        if (character != null) {
            //getWorld().removeObject(this);

        
        }
    }
 }
//