package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> findAll();

    Blog getById(int id);

    void save(Blog blog);

    void remove(int id);
}
