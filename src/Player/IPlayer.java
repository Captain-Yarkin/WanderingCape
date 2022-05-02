package Player;

import Equipment.ArmorMold;
import Equipment.WeaponMold;

/**
 * This is the interface for the player
 */
public interface IPlayer {

    int dealDamage();

    void setDefaultStatus(int hp, WeaponMold weapon, ArmorMold armor);

}
