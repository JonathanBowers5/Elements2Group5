import greenfoot.*;

public class CharacterSelect extends World {

    public CharacterSelect() {
        super(600, 400, 1);
        setBackground("CharacterSelection.png");
    }

    public void act() {
        if (Greenfoot.mouseClicked(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                int x = mouse.getX();
                int y = mouse.getY();

                // Adjust the ranges based on where the blue and pink characters are in your image
                if (x >= 150 && x <= 250 && y >= 150 && y <= 250) {
                    // Clicked on blue character
                    Stage1 stage = new Stage1();
                    stage.addObject(new Character1(), 300, 300); // Change position if needed
                    Greenfoot.setWorld(stage);
                } else if (x >= 350 && x <= 450 && y >= 150 && y <= 250) {
                    // Clicked on pink character
                    Stage1 stage = new Stage1();
                    stage.addObject(new Character2(), 300, 300); // Change position if needed
                    Greenfoot.setWorld(stage);
                }
            }
        }
    }
}
