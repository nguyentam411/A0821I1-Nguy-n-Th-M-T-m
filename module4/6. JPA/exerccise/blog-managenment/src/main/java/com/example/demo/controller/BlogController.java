package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String saveBlog(@ModelAttribute Blog blog, RedirectAttributes redirect) {
        if (blog.getName() != "") {
            blogService.save(blog);
            redirect.addFlashAttribute("message", "Create new customer successfully!");
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

    @PostMapping("/delete")
    public String deleteBlog(Blog blog , RedirectAttributes redirect) {
        blogService.remove(blog.getId());
        redirect.addFlashAttribute("message", "Removed customer successfully!");
        return "redirect:/";
    }
    @GetMapping("edit/{id}")
    public ModelAndView getEditPage(@PathVariable int id) {
        return new ModelAndView("edit", "blog", blogService.getById(id));
    }

    @PostMapping("/edit")
    public String updateBlog(@ModelAttribute Blog blog, RedirectAttributes redirect) {
        blogService.save(blog);
        redirect.addFlashAttribute("message", "Update customer successfully!");
        return "redirect:/";
    }

}
