package attributes.person;

public class PersonMain {
    public static void main(String[] args) {
        Person testPerson = new Person();
        testPerson.correctData("John Snow", "232161DA");
        testPerson.moveTo("Game of Thrones, ", "Winterfell, ", "Freez Street 66, ", "153");
        System.out.println(testPerson.personToString());
        System.out.println(testPerson.getAd().addressToString());
    }
}
