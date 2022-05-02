package Adventures.Adventure2;

import Creature.CreatureMold;
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


}
