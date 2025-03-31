import greenfoot.*;  

public class CharacterSelection extends World {
    private GreenfootImage char1 = new GreenfootImage("Boy_Spaceman.png");
    private GreenfootImage char2 = new GreenfootImage("Boy_Spaceman2.png"); 
    private int selection = 1; 

    public CharacterSelection() {    
        super(600, 400, 1);  
        showSelection();
    }

    public void act() {
        if (Greenfoot.isKeyDown("left")) {
            selection = 1;
            showSelection();
            Greenfoot.delay(10);
        } else if (Greenfoot.isKeyDown("right")) {
            selection = 2;
            showSelection();
            Greenfoot.delay(10);
        }

<<<<<<< HEAD
        if (Greenfoot.isKeyDown("enter")) {
            if (selection == 1) {
<<<<<<< HEAD
                Greenfoot.setWorld(new GameWorld("Boy_Spaceman.png"));
            } else {
                Greenfoot.setWorld(new GameWorld("Boy_Spaceman2.png"));
=======
                Greenfoot.setWorld(new GameWorld("char1.png"));
            } else {
                Greenfoot.setWorld(new GameWorld("char2.png"));
>>>>>>> bd16017f543145e853ad414e430904b61c984353
            } //when gage is down stage 1 level
=======
        /*if (Greenfoot.isKeyDown("enter")) {
            if (selection == 1) {
                Greenfoot.setWorld(new GameWorld("char1.png"));
            } else {
                Greenfoot.setWorld(new GameWorld("char2.png"));
            }
        }*/ //when gage is down stage 1 level
>>>>>>> bd16017f543145e853ad414e430904b61c984353
    }

    private void showSelection() {
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(Color.BLACK);
        bg.fill();
        setBackground(bg);

        if (selection == 1) {
            getBackground().drawImage(char1, 200, 150);
        } else {
            getBackground().drawImage(char2, 200, 150);
        }

        
    }
}
