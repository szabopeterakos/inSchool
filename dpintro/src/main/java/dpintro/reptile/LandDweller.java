package dpintro.reptile;

public abstract class LandDweller {

    int energy;

    public LandDweller(int energy) {
        this.energy = energy;
    }

    protected void decreaseEnergy(int value) {
        if (energy < value) {
            throw new IllegalArgumentException("Not enough energy to move!");
        }
        this.energy -= value;
    }

    public int getEnergy() {
        return this.energy;
    }

}
