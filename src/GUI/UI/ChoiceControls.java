package GUI.UI;

import GUI.UIscreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceControls implements ActionListener {
    UIscreen ui = new UIscreen();
    VisibilityManager vm = new VisibilityManager(ui);
    /**
     * This is the mouse inputs where a switch case is choosen after you click a button for the choice
     * @param event the event to be processed
     */

    public void actionPerformed(ActionEvent event){

        String playerChoice = event.getActionCommand();

        switch (playerChoice){
            case "start":vm.titleScreenToTown(); break;
            case "choice1":break;
            case "choice2":break;
            case "choice3":break;
            case "choice4":break;
        }

    }



}


