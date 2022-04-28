package Player;

import Equipment.WeaponMold;
import Equipment.Weapons.WeaponDagger;

/**
 * This is the interface for the player
 */
public interface IPlayer {
    int health = 0;
    WeaponMold equippedWeapon = new WeaponDagger();
    int dealDamage();

}
