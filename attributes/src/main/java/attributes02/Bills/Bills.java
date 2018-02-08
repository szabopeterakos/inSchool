package attributes02.Bills;

import java.util.ArrayList;
import java.util.List;

public class Bills {
    List<Item> items = new ArrayList<>();

    void addItem(Item newBill){
        items.add(newBill);
    }

    public List<Item> getItems() {
        return this.items;
    }

    public int calculateTotalPrice(){
        int sum = 0;
        for(Item bill : items){
            sum += bill.price * bill.quantity;
        }
        return sum;
    }
}
