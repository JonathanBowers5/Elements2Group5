import greenfoot.*;

public class Portal2 extends Actor {
    public void act() {
        Actor player = getOneIntersectingObject(Character1.class);
        Actor player2 = getOneIntersectingObject(Character2.class);
        if (player != null||(player2!=null)) {
            Greenfoot.setWorld(new Stage3());
        }
    }
}