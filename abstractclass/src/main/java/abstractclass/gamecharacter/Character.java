package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random random;

    public Character(Point position) {
        this.position = position;
    }

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        if (hitPoint > 0) {
            return true;
        }
        return false;
    }

    protected int getActualPrimaryDamage() {
        return new Random().nextInt(10)+1;
    }

    private int getActualDefence() {
        return new Random().nextInt(5);
    }

    protected void hit(Character enemy, int damage) {
        if (getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage); // enemy miatt OK
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    protected void decreaseHitPoint(int diff) {
        setHitPoint(getHitPoint() - diff);
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Point getPosition() {
        return position;
    }

    public abstract void secondaryAttack(Character enemy);


}
