package Adventures.Adventure1;

import Creature.CreatureMold;
import Creature.Monsters.MonsterBandit;
import Creature.Monsters.MonsterBush;
import Creature.Monsters.MonsterTroll;
import Creature.NPC.NPCPeasant;

import Equipment.Armor.ArmorCloth;
import Equipment.Armor.ArmorIron;
import Equipment.Weapons.SecretWeapons.WeaponGun;
import Equipment.Weapons.WeaponDagger;
import Equipment.Weapons.WeaponLongsword;
import GUI.UI.VisibilityManager;
import GUI.UIscreen;

import Game.Game;
import Player.Player;

/**
 * This is the Storyline where the games follow the main story
 */
public class Adventure1Storyline {
    Game game;
    UIscreen uIscreen;
    VisibilityManager visibilityManager;
    Player player;
    CreatureMold creatureCommon, creatureBandit, creatureBattling;

    //KILL/INFO LIST
    private int mightPotion;


    public Adventure1Storyline(Game gaming, UIscreen ui, VisibilityManager vm, Player player){
        this.game = gaming;
        this.uIscreen = ui;
        this.visibilityManager = vm;
        this.player = player;
    }
    public void gameStart(){
        player.setDefaultStatus(10,new WeaponDagger(), new ArmorCloth());
        //INVENTORY
        // 0 means that the player doesn't have the might potion
        // 1 means that the potion is in the inventory
        // 2 means that the player drank the potion
        // 3 means that the player gave the potion to the dwarf
        mightPotion = 0;

        creatureBandit = new MonsterBandit();
    }

    /**
     * This is for tracking where the player is and that when the case is trigger we can go back.
     * @param nextPosition
     * The chosen string name points to the method that is supposed to go into effect
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
            case "east1Slums" -> east1Slums();
            case "west1Smith" -> west1Smith();
            case "south1Swamp" -> south1Swamp();
            case "north2Sword" -> north2Sword();
            case "bushEncounter" -> bushEncounter();
            case "swordEquipped" -> swordEquipped();
            case "north2NoSword" -> north2NoSword();
            case "gameoverDeath" -> gameoverDeath();
            case "bushSlain" -> bushSlain();
            case "playerAttack" -> playerAttack();
            case "monsterAttack" -> monsterAttack();
            case "battle" -> battle();
            case "newGame" -> newGame();
            case "monsterSlain" -> monsterSlain();
            case "banditEncounter" -> banditEncounter();
            case "gameoverEast" -> gameoverEast();
            case "mightPotion" -> mightPotion();
            case "west2Smith" -> west2Smith();
            case "west3Smith" -> west3Smith();
            case "west4Smith" -> west4Smith();
            case "west5Smith" -> west5Smith();
            case "west6Reward" -> west6Reward();
            case "trollEncounter" -> trollEncounter();
            case "gameoverNorth" -> gameoverNorth();
            case "win" -> win();


        }
    }

    public void tavern(){
        creatureCommon = new NPCPeasant();
        creatureBattling = creatureCommon;
        uIscreen.mainTextArea.setText("You awaken next to a peasant after a heavy night drinking in the tavern not remembering anything from last night. A bartender is cleaning some cups behind the bar. \nWhat do you do?");

        uIscreen.choice1.setText("Talk to the bartender");
        uIscreen.choice2.setText("Wake the peasant");
        uIscreen.choice3.setText("Go back to sleep");
        uIscreen.choice4.setText("Go outside");

        game.nextPosition1 = "talkToBartender";
        game.nextPosition2 = "wakePeasant";
        game.nextPosition3 = "backToSleep";
        game.nextPosition4 = "goOutside";
    }

    private void talkToBartender() {
        if (creatureCommon.specialStatus) {
            uIscreen.mainTextArea.setText("As you approach the bartender. He look horrified after you killed Greg, but act like nothing to not provoke you to kill him. \nHuman Bartender: Hello friend... long night...? \nWhat do you ask the bartender?");
        } else {
            uIscreen.mainTextArea.setText("You approach the bartender. The man waves at you greeting you after your slumber. \nHuman Bartender: Hello friend long night? \nWhat do you ask the bartender?");

        }
        // Don't the characters longer the 21 characters, or they go outside the box.
        talkingWithBartender();

    }

    private void talkToBartender2(){
        uIscreen.mainTextArea.setText("Human Bartender: *Laughs* man you dont remember anything. \nDisregards your question.");

        talkingWithBartender();

    }

    /**
     * Dialog between you and the bartender
     */
    private void talkingWithBartender() {
        uIscreen.choice1.setText("Ask about Rumours");
        uIscreen.choice2.setText("Last night?");
        if (creatureCommon.specialStatus) {
            uIscreen.choice3.setText("Who was that peasant?");
        } else {
            uIscreen.choice3.setText("Who is that peasant?");
        }
        uIscreen.choice4.setText("Go outside");

        game.nextPosition1 = "talkToBartender3";
        game.nextPosition2 = "talkToBartender2";
        game.nextPosition3 = "talkToBartender2";
        game.nextPosition4 = "goOutside";
    }

