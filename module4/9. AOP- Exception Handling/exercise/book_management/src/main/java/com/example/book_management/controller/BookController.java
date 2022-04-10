package com.example.book_management.controller;

import com.example.book_management.model.Book;
import com.example.book_management.model.BookBorrow;
import com.example.book_management.service.BookBorrowService;
import com.example.book_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    BookBorrowService bookBorrowService;
    @GetMapping("")
    private ModelAndView getListBook(){
        return new ModelAndView("list","books",bookService.findAll());
    }
    @GetMapping("detail/{id}")
    public ModelAndView getDetailBook(@PathVariable int id){
    return new ModelAndView("detail","book",bookService.getById(id));
    }
    @GetMapping("borrow/{id}")
    public ModelAndView getBorrowPage(@PathVariable int id){
        return new ModelAndView("borrow","book",bookService.getById(id));
    }
    @PostMapping("/borrow")
    public String borrowBook(@ModelAttribute Book book, RedirectAttributes redirectAttributes){
        bookService.save(book);
        bookBorrowService.save(book);
        redirectAttributes.addFlashAttribute("message", "Borrow book successfully!");
        return "redirect:/";

    }
}
