package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @PersistenceContext
    private EntityManager em;

//    @Override
//    public List<Blog> findAll() {
//        return blogRepossitory.findAll();
//    }

    @Override
    public Blog getById(int id) {
        return blogRepository.getById(id);
    }

    @Override
    public void save(Blog blog) {
            blogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> getAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> searchByName(String name, Pageable pageable) {
        return blogRepository.getAllByNameContaining(name, pageable);

    }
}
