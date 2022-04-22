package GUI.UI;

import GUI.UIscreen;

/**
 * This is for screen transitioning after every choice.
 */

public class VisibilityManager implements IVisibilityManager {

    UIscreen ui;
    public VisibilityManager(UIscreen userInterface){
        this.ui = userInterface;
    }

    /**
     * Shows TitleScreen
     */
    @Override
    public void showTitleScreen() {
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);

    }
    /**
     * Hide TitleScreen show next screen
     */
    @Override
    public void titleScreenToTown() {
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }

}
