package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "spear":
            	return new Spear();
            case "javelin":
            	return new Javelin();
            case "crazyrandomsword":
            	return new CrazyRandomSword();
            case "simplehammer":
            	return new SimpleHammer();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