    private void talkToBartender3() {
        uIscreen.mainTextArea.setText("Human Bartender: Rumours you ask? Aye I got some for you.\nTo the east of the village a bandit has stolen a might potion.\nTo the north there are rumours of a sword.\nTo the west there is a smith that can forge you some new armor\nTo the south there is a dangerous Troll killing our villagers\nThe person who kills the troll will get a reward from the Elder");

        uIscreen.choice1.setText("Thank you! I will go");
        uIscreen.choice2.setText("Last night?");
        if (creatureCommon.specialStatus) {
        uIscreen.choice3.setText("Who was that peasant?");
        } else {
            uIscreen.choice3.setText("Who is that peasant?");
        }
        uIscreen.choice4.setText("Go outside");

        game.nextPosition1 = "goOutside";
        game.nextPosition2 = "talkToBartender2";
        game.nextPosition3 = "talkToBartender2";
        game.nextPosition4 = "goOutside";

    }
    private void wakePeasant(){


        uIscreen.mainTextArea.setText("As you reach to wake up the peasant. He jolts up raising his fists attacking you. \n\nYou encounter: " + creatureCommon.name);

        uIscreen.choice1.setText("Battle");
        uIscreen.choice2.setText("*To drunk to Flee*");
        uIscreen.choice3.setText("*To drunk to Flee*");
        uIscreen.choice4.setText("*To drunk to Flee*");

        game.nextPosition1 = "battle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    private void goOutside(){
        uIscreen.mainTextArea.setText("You feel the fresh air hit your face. Adventure awaits \nWhere will you travel");

        uIscreen.choice1.setText("north");
        uIscreen.choice2.setText("east");
        uIscreen.choice3.setText("west");
        uIscreen.choice4.setText("south");

        game.nextPosition1 = "north1Forest";
        game.nextPosition2 = "east1Slums";
        game.nextPosition3 = "west1Smith";
        game.nextPosition4 = "south1Swamp";
    }
    private void backToSleep(){
        uIscreen.stopSound();
        uIscreen.mainTextArea.setText("As you fall a sleep for the final time. It seems like you dont wake up.\n<GAME OVER>");
        displayPlayAgain();
    }

    private void north1Forest(){
        uIscreen.mainTextArea.setText("As you walk north you reach a forest. The road is long.\nYour hear sound from a bush near you \nWhat will you do?");

        uIscreen.choice1.setText("Follow the road");
        uIscreen.choice2.setText("Search the bush");
        uIscreen.choice3.setText("Go off the road");
        uIscreen.choice4.setText("Go back");

        game.nextPosition1 = "north2Sword";
        game.nextPosition2 = "bushEncounter";
        game.nextPosition3 = "gameoverNorth";
        game.nextPosition4 = "goOutside";
    }
    private void north2Sword() {
        if (player.getEquippedWeapon().name.equals("Longsword")) {
            uIscreen.mainTextArea.setText("As you walk, following the road. You spot a hole in the rock where you pulled out the sword. \nWhat do you do?");
        } else {
            uIscreen.mainTextArea.setText("As you walk, following the road. You spot a sword stuck in a rock. \nWhat do you do?");
        }

        if (player.getEquippedWeapon().name.equals("Longsword")) {
            uIscreen.choice1.setText("");
        } else {
            uIscreen.choice1.setText("Pull out the sword");
        }
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go back");
    if (player.getEquippedWeapon().name.equals("Longsword")){
        game.nextPosition1 = "";
    }else {
        game.nextPosition1 = "swordEquipped";
    }
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "north1Forest";
    }
    private void swordEquipped(){
        uIscreen.mainTextArea.setText("As you grab the hilt of the sword. With all your might you pull it out. \nYour acquire a longsword");

        player.setEquippedWeapon(new WeaponLongsword());
        uIscreen.weaponNameLabel.setText(player.getEquippedWeapon().name);

        goBackUIBlank();

        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "north2NoSword";
    }

