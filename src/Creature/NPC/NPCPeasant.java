package Creature.NPC;

import Creature.CreatureMold;

public class NPCPeasant extends CreatureMold {
    /**
     * Gregs attributes
     */
    public NPCPeasant(){
        name = "Greg";
        health = 30;
        damage = 3;
        attackMessage = " the drunk swings his fist dealing: ";
        lifeStatus = true;
        specialStatus = false;
    }
}
