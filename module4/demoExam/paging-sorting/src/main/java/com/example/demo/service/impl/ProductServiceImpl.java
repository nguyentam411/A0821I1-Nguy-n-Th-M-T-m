package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

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
    public Page<Product> getAll(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    @Override
    public Page<Product> searchByName(String name, Pageable pageable) {
        return productRepo.getAllByNameContaining(name,pageable);
    }

    @Override
    public Page<Product> searchByCate(String cate, Pageable pageable) {
        return productRepo.findByCategoryName(cate, pageable);
    }

    @Override
    public Page<Product> searchByPrice(double price, Pageable pageable) {
        return productRepo.getAllByPriceGreaterThanEqual(price, pageable);
    }

    @Override
    public Page<Product> search(String search_key, String search_by, Pageable pageable) {
        Page<Product> products;

        switch (search_by) {
            case ("name"):
                products =productRepo.getAllByNameContaining(search_key,pageable);
                break;
            case ("price"):
                products = productRepo.getAllByPriceGreaterThanEqual(Double.parseDouble(search_key),pageable);
                break;
            case ("category"):
                products = productRepo.findByCategoryName("%".concat(search_key).concat("%"),pageable);
                break;
            default:
                products =productRepo.getAllByNameContaining(search_key,pageable);
        }

        return products;
    }
}
