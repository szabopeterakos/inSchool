package singleton.producerconsumer;

public class Consumer {

    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public Product consume(){ // em jó a leírása a consumer osztálynak
        if(store.getProductCount() == 0){
            throw new IllegalStateException("Store is empty");
        }
        return store.remove();
    }
}
