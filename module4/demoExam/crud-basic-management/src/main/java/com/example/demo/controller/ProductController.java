package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("")
    public ModelAndView getListBlog() {
        return new ModelAndView("list", "products", productService.findAll());
    }
    @GetMapping("create")
    public ModelAndView getCreatePage(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return new ModelAndView("create", "product", new Product());
    }

    @PostMapping("/create")
    public String save(@Validated @ModelAttribute Product product, BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("categories", categoryService.findAll());
            return "create";

        } else {

            if (product.getName() != "") {
                productService.save(product);
                redirect.addFlashAttribute("message", "Create new product successfully!");
            }
            return "redirect:/";
        }
    }
    @GetMapping("delete/{id}")
    public ModelAndView getDeletePage(@PathVariable int id, Model model) {
        model.addAttribute("categories", categoryService.findAll());

        return new ModelAndView("delete", "product", productService.getById(id));
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("message", "Removed product successfully!");
        return "redirect:/";
    }
    @GetMapping("edit/{id}")
    public ModelAndView getEditPage(@PathVariable int id, Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return new ModelAndView("edit", "product", productService.getById(id));
    }

    @PostMapping("/edit")
    public String update(@Validated @ModelAttribute Product product, BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("categories", categoryService.findAll());
            return "edit";

        } else {

            if (product.getName() != "") {
                productService.save(product);
                redirect.addFlashAttribute("message", "Update product successfully!");
            }
            return "redirect:/";
        }

    }
    @GetMapping("/search")
    public ModelAndView searchByName(@RequestParam("search_key") String search_key, @RequestParam("search_by") String search_by, Model model) {
        List<Product> products;
        if (!search_key.equals(null)) {
            model.addAttribute("search_key", search_key);
            model.addAttribute("search_by", search_by);
            products=productService.search(search_key,search_by);
        } else {
            model.addAttribute("search_key", "");
            model.addAttribute("search_by", search_by);
            products=productService.findAll();
        }
        return new ModelAndView("list", "products", products);
    }

}
