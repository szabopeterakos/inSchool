package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    List<Ship> shipList = new ArrayList<>();
    private int waitingPersons;
    private int waitingCargo;

    public void addShip(Ship ship){
        shipList.add(ship);
    }

    public void lift(int pessengers, int weigth) {
        waitingPersons = pessengers;
        waitingCargo = weigth;

        for (Ship c : shipList) {

            if (c instanceof CanCarryGoods) {
                waitingCargo = ((CanCarryGoods) c).loadCargo(waitingCargo);
            }
            if (c instanceof CanCarryPassengers) {
                waitingPersons = ((CanCarryPassengers) c).loadPassenger(waitingPersons);
            }
        }
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