    private void north2NoSword(){
        uIscreen.mainTextArea.setText("As you stand back. You look at the rock you pulled the sword from.\nWhat do you do?");

        goBackUIBlank();

        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "north1Forest";

    }
    private void bushEncounter(){
        creatureCommon = new MonsterBush();
        creatureBattling = creatureCommon;

        uIscreen.mainTextArea.setText("As you reach for the bush. It becomes starts to move\nYou encounter " + creatureCommon.name);
        uIscreen.choice1.setText("Battle");
        uIscreen.choice2.setText("Flee");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "battle";
        game.nextPosition2 = "north1Forest";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    private void banditEncounter(){
        creatureBattling = creatureBandit;

        if (!creatureBandit.lifeStatus){
            uIscreen.mainTextArea.setText("You see the body of the dead bandit. Your job here is done");
        }
        else if (creatureBandit.specialStatus) {
            uIscreen.mainTextArea.setText("You are aware of the bandits tricks and approach carefully\nYou see the bandit ready to pounce at a moments notice.");
        } else {
            uIscreen.mainTextArea.setText("As you walk into the alleyway on the left.\n<AMBUSH> \nYou get stabbed from behind by the bandit. \nYou take: 3 damage");
            player.setHealth(player.getHealth() - 3);
            uIscreen.healthNumberLabel.setText("" + player.getHealth());
            creatureBandit.specialStatus = true;
        }
        if(creatureBandit.lifeStatus) {
            uIscreen.choice1.setText("Battle");
        } else {
            uIscreen.choice1.setText("");
        }
        uIscreen.choice2.setText("Leave");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        if (creatureBandit.lifeStatus){
            game.nextPosition1 = "battle";
        } else {
            game.nextPosition1 = "";
        }
        game.nextPosition2 = "east1Slums";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }
    private void trollEncounter(){
        creatureCommon = new MonsterTroll();
        creatureBattling = creatureCommon;


        uIscreen.mainTextArea.setText("You go forward towards the scary noise and see a giant troll\nYou encounter " + creatureCommon.name + "\nThe Troll looks very strong and has <" + creatureCommon.health + "> health points");

        uIscreen.choice1.setText("Battle");
        uIscreen.choice2.setText("Leave to get stronger");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "battle";
        game.nextPosition2 = "south1Swamp";
        game.nextPosition3 = "";
        game.nextPosition4 = "";


    }

    private void east1Slums(){
        uIscreen.mainTextArea.setText("You walk east to the slums.\nYou hear noises from an alleyway to you left.\nTo the right you hear sounds of people screaming");

        uIscreen.choice1.setText("Go left");
        uIscreen.choice2.setText("Go right");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go back");

        game.nextPosition1 = "banditEncounter";
        game.nextPosition2 = "gameoverEast";
        game.nextPosition3 = "";
        game.nextPosition4 = "goOutside";

    }

    private void battle(){
        uIscreen.mainTextArea.setText(creatureBattling.name + " has <" + creatureBattling.health + "> health points\n\nWhat do you do!");

        uIscreen.choice1.setText("Attack");
        if (creatureBattling.name.equals(new NPCPeasant().name)){
            uIscreen.choice2.setText("");
        } else {
            uIscreen.choice2.setText("Flee");
        }
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        if (creatureBattling.name.equals(new NPCPeasant().name)){
            game.nextPosition2 = "";
        }
        if (creatureBattling.name.equals(new MonsterBandit().name)){
            game.nextPosition2 = "east1Slums";
        }
        if (creatureBattling.name.equals(new MonsterTroll().name)){
            game.nextPosition2 = "south1Swamp";
        }
        if (creatureBattling.name.equals(new MonsterBush().name)){
            game.nextPosition2 = "north1Forest";
        }
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    private void playerAttack(){
        int playerDamage;
        uIscreen.playSound(1);

        if (mightPotion == 2){
            playerDamage = player.dealDamage()+20;
        } else {
            playerDamage = player.dealDamage();
        }


        uIscreen.mainTextArea.setText("You attacked the " + creatureBattling.name + " and do " + playerDamage + " damage!");
        creatureBattling.health = creatureBattling.health - playerDamage;

        uIscreen.choice1.setText("Continue");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        if (creatureBattling.health>0){
            game.nextPosition1 = "monsterAttack";
        }
        else {
            creatureBattling.lifeStatus = false;
            game.nextPosition1 = "monsterSlain";
        }
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    private void monsterAttack(){
        try {
            int monsterDamage = new java.util.Random().nextInt(creatureBattling.damage + player.getEquippedArmor().reduction);

            player.setHealth(player.getHealth() - monsterDamage);
            uIscreen.healthNumberLabel.setText("" + player.getHealth());
            uIscreen.mainTextArea.setText(creatureBattling.name + creatureBattling.attackMessage + monsterDamage);


        } catch (IllegalArgumentException e){

            player.setHealth(player.getHealth());
            battle();

        }
        uIscreen.choice1.setText("Continue");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        if(player.getHealth() >0){
            game.nextPosition1 = "battle";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if (player.getHealth() <1){
            uIscreen.stopSound();
            game.nextPosition1 = "gameoverDeath";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
    private void monsterSlain(){
        if(creatureBattling.name.equals(new MonsterBush().name)){
            bushSlain();
        }
        if(creatureBattling.name.equals(new MonsterBandit().name)){
            banditSlain();
        }
        if(creatureBattling.name.equals(new MonsterTroll().name)){
            win();
        }
        if(creatureBattling.name.equals(new NPCPeasant().name)){
            peasantSlain();
        }
    }
    private void bushSlain(){
        uIscreen.mainTextArea.setText("You defeated the "+ creatureCommon.name + " the monster was a simple bush" + "\nWhat do you do?");

        uIscreen.choice1.setText("Punch the bush");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go back");

        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "north1Forest";

    }
    private void banditSlain(){
        creatureBandit.lifeStatus = false;
        uIscreen.mainTextArea.setText("As you kill the Bandit you find a Might Potion on the bandit\n\nWhat do you do before leaving?");
        mightPotion = 1;

        uIscreen.choice1.setText("Drink the Potion");
        uIscreen.choice2.setText("Save it for later");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "mightPotion";
        game.nextPosition2 = "east1Slums";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }
    private void mightPotion(){
        mightPotion = 2;
        uIscreen.mainTextArea.setText("You drink the Might potion and feel like you are stronger");
        player.setHealth(20);
        uIscreen.healthNumberLabel.setText("" + player.getHealth());

        uIscreen.choice1.setText("Continue");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "east1Slums";


    }

    /**
     * Visually update the choice box buttons to |*BLANK*|*BLANK*|*BLANK*|Go back|
     */
    public void goBackUIBlank(){
        uIscreen.choice1.setText("");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go back");
    }
    private void peasantSlain(){
        uIscreen.mainTextArea.setText("You kill Greg. Oh the Humanity!\nAs you stand over Greg's body. You pick up a tubed hand crossbow");
        player.setEquippedWeapon(new WeaponGun());
        uIscreen.weaponNameLabel.setText(player.getEquippedWeapon().name);
        creatureCommon.specialStatus = true;


        uIscreen.choice1.setText("Talk to the Bartender");
        uIscreen.choice2.setText("Go Outside");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "talkToBartender";
        game.nextPosition2 = "goOutside";
        game.nextPosition3 = "";
        game.nextPosition4 = "";


    }

    private void gameoverDeath(){
        uIscreen.stopSound();
        uIscreen.mainTextArea.setText("You are dead\n\n<GAME OVER>");

        displayPlayAgain();

    }
    private void gameoverNorth(){
        uIscreen.stopSound();
        uIscreen.mainTextArea.setText("You walk of the trail and become part of the tree men, ending you adventure\n\n<GAME OVER>");

        displayPlayAgain();
    }

    private void gameoverEast(){
        uIscreen.stopSound();
        uIscreen.mainTextArea.setText("As you walk into the alleyway on the right and see a protest for equal rights movement. Your adventure stops here as your carrier of equal right starts instead.\n\n<GAME OVER>");

        displayPlayAgain();

    }

    private void west1Smith(){
        if (mightPotion != 3){
            uIscreen.mainTextArea.setText("You walk west and enter the blacksmith.\nA dwarf greets you");
        } else {
            uIscreen.mainTextArea.setText("You walk west and enter the blacksmith.\nA dwarf greets you and thanks you with a big smile");
        }

        if (mightPotion != 3) {
            uIscreen.choice1.setText("Talk to the Dwarf");
        } else {
            uIscreen.choice1.setText("");
        }
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go outside");

        if(mightPotion != 3) {
            game.nextPosition1 = "west2Smith";
        } else {
            game.nextPosition1 = "";
        }
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "goOutside";
    }

    private void west2Smith(){
        uIscreen.mainTextArea.setText("You approach the dwarf. He looks at you, waiting. \n\nWhat do you do");
        talkingWithSmith();
    }

    private void west3Smith(){
        creatureBandit.specialStatus = true;
        uIscreen.mainTextArea.setText("Dwarf Blacksmith: Aye there is a bandit that has stolen my Might Potion, I can't work without it. If you retrieve the potion for me I will give you my best armor.\nI have heard that the bandit is to the east on the left alleyway. Dont go to into the right alleyway! trust me");
        talkingWithSmith();

    }
    private void west4Smith(){
        uIscreen.mainTextArea.setText("Dwarf Blacksmith: I create equipment for adventures and farmers.");

        talkingWithSmith();

    }

    private void west5Smith() {
        uIscreen.mainTextArea.setText("Dwarf Blacksmith: Only if you get back my Might Potion. Can't make anything without it...\n\n*The dwarf sigh...*\nWhat do you do?");

        talkingWithSmith();
    }
    private void talkingWithSmith() {
        uIscreen.choice1.setText("Ask about Bandit");
        uIscreen.choice2.setText("What do you do?");
        if(mightPotion == 1) {
            uIscreen.choice3.setText("Here is your potion");
        } else {
            uIscreen.choice3.setText("Can I get an armor?");
        }
        uIscreen.choice4.setText("Go outside");

        game.nextPosition1 = "west3Smith";
        game.nextPosition2 = "west4Smith";
        if (mightPotion == 1) {
            game.nextPosition3 = "west6Reward";
        } else {
            game.nextPosition3 = "west5Smith";
        }
        game.nextPosition4 = "goOutside";
    }
    private void west6Reward(){
        uIscreen.mainTextArea.setText("Dwarf Blacksmith: Thank you very much. Here is my best armor and let me bandage you up\nAs you equip the armor and leave. You feel safer.");
        mightPotion = 3;
        player.setEquippedArmor(new ArmorIron());
        uIscreen.armorNameLabel.setText(player.getEquippedArmor().name);
        player.setHealth(10);
        uIscreen.healthNumberLabel.setText("" + player.getHealth());

        uIscreen.choice1.setText("Continue");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "goOutside";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    private void south1Swamp(){
        uIscreen.mainTextArea.setText("You go south to the swamp. Your hear roars and large foot steps.\n\nWhat do You do?");

        uIscreen.choice1.setText("Go toward the sound");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("Go back");

        game.nextPosition1 = "trollEncounter";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "goOutside";
    }

    private void win(){
        uIscreen.mainTextArea.setText("As you slay the troll, you cut off its head going back to the village.\nThe Elder greets your thanking you forgiving all you school and drinking debts\n\nYOU WIN");

        displayPlayAgain();
    }

    /**
     * gives the player defaultStatus and shows the title screen when called
     */
    public void newGame(){
        gameStart();
        visibilityManager.showTitleScreen();
    }

    /**
     * This is the playAgain method that repeats if you die
     */
    private void displayPlayAgain(){

        uIscreen.choice1.setText("Play Again");
        uIscreen.choice2.setText("");
        uIscreen.choice3.setText("");
        uIscreen.choice4.setText("");

        game.nextPosition1 = "newGame";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }


}
