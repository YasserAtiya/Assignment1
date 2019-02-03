/**
 * @author Yasser
 */
public class SimpleHammer extends BasicWeapon implements Weapon {

    public SimpleHammer() {
        super(35);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE;
        if (armor < 30) {
            return damage;
        }
	else if (damage-armor > 0)
	    return damage-armor;
	else
	    return 0;
    }

}

