package com.example.productmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.productmanagement.service.ProductService;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("")
    public ModelAndView getListBlog(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("list", "products", productService.getAll(pageable));
    }

}
