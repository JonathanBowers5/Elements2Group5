import greenfoot.*;

public class Portal2 extends Actor {
    public void act() {
        if (getOneIntersectingObject(Character1.class) != null) {
            Global.setCurrentCharacter("Character1");
            Greenfoot.setWorld(new Stage3());
        }
        else if (getOneIntersectingObject(Character2.class) != null) {
            Global.setCurrentCharacter("Character2");
            Greenfoot.setWorld(new Stage3());
        }
    }
}
