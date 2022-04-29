package Player;

import Equipment.Armor.ArmorCloth;
import Equipment.ArmorMold;
import Equipment.WeaponMold;
import Equipment.Weapons.WeaponDagger;

/**
 * This is the interface for the player
 */
public interface IPlayer {
    int health = 0;
    WeaponMold equippedWeapon = new WeaponDagger();
    ArmorMold equippedArmor = new ArmorCloth();
    int dealDamage();

}
