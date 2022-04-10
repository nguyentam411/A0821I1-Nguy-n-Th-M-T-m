package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product getById(int id);
    void save(Product product);
    void remove(int id);

}
