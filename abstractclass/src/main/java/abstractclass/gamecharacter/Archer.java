package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private int numberOfArrow;

    public Archer(Point point){
        super(point);
        this.numberOfArrow = 100;
    }

    public Archer(Point position, Random random) {
        super(position, random);
        this.numberOfArrow = 100;
    }

    public int getActualSecondaryDamage(){
        return new Random().nextInt(5);
    }

    private void shootingAnArrow(Character enemy){
        numberOfArrow--;
        hit(enemy,getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }


    public int getNumberOfArrow() {
        return numberOfArrow;
    }

}
