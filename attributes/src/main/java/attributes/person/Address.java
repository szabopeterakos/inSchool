package attributes.person;

public class Address {
    private String country,  city,  streetAndNumber,  zipCode;

    String addressToString(){
        return this.country + this.city + this.streetAndNumber + this.zipCode;
    }

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

    public void correctData(String country,String city,String streetAndNumber, String zipCode){
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }



}
