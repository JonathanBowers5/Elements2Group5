import greenfoot.*;

public class Livebars extends World {
    private LivesBar livesBar;

    public Livebars() {
        super(600, 400, 1);
        
        Character1 player1 = new Character1();
        Character2 player2 = new Character2();

        addObject(player1, 100, 100);
        addObject(player2, 200, 100);

        livesBar = new LivesBar();
        addObject(livesBar, 0, 0);
    }

    public LivesBar getLivesBar() {
        return livesBar;
    }

    public void loseLife() {
        livesBar.loseLife();
    }
}