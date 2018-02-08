package inheritanceconstructor.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel){
        super(fuelRate,fuel,tankCapacity);

        if(fuel + extraFuel > tankCapacity + extraCapacity){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }

        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }
    public void drive(int km){
        double needFuel = km / 100 * getFuelRate();
        if(super.getFuel()+getExtraFuel() < km / 100 * getFuelRate()){
            throw new RuntimeException("Not enough fuel available!");
        }
        if(getExtraFuel()>needFuel){
            setExtraFuel(getExtraFuel()-needFuel);
        }
        if(getExtraFuel()<needFuel){
            double needMore = needFuel - getExtraFuel();
            setExtraFuel(getExtraFuel()-(needFuel-needMore));
            setFuel(getFuel()-needMore);
        }
    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!

    public double calculateRefillAmount(){
        return (getTankCapacity() + getExtraCapacity())-(getFuel() + getExtraFuel());
    } //kiszámolja, mennyit lehet tankolni

    public void setExtraFuel(double extraFuel) {
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {

        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
