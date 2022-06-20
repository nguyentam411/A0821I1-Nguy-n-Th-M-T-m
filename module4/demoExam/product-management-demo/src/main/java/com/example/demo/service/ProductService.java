package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product getById(int id);

    void save(Product product);

    void remove(int id);

}
