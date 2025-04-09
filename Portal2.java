import greenfoot.*;

public class Portal2 extends Actor {
    public void act() {
        Actor player = getOneIntersectingObject(Character1.class);
        if (player != null) {
            Greenfoot.setWorld(new Stage3());
        }
    }
}