package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    boolean save(Product product);
    Product update(int id, Product product);
    void remove(int id);
    Product findById(int id);
    List<Product> findByName(String nameFind);
List<Product> findByPrice(int priceFind);
List<Product> findByAll(String nameFind,int priceFind,int colorIdFind,int categoryIdFind);
}
