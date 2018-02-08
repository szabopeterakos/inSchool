package introinheritance.basket;

public class Item {

    //Item osztály String barcode, double nettoPrice, int vatPercent attribútumokkal
    private String barcode;
    private double nettoPrice;
    private int vatPercent;

    public Item(String barcode, double nettoPrice, int vatPercent) {
        this.barcode = barcode;
        this.nettoPrice = nettoPrice;
        this.vatPercent = vatPercent;
    }

    public double getTaxAmount() { // a nettoPrice és a vatPercent alapján kiszámolja az adó összegét
        return nettoPrice * vatPercent / 100;
    }

    public double getNettoPrice(){
        return nettoPrice;
    }

    public String getBarcode(){
        return barcode;
    }

    public int getVatPercent() {
        return vatPercent;
    }

    // "Item{barcode='123456', nettoPrice=1000.0, vatPercent=27}"
    public String toString() {// generált string reprezentáció
        return "Item{barcode=\'"+getBarcode()+"\', nettoPrice="+getNettoPrice()+", vatPercent="+getVatPercent()+"}";
    }
}
