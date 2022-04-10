package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> getAll(Pageable pageable);
    Product getById(int id);
    void save(Product product);
    void remove(int id);

}
