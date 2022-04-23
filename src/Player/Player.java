package Player;

import Equipment.WeaponMold;

/**
 * This is the player class that tracks what the player's status is under the games progress
 */
public class Player implements IPlayer {
    public int health;
    public WeaponMold equippedWeapon;
}
