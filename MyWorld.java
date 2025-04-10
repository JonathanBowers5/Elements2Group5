import greenfoot.*;  

public class MyWorld extends World {
    private GreenfootSound music;

    public MyWorld() {    
        super(600, 400, 1); 
        
        
        GreenfootImage bg = new GreenfootImage("space_background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        addObject(new Playbutton(), 300, 330);
        
        music = new GreenfootSound("Backround Music.mp3");
        music.setVolume(20);  
        music.playLoop();  
    }
}
