
//The Game.java is in a Game Package because there were issues with launch option. This seems to have fixed the problem.
package Game;


import GUI.UI.ChoiceControls;
import GUI.UI.VisibilityManager;
import GUI.UIscreen;

/**
 * this is where the Game is run. Works as a main function.
 */
public class Game {
    ChoiceControls choiceHandler = new ChoiceControls(this);
    UIscreen uIscreen = new UIscreen();

    public VisibilityManager visibilityManager = new VisibilityManager(uIscreen);
    public Storyline storyline = new Storyline(this, uIscreen, visibilityManager);
    public String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    /**
     * main function
     * @param args
     */
    public static void main(String[] args) {
        new Game();
    }

    /**
     * calls upon the UI.
     * call upon the newGame
     * playes the first song in from the uIscreen -> sound -> resources
     */
    public Game() {
        uIscreen.createScreen(choiceHandler);
        //storyline.defaultStatus();
        storyline.newGame();
        //visibilityManager.showTitleScreen();
        uIscreen.playTheme(0);
    }
}

