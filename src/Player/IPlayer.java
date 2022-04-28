package Player;

import Equipment.WeaponMold;
import Equipment.Weapons.WeaponDagger;

public interface IPlayer {
    int health = 10;
    WeaponMold equippedWeapon = new WeaponDagger();
}
