import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main menu world for Gravity Guys.
 */
public class MyWorld extends World {
    private GreenfootSound music;
    private GreenfootSound walkSound;
    private GreenfootSound jumpSound;
    private GreenfootSound gameOverSound;

    public MyWorld() {    
        // Create a new world with 600x400 pixels.
        super(600, 400, 1); 
        
        // Set background
        GreenfootImage bg = new GreenfootImage("space_background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        // Background music
        music = new GreenfootSound("Backround Music.mp3");
        music.setVolume(20);  
        music.playLoop();  
        
        // Load sound effects
        walkSound = new GreenfootSound("Walking Sounds.mp3");
        jumpSound = new GreenfootSound("jump sound.mp3");
        gameOverSound = new GreenfootSound("game over.mp3");
    }

    public void playWalkSound() {
        if (!walkSound.isPlaying()) {
            walkSound.play();
        }
    }

    public void stopWalkSound() {
        walkSound.stop();
    }

    public void playJumpSound() {
        jumpSound.play();
    }

    public void playGameOverSound() {
        gameOverSound.play();
        Greenfoot.stop(); // Stop the game after playing the sound
    }
}
