package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {
        String[] list = {"husi","pogi","szósz"};
        String name = "Pekingi Pingvin";
        int asztalok = 32;

        Restaurant nr = new Restaurant(name, asztalok, list);
        System.out.println(nr.getMenu());
        System.out.println(nr.getAll());

    }

}
