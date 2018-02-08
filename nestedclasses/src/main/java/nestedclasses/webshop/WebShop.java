package nestedclasses.webshop;

import java.util.*;

public class WebShop {

    private List<Product> productList = new ArrayList<>();

    public void addProducts(Product product){
        if(product == null){
            throw new IllegalArgumentException("null is not allowed");
        }
        productList.add(product);
    }

    public List<Product> getProductsOrderByName() {
        List<Product> temp = new ArrayList<>();
        temp.addAll(productList);
        temp.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return temp;
    }

    public List<Product> getProductsOrderByPrice(){
        List<Product> temp = new ArrayList<>();
        temp.addAll(productList);
        temp.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        return temp;
    }

    public List<Product> getProductsOrderByFrom(){
        List<Product> temp = new ArrayList<>();
        temp.addAll(productList);
        temp.sort((o1, o2) -> o1.getFrom().compareTo(o2.getFrom()));


        return temp;
    }

}
