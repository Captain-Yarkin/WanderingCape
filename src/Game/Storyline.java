package Game;

import Equipment.Weapons.WeaponDagger;
import GUI.UI.VisibilityManager;
import GUI.UIscreen;
import Music.Sound;
import Player.Player;

/**
 * This is the Storyline where the games takes it place in
 */
public class Storyline {
    Game game;
    UIscreen uIscreen;
    VisibilityManager visibilityManager;
    Player player = new Player();

    Sound sound = new Sound();

    public Storyline(Game gaming, UIscreen ui, VisibilityManager vm){
        this.game = gaming;
        this.uIscreen = ui;
        this.visibilityManager = vm;
    }

    /**
     * This is what the players starts with in the game.
     */
    public void defaultStatus(){
        //PLAYER HEALTH
        player.health = 10;
        uIscreen.healthNumberLabel.setText("" + player.health);

        //PLAYER EQUIPPED WEAPON
        player.equippedWeapon = new WeaponDagger();
        uIscreen.weaponNameLabel.setText(player.equippedWeapon.name);
    }

    /**
     * This is for tracking where the player is and that when the case is trigger we can go back.
     * @param nextPosition
     */
    public void selectPosition(String nextPosition){
        switch (nextPosition) {
            case "talkToBartender" -> talkToBartender();
            case "wakePeasant" -> wakePeasant();
            case "goOutside" -> goOutside();
            case "backToSleep" -> backToSleep();
            case "talkToBartender2" -> talkToBartender2();
            case "talkToBartender3" -> talkToBartender3();
        }
    }

    void mold(){
        uIscreen.mainTextArea.setText("");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void tavern(){
        uIscreen.mainTextArea.setText("You awaken next to a peasant after a heavy night drinking in the tavern not remembering anything from last night. A bartender is cleaning some cups behinde the bar. \nWhat do you do?");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Talk to the bartender");
        uIscreen.choice2.setText("Wake the peasant");
        uIscreen.choice3.setText("Go outside");
        uIscreen.choice4.setText("Go back to sleep");

        game.nextPosition1 = "talkToBartender";
        game.nextPosition2 = "wakePeasant";
        game.nextPosition3 = "goOutside";
        game.nextPosition4 = "backToSleep";
    }

    public void talkToBartender(){
        uIscreen.mainTextArea.setText("You approch the bartender. The man waves at you greeting your after your slumber. \nHuman Bartender: Hello friend long night? \nWhat do you ask the bartender?");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Ask about Rumours");
        uIscreen.choice2.setText("Last night?");
        uIscreen.choice3.setText("Who is that peasant?");
        uIscreen.choice4.setText("Go outside");

        game.nextPosition1 = "talkToBartender3";
        game.nextPosition2 = "talkToBartender2";
        game.nextPosition3 = "talkToBartender2";
        game.nextPosition4 = "goOutside";

    }
    public void talkToBartender2(){
        uIscreen.mainTextArea.setText("Human Bartender: *Laughs* man you dont remember anything. \nDisregards you question.");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Ask about Rumours");
        uIscreen.choice2.setText("Last night?");
        uIscreen.choice3.setText("Who is that peasant?");
        uIscreen.choice4.setText("Go outside");

        game.nextPosition1 = "talkToBartender3";
        game.nextPosition2 = "talkToBartender2";
        game.nextPosition3 = "talkToBartender2";
        game.nextPosition4 = "goOutside";

    }
    public void talkToBartender3(){

    }
    public void wakePeasant(){

    }
    public void goOutside(){

    }
    public void backToSleep(){

    }



}
