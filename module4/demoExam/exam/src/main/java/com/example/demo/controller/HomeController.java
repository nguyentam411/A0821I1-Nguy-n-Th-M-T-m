package com.example.demo.controller;

import com.example.demo.model.giao_dich;
import com.example.demo.service.GiaodichService;
import com.example.demo.service.KhachhangService;
import com.example.demo.service.LoaidichvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    @Autowired
    GiaodichService giaodichService;
    @Autowired
    LoaidichvuService loaidichvuService;
    @Autowired
    KhachhangService khachhangService;

    @GetMapping("")
    public ModelAndView getList(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("list", "giao_dichs", giaodichService.getAll(pageable));
    }
    @GetMapping("create")
    public ModelAndView getCreatePage(Model model) {
        model.addAttribute("loaidichvu", loaidichvuService.findAll());
//        model.addAttribute("times", LocalDateTime.now());
        return new ModelAndView("create", "giao_dich", new giao_dich());
    }


    @GetMapping("detail/{id}")
    public ModelAndView getdetail(@PathVariable int id, Model model) {
        model.addAttribute("loaidichvu", loaidichvuService.findAll());
        return new ModelAndView("detail", "giaodich", giaodichService.getById(id));
    }
    @GetMapping("delete/{id}")
    public ModelAndView getDeletePage(@PathVariable int id, Model model) {
        model.addAttribute("loaidichvu", loaidichvuService.findAll());

        return new ModelAndView("delete", "giaodich", giaodichService.getById(id));
    }

    @PostMapping("/delete")
    public String delete(giao_dich giao_dich, RedirectAttributes redirect) {
        giaodichService.remove(giao_dich.getId());
        redirect.addFlashAttribute("message", "Removed product successfully!");
        return "redirect:/";
    }

}
