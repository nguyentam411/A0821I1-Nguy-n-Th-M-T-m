package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ProductService {
    Page<Product> getAll(Pageable pageable);
//    Page<Product> searchByName(String name, Pageable pageable);

}
