package inheritanceconstructor.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity){
        if(fuel > tankCapacity){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }

        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        if(fuel > this.fuel){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }

        setFuel(this.fuel + fuel);
    }

    public void drive(int km){ // new Car(5.0, 25.0, 40.0); 25-
        if(km / 100 * getFuelRate() > getFuel()){
            throw new RuntimeException("Not enough fuel available!");
        }
        setFuel(getFuel()-(km / 100 * getFuelRate()));
    }

    public double calculateRefillAmount(){
        return getTankCapacity() - getFuel();
    } //kiszámolja, mennyit lehet tankolni

    public double getFuel() {
        return fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

}
