package attributes02.person;

public class PersonMain {
    public static void main(String[] args) {
        Person np = new Person();
        np.correctData("Kis Ernő", "345261HG");
        np.moveTo("HUN", "BP", "34567udfih", "6543");
        System.out.println(np.getAddressList().addressToString());


    }

}
