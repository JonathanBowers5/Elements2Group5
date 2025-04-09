import greenfoot.*;

public class Character1Icon extends Actor {
    public Character1Icon() {
        setImage("character1.png"); // Add this image to your /images folder
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Stage1.setSelectedCharacter("Character1");
            Greenfoot.setWorld(new Stage1());
        }
    }
}
