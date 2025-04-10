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

                // Click area for blue character (Character1)
                if (x >= 150 && x <= 250 && y >= 150 && y <= 250) {
                    Stage1.setSelectedCharacter("Character1");
                    Greenfoot.setWorld(new Stage1());
                }

                // Click area for pink character (Character2)
                else if (x >= 350 && x <= 450 && y >= 150 && y <= 250) {
                    Stage1.setSelectedCharacter("Character2");
                    Greenfoot.setWorld(new Stage1());
                }
            }
        }
    }
}
