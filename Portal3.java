import greenfoot.*;

public class Portal3 extends Actor {
    
    public void act() {
        Actor player1 = getOneIntersectingObject(Character1.class);
        Actor player2 = getOneIntersectingObject(Character2.class);

        if (player1 != null) {
            Greenfoot.setWorld(new Stage4(player1));
            
        }
        else if(player2 != null) {
            Greenfoot.setWorld(new Stage4(player2));
        }
    }
}
