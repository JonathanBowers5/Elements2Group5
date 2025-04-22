import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage4 extends World
{
    private static String selectedCharacter = "Character1"; // Default choice

    public static void setSelectedCharacter(String characterName) {
        selectedCharacter = characterName;
    }

    public static String getSelectedCharacter() {
        return selectedCharacter;
    }
    
    
    /**
     * Constructor for objects of class Stage2.
     * 
     */
    public Stage4(Actor player)
    {    
    // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    
    super(600, 400, 1); 
        
    GreenfootImage bg = new GreenfootImage("Neptune.jpg");
    bg.scale(getWidth(), getHeight());
    setBackground(bg);

    Platform platform1 = new Platform();
    addObject(platform1, 120, 350);

        
    System.out.println(selectedCharacter);
    if (Global.getCurrentCharacter().equals("Character1")) {
            player = new Character1();
    } else {
            player = new Character2();
    }
    addObject(player, 300, 300);
    

    }
}