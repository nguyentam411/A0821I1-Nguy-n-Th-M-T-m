package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepossitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepossitory blogRepossitory;

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blog> findAll() {
        return blogRepossitory.findAll();
    }

    @Override
    public Blog getById(int id) {
        return blogRepossitory.getById(id);
    }

    @Override
    public void save(Blog blog) {

        blogRepossitory.save(blog);
    }

    @Override
    public void remove(int id) {
        blogRepossitory.deleteById(id);
    }
}
