package GUI.UI;

import Game.Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceControls implements ActionListener {
    Game game;

    public ChoiceControls(Game gaming){
        this.game = gaming;
    }

    /**
     * This is the mouse inputs where a switch case is choosen after you click a button for the choice.
     * It sends the user to the next screen of the game
     * @param event the event to be processed
     */

    public void actionPerformed(ActionEvent event){

        String playerChoice = event.getActionCommand();

        switch (playerChoice) {
            /*
            case "start" -> {
                game.visibilityManager.titleScreenToChoiceScreen();
                game.storyline.tavern();
            }

             */

            case "start" -> {
                game.visibilityManager.chooseAdventure();
            }
            case "choice1" -> game.storyline.selectPosition(game.nextPosition1);
            case "choice2" -> game.storyline.selectPosition(game.nextPosition2);
            case "choice3" -> game.storyline.selectPosition(game.nextPosition3);
            case "choice4" -> game.storyline.selectPosition(game.nextPosition4);

            case "adventure1" -> {
                game.visibilityManager.chooseAdvToChoiceScreen();
                game.storyline.tavern();
                //case "adventure2" -> game.pirateStoryline.beach();
            }
        }

    }



}


