package attributes02.Bills;

public class BillMain {
    public static void main(String[] args) {
        Item i01 = new Item("kacsa",12, 1200);
        Item i02 = new Item("cucc",22, 700);

        Bills firstBill = new Bills();
        firstBill.addItem(i01);
        firstBill.addItem(i02);
        System.out.println(firstBill.calculateTotalPrice());

    }
}
