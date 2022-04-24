package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public ModelAndView getListBlog(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("list", "blogs", blogService.getAll(pageable));
    }
    @GetMapping("/user")
    public ModelAndView user(Principal principal) {
        // Get authenticated user name from Principal
        System.out.println(principal.getName());
        return new ModelAndView("/user");
    }

    @GetMapping("/admin")
    public ModelAndView admin() {
        // Get authenticated user name from SecurityContext
        SecurityContext context = SecurityContextHolder.getContext();
        System.out.println(context.getAuthentication().getName());
        return new ModelAndView("/admin");
    }

    @GetMapping("create")
    public ModelAndView getCreatePage(Model model) {
        model.addAttribute("categories", categoryService.findAll());
//        model.addAttribute("times", LocalDateTime.now());
        return new ModelAndView("create", "blog", new Blog());
    }

    @PostMapping("/create")
    public String saveBlog(@ModelAttribute Blog blog, RedirectAttributes redirect) {
        if (blog.getName() != "") {
            blogService.save(blog);
            redirect.addFlashAttribute("message", "Create new customer successfully!");
        }
        return "redirect:/";
    }

    @GetMapping("detail/{id}")
    public ModelAndView getdetailBlog(@PathVariable int id, Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return new ModelAndView("detail", "blog", blogService.getById(id));
    }

    @GetMapping("delete/{id}")
    public ModelAndView getDeletePage(@PathVariable int id, Model model) {
        model.addAttribute("categories", categoryService.findAll());

        return new ModelAndView("delete", "blog", blogService.getById(id));
    }

    @PostMapping("/delete")
    public String deleteBlog(Blog blog, RedirectAttributes redirect) {
        blogService.remove(blog.getId());
        redirect.addFlashAttribute("message", "Removed customer successfully!");
        return "redirect:/";
    }

    @GetMapping("edit/{id}")
    public ModelAndView getEditPage(@PathVariable int id, Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return new ModelAndView("edit", "blog", blogService.getById(id));
    }

    @PostMapping("/edit")
    public String updateBlog(@ModelAttribute Blog blog, RedirectAttributes redirect) {
        blogService.save(blog);
        redirect.addFlashAttribute("message", "Update customer successfully!");
        return "redirect:/";
    }
    @GetMapping("/search")
    public ModelAndView searchByName(@RequestParam("search_key") Optional<String> search_key, Model model, @PageableDefault(size = 5) Pageable pageable) {
        Page<Blog> blogs;
        if (search_key.isPresent()) {
            model.addAttribute("search_key", search_key.get());
            blogs = blogService.searchByName(search_key.get(), pageable);
        }else {
            model.addAttribute("search_key", "");
            blogs = blogService.getAll(pageable);
        }
        return new ModelAndView("list", "blogs", blogs);
    }

}
