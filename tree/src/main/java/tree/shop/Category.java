package tree.shop;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private long id;
    private String name;
    private Category parent;
    private List<Product> products = new ArrayList<>();
    private List<Category> children = new ArrayList<>();

    public Category(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(long id, String name, Category parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.parent.addChild(this);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getParent(){
        return this.parent;
    }

    public List<Product> getProducts(){
        return this.products;
    }

    public List<Category> getChildren(){
        return this.children;
    }

    public void addChild(Category category){
        this.children.add(category);
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public boolean hasChildren(){
        return !children.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (id != category.id) return false;
        return name != null ? name.equals(category.name) : category.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
