package Game;

import Equipment.Weapons.WeaponDagger;
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

}
