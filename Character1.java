import greenfoot.*;

public class Character1 extends Actor {
    private int velocityY = 0;
    private int gravity = 1;
    private int jumpStrength = -15;

    private int jumpCount = 0;
    private final int maxJumps = 2;

    private boolean spacePressedLastFrame = false;

    public void act() {
        applyGravity();
        checkKeys();
    }

    public void checkKeys() {
        if (Greenfoot.isKeyDown("A")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("D")) {
            move(5);
        }

        boolean spacePressedNow = Greenfoot.isKeyDown("W");
        if (spacePressedNow && !spacePressedLastFrame && jumpCount < maxJumps) {
            velocityY = jumpStrength;
            jumpCount++;
        }
        spacePressedLastFrame = spacePressedNow;
    }

    public void applyGravity() {
        velocityY += gravity;
        setLocation(getX(), getY() + velocityY);

        Actor platform = getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Platform.class);
        if (platform != null && velocityY >= 0) {
            int platformTop = platform.getY() - platform.getImage().getHeight() / 2;
            int characterHalfHeight = getImage().getHeight() / 2;
            setLocation(getX(), platformTop - characterHalfHeight);

            velocityY = 0;
            jumpCount = 0;
        }
    }



    public boolean isOnGround() {
        return getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Platform.class) != null;
    }
}
