package attributes.person;

public class Person {

    String name, identificationCard;

    private Address ad;

    String personToString(){
        return this.name + this.identificationCard;
    }

    public void correctData(String name,String identificationCard){
        this.name = name;
        this.identificationCard = identificationCard;
    }

    /**
     * A Person osztály tartalmazzon egy hivatkozást az Address osztályra.
     * Legyen egy moveTo(Address) metódus mely beállítja a címet, és egy getAddress,
     * mellyel lekérdezhetővé válik.
     * Teszteld az osztályokat a PersonMain main() metódusában.
     */

    public Address getAd() {
        return ad;
    }

    public void moveTo(String country, String city, String streetAndNumber, String zipCode) {
        this.ad = new Address(country, city, streetAndNumber, zipCode);
    }

    public static void main(String[] args) {
        Address ad0101 = new Address("","","","");
        ad0101.correctData("Hungary ","Budapest ","Kiss József cucca két ", "5432");
        System.out.println(ad0101.getCountry());
        System.out.println(ad0101.addressToString());

        Person p = new Person();
        p.moveTo("Hungary ","Budapest ","Kiss József cucca két ", "5432");

        System.out.println(p.getAd().addressToString());

    }
}
