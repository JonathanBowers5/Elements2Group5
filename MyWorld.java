import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World {
    
    public MyWorld() {    
        // Create a new world with 600x400 pixels.
        super(600, 400, 1); 
        
        // Set background
        GreenfootImage bg = new GreenfootImage("space_background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
         addObject(new Playbutton(),300,330);
        //addObject(new Highscores(),300,330);
    }
            
        public static void main(String[] args) {
        new MyWorld();
    }
}



