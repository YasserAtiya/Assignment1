package edu.fsu.cs.cen5035;

/**
 * @author Yasser
 */
public class Javelin extends BasicWeapon implements Weapon {

    public Javelin() {
        super(30);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (int) (0.5 * armor);
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
