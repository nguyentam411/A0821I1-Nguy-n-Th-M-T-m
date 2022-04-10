package com.example.book_management.service;

import com.example.book_management.model.Book;
import com.example.book_management.model.BookBorrow;

import java.util.List;

public interface BookBorrowService {
    List<BookBorrow> findAll();

    BookBorrow getById(int id);

    void save(Book bookBorrow);

    void remove(int id);

}
