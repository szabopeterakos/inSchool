package attributes02.Bills;

public class Item {

    String product;
    int quantity;
    double price;

    public Item(String product,int quantity,double price){
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getAllData(){
        return product +" "+ quantity +" "+price;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }


}
