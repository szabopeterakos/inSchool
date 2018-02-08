package dpintro.reptile;

public class Crocodile extends LandDweller implements CanSwim {

    public Crocodile(int energy) {
        super(energy);
    }

    public void walk(){
        decreaseEnergy(20);
    }

    @Override
    public void swim() {
        decreaseEnergy(5);
    }
}
