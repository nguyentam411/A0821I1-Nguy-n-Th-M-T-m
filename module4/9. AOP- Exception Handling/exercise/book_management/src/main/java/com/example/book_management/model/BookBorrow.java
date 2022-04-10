package com.example.book_management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookBorrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_book;
    private Integer id_book_borrow;
    public BookBorrow() {
    }

    public BookBorrow(Integer id, Integer id_book, Integer id_book_borrow) {
        this.id = id;
        this.id_book = id_book;
        this.id_book_borrow = id_book_borrow;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_book() {
        return id_book;
    }

    public void setId_book(Integer id_book) {
        this.id_book = id_book;
    }

    public Integer getId_book_borrow() {
        return id_book_borrow;
    }

    public void setId_book_borrow(Integer id_book_borrow) {
        this.id_book_borrow = id_book_borrow;
    }
}
