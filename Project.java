import greenfoot.*;

/**
 * Write a description of class project here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Project extends Actor { 

    // instance variables - replace the example below with your own
    private static final int FALLING = 0;
    private static final int RISING = 1;   
    private int state;
    private int velocityY;
    /**
     * Constructor for objects of class project
     */
    public  Project()
    {
        state = FALLING;
        velocityY = 0;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void act() {
    {
        // put your code here
        if (Greenfoot.isKeyDown("up")) {
            switchGravity(RISING);
        } else if (Greenfoot.isKeyDown("down")) {
            switchGravity(FALLING);
        }
        
        updatePosition();
        }
    }
    private void switchGravity(int newState) {
        state = newState;
    }
    private void updatePosition() {
        if (state == FALLING) {
            velocityY += 1;
        } else if ( state == RISING) {
            velocityY -= 1;
        }
        
        setLocation(getX(), getY() + velocityY);
        
        if (getY() < 0) {
            setLocation(getX(), 0);
            velocityY = 0;
        } else if (getY() > getWorld() .getHeight()) {
            setLocation(getX(), getWorld() . getHeight());
            velocityY = 0;
        }
    }
}
