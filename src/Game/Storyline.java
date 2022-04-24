package Game;

import Creature.CreatureMold;
import Creature.Monsters.MonsterBush;
import Creature.NPC.NPCPeasant;

import Equipment.Weapons.WeaponDagger;
import Equipment.Weapons.WeaponLongsword;

import GUI.UI.VisibilityManager;
import GUI.UIscreen;

import Player.Player;

/**
 * This is the Storyline where the games takes it place in
 */
public class Storyline {
    Game game;
    UIscreen uIscreen;
    VisibilityManager visibilityManager;
    Player player = new Player();
    CreatureMold creatue;

    //KILL LIST
    int bush;
    int troll;
    int bandit;
    int peasant;


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

        //KILL LIST
        bush = 0;
        troll = 0;
        bandit = 0;
        peasant = 0;



    }

    /**
     * This is for tracking where the player is and that when the case is trigger we can go back.
     * @param nextPosition
     */
    public void selectPosition(String nextPosition){
        switch (nextPosition) {
            case "tavern" -> tavern();
            case "talkToBartender" -> talkToBartender();
            case "wakePeasant" -> wakePeasant();
            case "goOutside" -> goOutside();
            case "backToSleep" -> backToSleep();
            case "talkToBartender2" -> talkToBartender2();
            case "talkToBartender3" -> talkToBartender3();
            case "north1Forest" -> north1Forest();
            case "east1Round" -> east1Road();
            case "west1Smith" -> west1Smith();
            case "south1Swamp" -> south1Swamp();
            case "north2Sword" -> north2Sword();
            case "bushEncounter" -> bushEncounter();
            case "gameover2" -> gameover2();
            case "swordEquipped" -> swordEquipped();
            case "north2NoSword" -> north2NoSword();
            case "bushBattle" -> battle();
            case "gameoverDeath" -> gameoverDeath();
            case "bushSlained" -> bushSlained();
            case "playerAttack" -> playerAttack();
            case "monsterAttack" -> monsterAttack();
            case "battle" -> battle();
            case "newGame" -> newGame();
            case "monsterSlained" -> monsterSlain();


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
        uIscreen.mainTextArea.setText("Human Bartender: *Laughs* man you dont remember anything. \nDisregards your question.");
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
        uIscreen.mainTextArea.setText("Human Bartender: Rumours you ask? Aye I got some for you.\nTo the east of the village a bandit has stolen a might potion.\nTo the north there are rumours of a sword.\nTo the west there is a smith that can forge you some new armor\nTo the south there is a dangerous Troll killing our villagers");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Thank you! I will go");
        uIscreen.choice2.setText("Last night?");
        uIscreen.choice3.setText("Who is that peasant?");
        uIscreen.choice4.setText("Go outside");

        game.nextPosition1 = "goOutside";
        game.nextPosition2 = "talkToBartender2";
        game.nextPosition3 = "talkToBartender2";
        game.nextPosition4 = "goOutside";

    }
    public void wakePeasant(){
        creatue = new NPCPeasant();
        uIscreen.playSound(1);
        peasant++;


        uIscreen.mainTextArea.setText("As you reach to wake up the peasant. He jolts up raising his fists attacking you. \n\nYou encounter: " + creatue.name);
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Battle");
        uIscreen.choice2.setText("*To drunk to Flee*");
        uIscreen.choice3.setText("*To drunk to Flee*");
        uIscreen.choice4.setText("*To drunk to Flee*");

        game.nextPosition1 = "battle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void goOutside(){
        uIscreen.mainTextArea.setText("You feel the fresh air hit your face. Adventure awaits \nWhere will you travel");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("north");
        uIscreen.choice2.setText("east");
        uIscreen.choice3.setText("west");
        uIscreen.choice4.setText("south");

        game.nextPosition1 = "north1Forest";
        game.nextPosition2 = "east1Road";
        game.nextPosition3 = "west1Smith";
        game.nextPosition4 = "south1Swamp";
    }
    public void backToSleep(){
        uIscreen.mainTextArea.setText("As you fall a sleep for the final time. It seems like you dont wake up");
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

    public void north1Forest(){
        uIscreen.mainTextArea.setText("As you walk north you reach a forest. The road is long.\n Your hear sound from a bush near you \nWhat will you do?");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Follow the road");
        uIscreen.choice2.setText("Search the bush");
        uIscreen.choice3.setText("Go off the road");
        uIscreen.choice4.setText("Go back");

        game.nextPosition1 = "north2Sword";
        game.nextPosition2 = "bushEncounter";
        game.nextPosition3 = "gameover2";
        game.nextPosition4 = "goOutside";
    }
    public void north2Sword(){
        uIscreen.mainTextArea.setText("As you walk, following the road. You spot a sword stuck in a rock. \n What do you do?");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Pull out the sword");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go back");

        game.nextPosition1 = "swordEquipped";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "north1Forest";
    }
    public void swordEquipped(){
        uIscreen.mainTextArea.setText("As you grab the hilt of the sword. With all your might you pull it out. \n Your aquire a longsword");

        player.equippedWeapon = new WeaponLongsword();
        uIscreen.weaponNameLabel.setText(player.equippedWeapon.name);

        uIscreen.choice1.setText("");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go back");

        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "north2NoSword";
    }

    public void north2NoSword(){
        uIscreen.mainTextArea.setText("As you stand back. You look at the rock you pulled the sword from.\nWhat do you do?");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go back");

        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "north1Forest";

    }
    public void bushEncounter(){
        creatue = new MonsterBush();

        uIscreen.mainTextArea.setText("As you reach for the bush. It becomes starts to move\nYou encouter " + creatue.name);
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Battle");
        uIscreen.choice2.setText("Flee");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "bushBattle";
        game.nextPosition2 = "north1Forest";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void battle(){
        uIscreen.mainTextArea.setText(creatue.name + " has <" + creatue.health + "> health points\n\nWhat do you do!");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Attack with Weapons");
        if (peasant == 1){
            uIscreen.choice2.setText("");
        } else {
            uIscreen.choice2.setText("Flee");
        }
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "north1Forest";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void playerAttack(){
        int playerDamage = new java.util.Random().nextInt(player.equippedWeapon.damage)+1;

        uIscreen.mainTextArea.setText("You attacked the " + creatue.name + " and do " + playerDamage + " damage!");
        creatue.health = creatue.health - playerDamage;

        uIscreen.choice1.setText("Continue");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        if(creatue.health>0){
            game.nextPosition1 = "monsterAttack";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if (creatue.health<1){
            game.nextPosition1 = "monsterSlained";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        if (creatue.name.equals("Bush") && creatue.health<1){
            bush++;
        }
        if (creatue.name.equals("Bandit") && creatue.health<1){
            bandit++;
        }
        if (creatue.name.equals("Greg") && creatue.health<1){
            peasant++;
        }
    }

    public void monsterAttack(){
        int monsterDamage = new java.util.Random().nextInt(creatue.damage + 1);

        player.health = player.health - monsterDamage;
        uIscreen.healthNumberLabel.setText("" + player.health);
        uIscreen.mainTextArea.setText(creatue.name + " attacks you dealing "+ monsterDamage);

        uIscreen.choice1.setText("Continue");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        if(player.health>0){
            game.nextPosition1 = "battle";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if (player.health<1){
            game.nextPosition1 = "gameoverDeath";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }


    }
    public void monsterSlain(){
        if(bush == 1){
            bushSlained();
        }
        if(bandit == 1){
            banditSlain();
        }
        if(troll == 1){
            trollSlain();
        }
        if(peasant == 2){
            peasantSlain();
        }

    }
    public void bushSlained(){
        uIscreen.mainTextArea.setText("You defeated the "+ creatue.name + " the monster was a simple bush" + "\nWhat do you do?");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Punch the bush");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go back");

        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "north1Forest";

    }
    public void banditSlain(){

    }
    public void trollSlain(){

    }
    public void peasantSlain(){
        uIscreen.mainTextArea.setText("He Dead bro");
    }

    public void gameoverDeath(){
        uIscreen.mainTextArea.setText("You are dead\n\nGAME OVER");
        // Dont the characters longer the 21 characters or they go outside the box.
        uIscreen.choice1.setText("Play Again");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "newGame";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void gameover2(){

    }


    public void east1Road(){
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
    public void west1Smith(){
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
    public void south1Swamp(){
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

    public void newGame(){
        uIscreen.playTheme(0);
        defaultStatus();
        visibilityManager.showTitleScreen();
    }



}
