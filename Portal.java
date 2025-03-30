import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

class Portal extends Actor {
    private String targetWorld;

    public Portal(String targetWorld) {
        this.targetWorld = targetWorld;
        setImage("lift-closed.png");
    }

    public void act() {
        checkCollision();
    }

    private void checkCollision() {
        Actor player = getOneIntersectingObject(Player.class);
        if (player != null) {
            switchWorld();
        }
    }

    private void switchWorld() {
        if (targetWorld.equals("Stage3")) {
            Greenfoot.setWorld(new Stage3()); 
        }
    }
}

