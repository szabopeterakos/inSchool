package attributes02.person;

public class Person {

    String name;
    String identificationCard;
    Address addressList; // A Person osztály tartalmazzon egy hivatkozást az Address osztályra

    public String personToString() {
        return name + " " + identificationCard;
    }

    public void correctData(String name, String identificationCard){
        this.name = name;
        this.identificationCard = identificationCard;
    }

    // Legyen egy moveTo(Address) metódus mely beállítja a címet.
    Address moveTo(String country, String city, String streetAndNumber, String zipCode){
        this.addressList = new Address( country,  city,  streetAndNumber,  zipCode);
        return addressList;
    }

    // egy getAddress, mellyel lekérdezhetővé válik.
    public Address getAddressList() {
        return addressList;
    }
}

class Address {
    String country;
    String city;
    String streetAndNumber;
    String zipCode;

    public Address(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    String addressToString() {
        return country + " " + city + " " + streetAndNumber + " " + zipCode;
    }

    public void correctData(String country, String city, String streetAndNumber, String zipCode){
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }
}



