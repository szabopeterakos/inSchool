package objectclass;

public class Beer {

    private String name;
    private int price;

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getName()+" price:"+getPrice();
    }

    @Override
    public boolean equals(Object beer) {
        if (beer == null || getClass() != beer.getClass()) {
            return false;
        }

        Beer temp = (Beer)beer;

        if (getName().equals(temp.getName()) && getPrice() == temp.getPrice()) {
            return true;
        }

        return false;
    }
}
