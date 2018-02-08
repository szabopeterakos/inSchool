package singleton.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class LocalStore implements Store {

    private List<Product> products = new ArrayList<>();
    public static int CAPACITY = 3000;
    private static LocalStore instance = new LocalStore();

    private LocalStore() {
    }

    public static LocalStore getInstance(){
        return instance;
    }

    @Override
    public void add(Product product) {
        if(getProductCount() < CAPACITY){
            products.add(product);
        }

    }

    @Override
    public Product remove() {
        if(instance.getProductCount() > 0){
            return instance.products.remove(0);
        }
        throw new IllegalStateException("Store is empty");
    }

    @Override
    public void reset() {
        instance.products.clear();
    }

    @Override
    public int getProductCount() {
        return instance.products.size();
    }
}
