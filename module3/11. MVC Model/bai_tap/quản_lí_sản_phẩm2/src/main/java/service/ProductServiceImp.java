package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImp implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "pen", 10, "blue", "abc"));
        products.put(1, new Product(2, "a", 10, "blue", "abc"));
        products.put(1, new Product(3, "b", 10, "blue", "abc"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
products.put(id,product);
    }

    @Override
    public void remove(int id) {
products.remove(id);
    }
}
