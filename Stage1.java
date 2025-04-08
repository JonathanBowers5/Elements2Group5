import greenfoot.*;

public class Stage1 extends World {

    public Stage1() {    
        super(600, 400, 1);

        GreenfootImage bg = new GreenfootImage("Placeholder.png");
        setBackground(bg);

        Platform floor = new Platform();
        addObject(floor, 300, 350);
        addObject(new Character1(), 300, 300); 
        addObject(new Character2(), 310, 300); 

        
        addObject(new Platform(), 500, 390);
        addObject(new Platform(), 200, 390);
        addObject(new Platform(), 500, 210);
        addObject(new Platform(), 200, 120);

        addObject(new arrow(), 100, 220);
        addObject(new Portal(), 50, 75);
        addObject(new InstructionsTutorial(), 150, 315);
    }
}
