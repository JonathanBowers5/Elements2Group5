import greenfoot.*;

public class Character2Icon extends Actor {
    public Character2Icon() {
        setImage("character2.png"); // Add this image to your /images folder
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Stage1.setSelectedCharacter("Character2");
            Greenfoot.setWorld(new Stage1());
        }
    }
}
