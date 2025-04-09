import greenfoot.*;

public class CharacterSelect extends World {

    public CharacterSelect() {
        super(600, 400, 1);

        setBackground("CharacterSelection.png"); // Optional

        addObject(new Character1Icon(), 200, 200);
        addObject(new Character2Icon(), 400, 200);
    }
}
