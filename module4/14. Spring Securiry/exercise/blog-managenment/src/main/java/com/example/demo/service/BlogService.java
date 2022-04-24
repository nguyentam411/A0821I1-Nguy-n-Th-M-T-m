package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface BlogService extends GeneralService<Blog>{
    Page<Blog> getAll(Pageable pageable);
    Page<Blog> searchByName(String name, Pageable pageable);


//    List<Blog> findAll();
//
//    Blog getById(int id);
//
//    void save(Blog blog);
//
//    void remove(int id);
}
