package Player;

import Equipment.ArmorMold;
import Equipment.Potion.MightPotion;
import Equipment.WeaponMold;
import GUI.UIscreen;

/**
 * This is the player class that tracks what the player's status is under the games progress
 */
public class Player implements IPlayer {
    private int health;
    private WeaponMold equippedWeapon;

    private ArmorMold equippedArmor;

    private MightPotion conditionEffect;

    private final UIscreen uIscreen;

    public Player(UIscreen uIscreen){
        this.uIscreen = uIscreen;
    }


    public ArmorMold getEquippedArmor(){
        return equippedArmor;
    }

    public void setEquippedArmor(ArmorMold equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    public MightPotion getConditionEffect() {
        return conditionEffect;
    }

    public void setConditionEffect(MightPotion conditionEffect) {
        this.conditionEffect = conditionEffect;
    }

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
    /**
     * This is what the players start with in the game.
     */
    @Override
    public void setDefaultStatus(int hp, WeaponMold weapon, ArmorMold armor) {
        //PLAYER HEALTH
        setHealth(hp);
        uIscreen.healthNumberLabel.setText(""+ getHealth());

        //PLAYER EQUIPPED WEAPON
        setEquippedWeapon(weapon);
        setEquippedArmor(armor);
        uIscreen.weaponNameLabel.setText(getEquippedWeapon().name);
        uIscreen.armorNameLabel.setText(getEquippedArmor().name);

    }
}
