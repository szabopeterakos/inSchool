package nestedclasses.webshop;


import java.time.LocalDateTime;

public class Product {

    private String name;
    private int age;
    private LocalDateTime from;

    public Product(String name, int age, LocalDateTime from) {
        this.name = name;
        this.age = age;
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDateTime getFrom() {
        return from;
    }
}
