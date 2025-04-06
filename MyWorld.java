import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World {
    private GreenfootSound music;
    public MyWorld() {    
        // Create a new world with 600x400 pixels.
        super(600, 400, 1); 
        
        // Set background
        GreenfootImage bg = new GreenfootImage("space_background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
         addObject(new Playbutton(),300,330);
        //addObject(new Highscores(),300,330);
        music = new GreenfootSound("Backround Music.mp3");
        music.setVolume(20);  
        music.playLoop();  
    }
            
        public static void main(String[] args) {
        new MyWorld();
    }
}            
