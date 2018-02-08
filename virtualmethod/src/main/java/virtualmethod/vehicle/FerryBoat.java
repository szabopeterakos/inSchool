package virtualmethod.vehicle;

public class FerryBoat extends Vehicle {

    public final int MAX_CARRY_WEIGHT;

    private Vehicle car;

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public FerryBoat(int boatWeight) {
        super(boatWeight);
        MAX_CARRY_WEIGHT = boatWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad()+car.getGrossLoad();
    }

    public boolean canCarry(Vehicle vehicle){
        if(vehicle == null || MAX_CARRY_WEIGHT-vehicle.getVehicleWeight() > 0 ){
            return true;
        }
        return false;
    }

    public boolean load(Vehicle vehicle){
        if(MAX_CARRY_WEIGHT>vehicle.getVehicleWeight()){
            setCar(vehicle);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }
}
