package com.example.book_management.service;


import com.example.book_management.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book getById(int id);

    void save(Book book);

    void remove(int id);

}
