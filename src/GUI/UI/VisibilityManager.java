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
        //everything is showing at the start. This one shows only the start screen
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);
        //This hides everything while the tilescreen is shown
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
        ui.adventureNamePanel.setVisible(false);
        ui.chooseAdvPanel.setVisible(false);


    }
    /**
     * Hide TitleScreen show next screen
     */
    @Override
    public void chooseAdvToChoiceScreen() {

        ui.chooseAdvPanel.setVisible(false);
        ui.adventureNamePanel.setVisible(false);

        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }

    /**
     * Go to choose adventure screen
     */
    @Override
    public void chooseAdventure() {
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);

        ui.adventureNamePanel.setVisible(true);
        ui.chooseAdvPanel.setVisible(true);




    }

}
