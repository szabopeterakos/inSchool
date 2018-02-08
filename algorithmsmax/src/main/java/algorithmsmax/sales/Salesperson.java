package algorithmsmax.sales;

public class Salesperson {

    String name;
    int amount;
    int target;

    public Salesperson(String name, int amount, int target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public int getTarget() {
        return target;
    }

    public int getDifferenceFromTarget() {
        return amount - target;
    }

    public int getAmount() {
        return amount;
    }
}
