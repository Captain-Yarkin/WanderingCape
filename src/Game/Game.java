package Game;

import GUI.UI.ChoiceControls;
import GUI.UI.VisibilityManager;
import GUI.UIscreen;
//import GUI.UI.Controls;

public class Game {
    ChoiceControls choiceHandler = new ChoiceControls(this);
    UIscreen ui = new UIscreen();
    public VisibilityManager visibilityManager = new VisibilityManager(ui);

    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        ui.createScreen(choiceHandler);
        visibilityManager.showTitleScreen();
        //screen.playTheme(0);
    }

}

