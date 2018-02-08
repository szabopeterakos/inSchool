package templatemethod.bank;

public abstract class GeneralProduct {

    private int price;

    protected abstract int round(double newPrice);

    public GeneralProduct(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int increase(double percent) {
        this.price = round(price * (100 + percent) / 100);
        return price;
    } //áremelés, használjuk az int round(double) metódust a kerekítésre

}
