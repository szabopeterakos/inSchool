package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods  {

    private int cargoWeight;
    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight){
        int temp = 0;
        if(cargoWeight <= maxCargoWeight){
            this.cargoWeight = cargoWeight;
            temp = 0;
        }
        if(cargoWeight > maxCargoWeight){
            this.cargoWeight = maxCargoWeight;
            temp = cargoWeight - maxCargoWeight;
        }
        return temp;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
