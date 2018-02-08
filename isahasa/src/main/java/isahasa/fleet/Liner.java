package isahasa.fleet;

public class Liner implements Ship, CanCarryPassengers {

    CanCarryPassengers canCarryPassengers;

    public Liner(int actPessengers) {
        this.canCarryPassengers = new CanCarryPassengersBehaviour(actPessengers);  // fontos
    }

    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}
