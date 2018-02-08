package methodstructure.bmi;

public class BodyMass {

    private double weight;
    private double height;

    public BodyMass(double weight, double heigth) {
        this.weight = weight;
        this.height = heigth;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex() {
        return getWeight() / (getHeight() * getHeight());
    }

    public BmiCategory body() { // FONTOS
        BmiCategory temp = null;
        if (bodyMassIndex() < 18.5) {
            temp = BmiCategory.UNDERWEIGHT;
        } else if (bodyMassIndex() >= 18.5 && bodyMassIndex() <= 25) {
            temp = BmiCategory.NORMAL;
        } else if (bodyMassIndex() > 25) {
            temp = BmiCategory.OVERWEIGHT;
        }

        return temp;
    }

    public boolean isThinnerThan(BodyMass bm){
        if (bodyMassIndex() < 18.5) {
            return true;
        }
        return false;
    }
}
