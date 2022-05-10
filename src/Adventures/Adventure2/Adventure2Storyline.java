package Adventures.Adventure2;

import Creature.CreatureMold;
import Equipment.Armor.ArmorIron;
import Equipment.Weapons.WeaponShortsword;
import GUI.UI.VisibilityManager;
import GUI.UIscreen;
import Game.Game;
import Player.Player;

public class Adventure2Storyline {
    Game game;
    UIscreen uIscreen;
    VisibilityManager visibilityManager;
    Player player;
    CreatureMold creature;

    public Adventure2Storyline(Game gaming, UIscreen ui, VisibilityManager vm, Player player){
        this.game = gaming;
        this.uIscreen = ui;
        this.visibilityManager = vm;
        this.player = player;
    }

    public void gameStart(){
        player.setDefaultStatus(20, new WeaponShortsword(), new ArmorIron());

    }


}
