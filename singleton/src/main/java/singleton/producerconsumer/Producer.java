package singleton.producerconsumer;

public class Producer {

    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public Product produce(String name){
        Product product = new Product(name);
        store.add(product);
        return product;
    }
}
