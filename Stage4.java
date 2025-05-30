import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage4 extends World
{
    private static String selectedCharacter = "Character1"; 

    public static void setSelectedCharacter(String characterName) {
        selectedCharacter = characterName;
    }

    public static String getSelectedCharacter() {
        return selectedCharacter;
    }
    
    private int spawnTimer = 0;
    
    /**
     * Constructor for objects of class Stage2.
     * 
     */
    public Stage4(Actor player)
    {    
    // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    
    super(600, 400, 1); 
        
    GreenfootImage bg = new GreenfootImage("Green.png");
    bg.scale(getWidth(), getHeight());
    setBackground(bg);


    Platform platform1 = new Platform();
    addObject(platform1, 600, 300);
    
    Platform platform2 = new Platform();
    addObject(platform2, 120, 350);
    
    //Platform platform3 = new Platform();
    //addObject(platform3, 630, 155);
    
    Platform platform4 = new Platform();
    addObject(platform4, 100, 215);
    
    Platform platform5 = new Platform();
    addObject(platform5, 540, 90);
    
    
    addObject(new Portal4(), 540, 45);
    addObject(new SpaceshipPart2(), 200, 190);
    addObject(new Ice(), 300, 600);
    
    
    System.out.println(selectedCharacter);
    if (Global.getCurrentCharacter().equals("Character1")) {
            player = new Character1();
    } else {
            player = new Character2();
    }
    addObject(player, 300, 300);
    addObject(new Meteor2(2), 200, 0);
    addObject(new Meteor2(3), 400, -100);
    addObject(new Meteor2(1), 100, -200);
    }
    
    public void act() {
        spawnTimer++;

        if (spawnTimer >= 120) { 
            int x;
            do {
                x = Greenfoot.getRandomNumber(getWidth());
            } while (x >= 0 && x <= 120); 

            int speed = Greenfoot.getRandomNumber(2) + 1;
            addObject(new Meteor2(speed), x, 0);

            spawnTimer = 0;
        }
    }
}