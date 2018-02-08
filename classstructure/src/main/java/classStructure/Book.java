package classStructure;

public class Book {
    private String author;
    private String address;
    private String regNumber;

    private String srt = null; // viheti a GB

    public Book(String author, String address) {
        this.author = author;
        this.address = address;
    }

    public void register(String regNumber){ // lokális
        this.regNumber = regNumber; // a globális kapja meg a lokális értékét.
    }

    // GB szerver oldalon fontos lesz majd :)
}
