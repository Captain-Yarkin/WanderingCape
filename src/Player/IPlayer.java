package Player;

import Equipment.WeaponMold;
import Equipment.Weapons.WeaponDagger;

/**
 *
 */
public interface IPlayer {
    int health = 0;
    WeaponMold equippedWeapon = new WeaponDagger();
    int dealDamage();

}
