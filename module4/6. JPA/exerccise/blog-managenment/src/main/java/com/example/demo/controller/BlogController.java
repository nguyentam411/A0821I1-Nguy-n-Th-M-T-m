package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("")
    public ModelAndView getListBlog() {
        return new ModelAndView("list", "blogs", blogService.findAll());
    }

    @GetMapping("create")
    public ModelAndView getCreatePage() {
        return new ModelAndView("create", "blog", new Blog());
    }

    @PostMapping("/create")
    public String saveBlog(@ModelAttribute Blog blog) {
        if (blog != null) {
            blogService.save(blog);
        }
        return "redirect:/";
    }

    @GetMapping("detail/{id}")
    public ModelAndView getdetailBlog(@PathVariable int id){
        return new ModelAndView("detail","blog",blogService.findById(id));
    }
    @GetMapping("delete/{id}")
    public
}
