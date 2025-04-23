import greenfoot.*;

public class SpaceshipPart1 extends Actor {
    public SpaceshipPart1() {
        GreenfootImage image = new GreenfootImage("Part2.png");
        image.scale(40, 40); 
        setImage(image);
    }

    public void act() {
        Actor character = getOneIntersectingObject(Character1.class);
        if (character == null) {
            character = getOneIntersectingObject(Character2.class);
        }

        if (character != null) {
            getWorld().removeObject(this);

        
        }
    }
 }
//