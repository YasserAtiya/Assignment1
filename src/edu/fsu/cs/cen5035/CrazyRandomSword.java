package edu.fsu.cs.cen5035;
import java.util.Random;
/**
 *
 * @author Yasser
 */
public class CrazyRandomSword extends BasicWeapon implements Weapon {

    public CrazyRandomSword() {
	super((int)Math.max(Math.random()*100,3));
    }


    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
	Random rand = new Random();
	int random = rand.nextInt((int)(armor/3)-2);
        int damage = DAMAGE - random + 2;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
