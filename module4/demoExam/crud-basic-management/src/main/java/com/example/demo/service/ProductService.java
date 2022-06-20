package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product getById(int id);

    void save(Product product);

    void remove(int id);
    List<Product> searchByName(String name);
    List<Product> searchByCate(String cate);
    List<Product> searchByPrice(double price);
    List<Product> search(String search_key, String search_by);

}
