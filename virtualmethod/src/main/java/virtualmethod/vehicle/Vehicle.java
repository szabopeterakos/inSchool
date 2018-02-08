package virtualmethod.vehicle;

public class Vehicle {

    public final static int PERSON_AVERAGE_WEIGHT = 75;
    int vehicleWeight;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getGrossLoad(){
        return vehicleWeight + PERSON_AVERAGE_WEIGHT;
    }

    public int getVehicleWeight() {
        return vehicleWeight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleWeight=" + vehicleWeight +
                '}';
    }
}
