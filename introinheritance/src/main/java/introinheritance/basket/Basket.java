package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {
        for (Item c : items) {
            if (c.getBarcode().equals(barcode)) {
                items.remove(c);
                break;
            }
        }
    }

    public void clearBasket() {
        items.clear();
    }

    public List<Item> getItems() {
        List<Item> newList = new ArrayList<>();
        for (Item c : items) {
            newList.add(c);
        }
        return newList;
    }
}
