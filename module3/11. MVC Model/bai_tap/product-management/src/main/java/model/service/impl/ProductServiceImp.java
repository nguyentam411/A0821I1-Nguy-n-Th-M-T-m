package model.service.impl;

import model.bean.Product;
import model.repository.ProductRepository;
import model.repository.ProductRepositoryImp;
import model.service.ProductService;

import java.util.List;

public class ProductServiceImp implements ProductService {
    ProductRepository productRepository = new ProductRepositoryImp();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Product findByName(String name) {
        return null;
    }
}
