import greenfoot.*;

public class Meteor3 extends Actor {
    private int speed;

    public Meteor3(int speed) {
        this.speed = speed;

        GreenfootImage image = new GreenfootImage("Meteor3.png"); 
        image.scale(80, 80);
        setImage(image);
    }

    public void act() {
        setLocation(getX(), getY() + speed);

        
        if (getY() >= getWorld().getHeight() - getImage().getHeight() / 2) {
            getWorld().removeObject(this);
            return;
        }

        
        Actor player = getOneIntersectingObject(Character1.class);
        if (player != null) {
            Greenfoot.setWorld(new GameOver()); 
        }
    }
}
