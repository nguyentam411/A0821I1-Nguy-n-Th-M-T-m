package com.example.book_management.repository;

import com.example.book_management.model.BookBorrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookBorrowRepository extends JpaRepository<BookBorrow,Integer> {
}
