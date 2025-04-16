import greenfoot.*;

public class Meteor extends Actor {
    private int speed;

    public Meteor(int speed) {
        this.speed = speed;

        GreenfootImage image = new GreenfootImage("meteorites2.png"); // Ensure this exists in /images
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
            Greenfoot.setWorld(new Stage3()); 
        }
    }
}
