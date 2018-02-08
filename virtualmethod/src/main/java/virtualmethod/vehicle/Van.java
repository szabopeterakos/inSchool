package virtualmethod.vehicle;

public class Van extends Car {

    int cargoWeight;

    public Van(int vehicleWeight, int numberPassenger, int cargoWeight) {
        super(numberPassenger,vehicleWeight);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + cargoWeight;
    }

    @Override
    public String toString() {
        return "Van{" +
                "cargoWeight=" + cargoWeight +", "+
                "numberOfPassenger=" + getNumberPassenger() + ", " +
                "vehicleWeight=" + getVehicleWeight() +
                '}';
    }
}
