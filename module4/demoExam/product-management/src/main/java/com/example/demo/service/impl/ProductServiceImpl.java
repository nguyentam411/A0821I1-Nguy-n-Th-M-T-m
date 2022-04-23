package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

//    @PersistenceContext
//    private EntityManager em;

//    @Override
//    public List<Blog> findAll() {
//        return blogRepossitory.findAll();
//    }

//    @Override
//    public Blog getById(int id) {
//        return blogRepository.getById(id);
//    }
//
//    @Override
//    public void save(Blog blog) {
//        blogRepository.save(blog);
//    }
//
//    @Override
//    public void remove(int id) {
//        blogRepository.deleteById(id);
//    }
//
    @Override
    public Page<Product> getAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

//    @Override
//    public Page<Product> searchByName(String name, Pageable pageable) {
//        return productRepository.getAllByNameContaining(name, pageable);

//    }
}
