package attributes.person.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    List<Item> items = new ArrayList<>();

    void addItem(Item it){
        this.items.add(it);
    }

    public List<Item> getItems() {
        return items;
    }

    public double calculateTotalPrice(){
        double sum = 0;
        for(Item it : items){
            sum += it.getPrice()*it.getQuantity();
        }
        return sum;
    }

}
