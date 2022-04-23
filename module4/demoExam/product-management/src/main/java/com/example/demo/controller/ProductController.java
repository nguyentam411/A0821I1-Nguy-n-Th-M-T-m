package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("")
    public ModelAndView getListProduct(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("list", "products", productService.getAll(pageable));
    }
//    @GetMapping("/search")
//    public ModelAndView searchByName(@RequestParam("search_key") Optional<String> search_key, Model model, @PageableDefault(size = 5) Pageable pageable) {
//        Page<Product> products;
//        if (search_key.isPresent()) {
//            model.addAttribute("search_key", search_key.get());
//            products = productService.searchByName(search_key.get(), pageable);
//        }else {
//            model.addAttribute("search_key", "");
//            products = productService.getAll(pageable);
//        }
//        return new ModelAndView("list", "products", products);
//    }

}
