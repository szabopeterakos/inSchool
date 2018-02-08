package classStructure;

import java.util.Date;

public class Client {

    private String name;
    private Date dateOfBirth;
    private String address;

    // konstruktor
    public Client(String name, Date dateOfBirth, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    // formailag setter de kivontuk mert nem akarjuk hogy egy kertetrendszer felismerje;
    public void migrate(String address){
        this.address = address;
    }

    //getter egységbezárás, adatok védelme miatt
    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    // ezek még mindíg csak a tervjaz részei fenn...

    // egy osztálynak tetszőleges számú konstruktora lehet

    public static void main(String[] args) {
        Client person01 = new Client("Tamás Ákos",new Date(), "Budapest, Az bizony utca 7.");
        System.out.println(person01.name);
        System.out.println(person01.getName());
        System.out.println(person01.getAddress());


        person01.migrate("Kapitány, Az bizony utca 7.");
        System.out.println(person01.getAddress());

    }
}
