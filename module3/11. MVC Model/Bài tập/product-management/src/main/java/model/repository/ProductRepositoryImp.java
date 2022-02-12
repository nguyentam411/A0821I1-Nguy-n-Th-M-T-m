package model.repository;

import model.bean.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImp implements ProductRepository {
    static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "pen", 10, "blue", "abc"));
        productList.add(new Product(2, "book", 15, "no", "aaa"));
        productList.add(new Product(3, "bag", 50, "green", "aaa"));
        productList.add(new Product(4, "pencil", 5, "no", "aaa"));
        productList.add(new Product(5, "ruler", 10, "no", "aaa"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public boolean save(Product product) {
        productList.add(product);
        return true;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public Product findByName(String name) {
        return null;
    }
}
