package Creature.Monsters;

import Creature.CreatureMold;

/**
 * This is MonsterBandit that extends from the CreatureMold
 */
public class MonsterBandit extends CreatureMold {

    /**
     * Bandit attributes.
     */
    public MonsterBandit(){
        name = "Bandit";
        health = 7;
        damage = 6;
        attackMessage = " Stabs you with his knife dealing: ";
        lifeStatus = true;
        specialStatus = false;
    }

}
