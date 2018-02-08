package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {

    public AxeWarrior(Point point){
        super(point);
    }

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    public int getActualSecondaryDamage (Character enemy) {
        return new Random().nextInt(getActualPrimaryDamage()*2);
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if( getPosition().distance(enemy.getPosition()) < 2 ){ // fontos
            hit(enemy,getActualSecondaryDamage(enemy)); // enemy?
        }
    }
}
