package Creature.Monsters;

import Creature.CreatureMold;
/**
 * This is MonsterTroll that extends from the CreatureMold
 */
public class MonsterTroll extends CreatureMold {
    /**
     * Troll attributes
     */
    public MonsterTroll(){
        name = "Troll";
        health = 100;
        damage = 13;
        attackMessage = "The Trolls fist hits you dealing:";
    }
}
