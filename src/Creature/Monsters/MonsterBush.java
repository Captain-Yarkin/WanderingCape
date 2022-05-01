package Creature.Monsters;

import Creature.CreatureMold;
/**
 * This is MonsterBush that extends from the CreatureMold
 */
public class MonsterBush extends CreatureMold {
    /**
     * Bush attributes.
     */
    public MonsterBush(){
        name = "Bush";
        health = 7;
        damage = 2;
        attackMessage = "You get scratched on the bush and take:";
    }


}
