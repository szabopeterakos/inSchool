package tree.shop;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private Category root = new Category(0, "Shop");

    public void addCategory(long id, String name, long parentId) {
        if (id <= parentId) {
            throw new IllegalArgumentException();
        }
        Category parentCategory = findCatagoryById(root, parentId);
        new Category(id, name, parentCategory);
    }

    public Category getRoot() {
        return root;
    }

    public void addProduct(long id, String name, long categoryId) {
        Category containerCategory = findCatagoryById(root, categoryId);
        if (containerCategory == null) {
            throw new IllegalArgumentException();
        }
        containerCategory.addProduct(new Product(id, name, containerCategory));
    }

    private Category findCatagoryById(Category searchIn, long id) {
        Category result = null;
        if (searchIn.getId() == id) {
            return searchIn;
        }
        if (searchIn.hasChildren()) {
            for (Category childCategory : searchIn.getChildren()) {
                return findCatagoryById(childCategory, id);
            }
        }
        if (result == null) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    public Product findProductById(Category searchIn, long id) {
        Product result = null;
        long categoryId = 0;
        while (result == null) {
            Category category = findCatagoryById(searchIn, categoryId);
            for (Product product : category.getProducts()) {
                if (product.getId() == id) {
                    result = product;
                }
            }
            categoryId++;
        }
        if (result == null) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    public List<String> subCategoriesNames(long categoryId) {
        List<String> result = new ArrayList<>();
        Category containerCategory = findCatagoryById(root, categoryId);
        if (containerCategory.hasChildren()) {
            for (Category childCategory : containerCategory.getChildren()) {
                result.add(childCategory.getName());
            }
        }
        return result;
    }

    public List<Product> productsOfCategory(long categoryId) {
        List<Product> result = new ArrayList<>();
        Category containerCategory = findCatagoryById(root, categoryId);
        if (containerCategory.getProducts().size() != 0) {
            for (Product product : containerCategory.getProducts()) {
                result.add(product);
            }
        }
        return result;
    }

    public List<String> itemsInSameCategory(long productId) {
        List<String> result = new ArrayList<>();
        Product currentProduct = findProductById(this.root, productId);
        for (Product product : productsOfCategory(currentProduct.getCategory().getId())) {
            if (product.getId() != productId) {
                result.add(product.getName());
            }
        }
        return result;
    }

    public List<String> pathToCategory(long categoryId) {
        List<String> result = new ArrayList<>();
        Category containerCategory = findCatagoryById(root, categoryId);
        while (containerCategory.getId() > 0) {
            result.add(containerCategory.getParent().getName());
            containerCategory = containerCategory.getParent();
        }
        Collections.reverse(result);
        return result;
    }

    public List<String> pathToProduct(long productId) {
        List<String> result = new ArrayList<>();
        Product neededProduct = findProductById(root, productId);
        result.addAll(pathToCategory(neededProduct.getCategory().getId()));
        result.add(neededProduct.getCategory().getName());
        return result;
    }
}
