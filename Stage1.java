import greenfoot.*;

public class Stage1 extends World {

    private static String selectedCharacter = "Character1"; 

    public static void setSelectedCharacter(String characterName) {
        selectedCharacter = characterName;
    }

    public static String getSelectedCharacter() {
        return selectedCharacter;
    }

    public Stage1() {    
        super(600, 400, 1);

        GreenfootImage bg = new GreenfootImage("Placeholder1.png"); 
        setBackground(bg);

        // Add floor and platforms
        Platform floor = new Platform();
        addObject(floor, 300, 350);
        addObject(new Platform(), 500, 390);
        addObject(new Platform(), 200, 390);
        addObject(new Platform(), 500, 210);
        addObject(new Platform(), 200, 120);

        // Add selected character
        Actor player;
        if (selectedCharacter.equals("Character2")) {
            player = new Character2();
        } else {
            player = new Character1();
        }
        addObject(player, 300, 300);
        
        //addObject(new SpaceshipPart(), 250, 120);

        // Other objects
        addObject(new arrow(), 100, 220);
        addObject(new Portal(), 50, 75);
        addObject(new InstructionsTutorial(), 150, 315);
    }
}
