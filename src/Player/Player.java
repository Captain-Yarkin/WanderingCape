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

    /**
     * This is the players dealing damage method
     * @return Random number from the weapons damage value
     */
    public int dealDamage() {
        return new java.util.Random().nextInt(getEquippedWeapon().damage);
    }
}
