package com.example.productmanagement.controller;

import com.example.productmanagement.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.productmanagement.service.ProductService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("")
    public ModelAndView getListBlog() {
        return new ModelAndView("list", "blogs", productService.findAll());
    }

    @GetMapping("create")
    public ModelAndView getCreatePage() {
        return new ModelAndView("create", "product", new Product());
    }

    @PostMapping("/create")
    public String saveBlog(@ModelAttribute Product product, RedirectAttributes redirect) {
        if (product.getName() != "") {
            productService.save(product);
            redirect.addFlashAttribute("message", "Create new product successfully!");
        }
        return "redirect:/";
    }

    @GetMapping("delete/{id}")
    public ModelAndView getDeletePage(@PathVariable int id) {
        return new ModelAndView("delete", "product", productService.getById(id));
    }

    @PostMapping("/delete")
    public String deleteProduct(Product product , RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("message", "Removed product successfully!");
        return "redirect:/";
    }
    @GetMapping("edit/{id}")
    public ModelAndView getEditPage(@PathVariable int id) {
        return new ModelAndView("edit", "product", productService.getById(id));
    }

    @PostMapping("/edit")
    public String updateBlog(@ModelAttribute Product product, RedirectAttributes redirect) {
        productService.save(product);
        redirect.addFlashAttribute("message", "Update product successfully!");
        return "redirect:/";
    }

}
