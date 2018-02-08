package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {

    int passengers;
    int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int temp=0;
        if (passengers <= maxPassengers) {
            this.passengers = passengers;
            temp = 0;
        }
        if (passengers > maxPassengers) {
            temp = passengers - maxPassengers;
            this.passengers = maxPassengers;

        }
        return temp;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

}
