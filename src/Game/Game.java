
//The Game.java is in a Game Package because there were issues with launch option. This seems to have fixed the problem.
package Game;


import Adventures.Adventure1.Adventure1Storyline;
import Adventures.Adventure2.Adventure2Storyline;
import GUI.UI.ChoiceControls;
import GUI.UI.VisibilityManager;
import GUI.UIscreen;
import Player.Player;

/**
 * this is where the Game is run. Works as a main function.
 */
public class Game {
    ChoiceControls choiceHandler = new ChoiceControls(this);
    UIscreen uIscreen = new UIscreen();

    Player player = new Player(uIscreen);

    public VisibilityManager visibilityManager = new VisibilityManager(uIscreen);

    public String nextPosition1, nextPosition2, nextPosition3, nextPosition4;


    public Adventure1Storyline adventure1Storyline = new Adventure1Storyline(this, uIscreen, visibilityManager, player);
    public Adventure2Storyline adventure2Storyline = new Adventure2Storyline(this, uIscreen,visibilityManager,player);


    /**
     * main function
     * @param args launches the game
     */
    public static void main(String[] args) {
        new Game();
    }

    /**
     * calls upon the UI.
     * call upon the newGame
     * plays the first song in from the uIscreen -> sound -> resources
     */
    public Game() {
        uIscreen.createScreen(choiceHandler);
        visibilityManager.showTitleScreen();

    }
}

