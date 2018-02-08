package introinheritance.basket;

import java.util.List;

public class ShoppingBasket {

    private Basket basket;

    public ShoppingBasket() {
        this.basket = new Basket();
    }

    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double sum = 0;
         List<Item> temp = basket.getItems();
         for(Item c :temp){
             sum += c.getNettoPrice();
         }
         return sum;
    }

    public double sumTaxValue(){
        double sum = 0;
        List<Item> temp = basket.getItems();
        for(Item c :temp){
            sum += c.getTaxAmount();
        }
        return sum;
    }

    public double sumBruttoPrice(){
        return sumNettoPrice() + sumTaxValue();
    }

    public void checkout(){
        basket.clearBasket();
    }

    public void removeMostExpensiveItem(){
        List<Item> temp = basket.getItems();

        Item expensive = temp.get(0);
        for(Item c :temp){
            if(c.getNettoPrice() > expensive.getNettoPrice()){
                expensive = c;
            }
        }
        basket.removeItem(expensive.getBarcode());
    }

}
