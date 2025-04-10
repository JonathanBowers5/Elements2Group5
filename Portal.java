import greenfoot.*;

public class Portal extends Actor {
    public void act() {
        Actor player1 = getOneIntersectingObject(Character1.class);
        Actor player2 = getOneIntersectingObject(Character2.class);

        if (player1 != null || player2 != null) {
            Greenfoot.setWorld(new Stage2());
        }
    }
}
