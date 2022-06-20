package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService extends GeneralService<Product> {
    Page<Product> getAll(Pageable pageable);
    Page<Product> searchByName(String name, Pageable pageable);
    Page<Product> searchByCate(String cate, Pageable pageable);
    Page<Product> searchByPrice(double price, Pageable pageable);
    Page<Product> search(String search_key, String search_by, Pageable pageable);

}
