import greenfoot.*;

public class Livebars extends World {
    private LivesBar livesBar;

    public Livebars() {
        super(600, 400, 1);

        
        Character1 player = new Character1();
        addObject(player, 100, 100);

        
        livesBar = new LivesBar();
        addObject(livesBar, 100, 30);
    }

    public LivesBar getLivesBar() {
        return livesBar;
    }

    public void loseLife() {
        livesBar.loseLife();
    }
}