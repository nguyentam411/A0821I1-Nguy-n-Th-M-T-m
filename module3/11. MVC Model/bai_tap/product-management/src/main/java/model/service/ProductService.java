package model.service;


import model.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    boolean save(Product product);


    void update(int id, Product product);

    void remove(int id);

    Product findById(int id);

    Product findByName(String name);

}
