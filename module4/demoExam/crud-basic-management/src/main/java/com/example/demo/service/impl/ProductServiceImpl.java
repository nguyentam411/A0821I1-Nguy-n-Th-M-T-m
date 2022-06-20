package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getById(int id) {
        return productRepo.getById(id);
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public void remove(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepo.getAllByNameContaining(name);
    }

    @Override
    public List<Product> searchByCate(String cate) {
        return null;
    }

    @Override
    public List<Product> searchByPrice(double price) {
        return null;
    }

    @Override
    public List<Product> search(String search_key, String search_by) {
        List<Product> products;

        switch (search_by) {
            case ("name"):
                products =productRepo.getAllByNameContaining(search_key);
                break;
            case ("price"):
                products = productRepo.getAllByPriceGreaterThanEqual(Double.parseDouble(search_key));
                break;
            case ("category"):
                products = productRepo.findByCategoryName("%".concat(search_key).concat("%"));
                break;
            default:
                products =productRepo.getAllByNameContaining(search_key);
        }

        return products;

    }
}
