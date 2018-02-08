package singleton.producerconsumer;

public interface Store {

    void add(Product product);
    Product remove(); //a legrégebben beadott terméket veszi ki, FIFO elven
    void reset(); //kiüríti a raktárt
    int getProductCount(); // a raktárban tárol termékek száma

}
