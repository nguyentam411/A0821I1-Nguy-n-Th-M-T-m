package com.example.book_management.service;

import com.example.book_management.model.Book;
import com.example.book_management.model.BookBorrow;
import com.example.book_management.repository.BookBorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookBorrowServiceImpl implements BookBorrowService {
    @Autowired
    BookBorrowRepository bookBorrowRepository;

    @Override
    public List<BookBorrow> findAll() {
        return bookBorrowRepository.findAll();
    }

    @Override
    public BookBorrow getById(int id) {
        return bookBorrowRepository.getById(id);
    }

    @Override
    public void save(Book bookBorrow) {
        BookBorrow borrow= new BookBorrow();
        borrow.setId_book(bookBorrow.getId());
        double num=Math.random()*(99999-10000+1)+10000;
        borrow.setId_book_borrow((int) num);
        bookBorrowRepository.save(borrow);
    }

    @Override
    public void remove(int id) {
        bookBorrowRepository.deleteById(id);
    }
}
