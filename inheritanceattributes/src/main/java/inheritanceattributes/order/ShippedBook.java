package inheritanceattributes.order;

import inheritanceattributes.book.Book;

public class ShippedBook extends Book {

    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost){
        super(title,price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces){
        return purchase(pieces) + getShippingCost();
    }
    // "Gyűrűk ura:3000 - 1200"
    public String toString(){
        return super.getTitle()+":"+price+" - "+getShippingCost();
    }

    public int getShippingCost() {
        return shippingCost;
    }
}
