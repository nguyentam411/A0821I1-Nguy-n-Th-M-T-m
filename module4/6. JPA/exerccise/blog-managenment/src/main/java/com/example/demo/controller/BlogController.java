package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    public ModelAndView getdetailBlog(@PathVariable int id) {
        return new ModelAndView("detail", "blog", blogService.getById(id));
    }

    @GetMapping("delete/{id}")
    public ModelAndView getDeletePage(@PathVariable int id) {
        return new ModelAndView("delete", "blog", blogService.getById(id));
    }

    @PostMapping("delete")
    public String deleteBlog(@RequestParam Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:/";
    }
    @GetMapping("edit/{id}")
    public  ModelAndView getEditPage(@PathVariable int id){
        return new ModelAndView("edit","blog",blogService.getById(id));
    }
//    @PostMapping("edit")
//    public String updateBlog(@ModelAttribute Blog blog) {
//            blogService.;
//        return "redirect:/";
//    }

}
