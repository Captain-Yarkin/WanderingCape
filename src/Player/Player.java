package Player;

import Equipment.WeaponMold;

/**
 * This is the player class that tracks what the player's status is under the games progress
 */
public class Player implements IPlayer {
    private int health;
    private WeaponMold equippedWeapon;

    public WeaponMold getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(WeaponMold equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
