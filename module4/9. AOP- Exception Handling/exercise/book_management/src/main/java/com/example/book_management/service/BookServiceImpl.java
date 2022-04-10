package com.example.book_management.service;

import com.example.book_management.model.Book;
import com.example.book_management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getById(int id) {
        return bookRepository.getById(id);
    }

    @Override
    public void save(Book book) {
        book.setAmount(1);
        bookRepository.save(book);
    }

    @Override
    public void remove(int id) {
        bookRepository.deleteById(id);
    }
}
