package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public Pendrive(String name, int capacity, int price) {

        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent) {
        this.price = getPrice() + (getPrice() / percent);
    }

    public int comparePricePerCapacity(Pendrive p) {

        if (((double) this.getPrice() / this.getCapacity()) < ((double) p.getPrice() / p.getCapacity())) {
            return -1;
        }

        if (((double) this.getPrice() / this.getCapacity()) == ((double) p.getPrice() / p.getCapacity())) {
            return 0;
        }

        return 1;
    }

    public boolean cheaperThan(Pendrive p) {
        if (this.getPrice() < p.getPrice()) {
            return true;
        }
        return false;
    }
}
