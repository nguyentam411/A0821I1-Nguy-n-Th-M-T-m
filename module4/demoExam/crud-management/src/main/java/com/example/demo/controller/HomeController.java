package com.example.demo.controller;

import com.example.demo.model.GiaoDich;
import com.example.demo.service.GiaoDichService;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
public class HomeController {
    @Autowired
    GiaoDichService giaoDichService;
    @Autowired
    KhachHangService khachHangService;
    @GetMapping("")
    public ModelAndView getListBlog() {
        return new ModelAndView("list", "giaoDichs", giaoDichService.findAll());
    }
    @GetMapping("detail/{id}")
    public ModelAndView getdetail(@PathVariable int id) {
        return new ModelAndView("detail", "giaoDich", giaoDichService.getById(id));
    }
    @GetMapping("delete/{id}")
    public ModelAndView getDeletePage(@PathVariable int id) {
        return new ModelAndView("delete", "giaoDich", giaoDichService.getById(id));
    }

    @PostMapping("/delete")
    public String deleteBlog(GiaoDich giaoDich, RedirectAttributes redirect) {
        giaoDichService.remove(giaoDich.getId());
        redirect.addFlashAttribute("message", "Removed customer successfully!");
        return "redirect:/";
    }
    @GetMapping("create")
    public ModelAndView getCreatePage(Model model) {
        model.addAttribute("khachHangs",khachHangService.findAll());
        return new ModelAndView("create", "giaoDich", new GiaoDich());
    }

    @PostMapping("/create")
    public String saveBlog(@ModelAttribute GiaoDich giaoDich, RedirectAttributes redirect) {
        if (giaoDich.getMa_giao_dich() != "") {
            giaoDichService.save(giaoDich);
            redirect.addFlashAttribute("message", "Create new customer successfully!");
        }
        return "redirect:/";
    }

    @GetMapping("edit/{id}")
    public ModelAndView getEditPage(@PathVariable int id, Model model) {
        model.addAttribute("khachHangs", khachHangService.findAll());
        return new ModelAndView("edit", "giaoDich", giaoDichService.getById(id));
    }

    @PostMapping("/edit")
    public String update(@Validated @ModelAttribute GiaoDich giaoDich, BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("khachHangs", khachHangService.findAll());
            return "edit";

        } else {

            if (giaoDich.getMa_giao_dich() != "") {
                giaoDichService.save(giaoDich);
                redirect.addFlashAttribute("message", "Update product successfully!");
            }
            return "redirect:/";
        }

    }
    @GetMapping("/search")
    public ModelAndView searchByName(@RequestParam("search_key") Optional<String> search_key, @RequestParam("search_by") String search_by, Model model) {
        List<GiaoDich> giaoDichs;
        if (!search_key.equals(null)) {
            model.addAttribute("search_key", search_key.get());
            model.addAttribute("search_by", search_by);
            giaoDichs=giaoDichService.search(search_key.get(),search_by);
        } else {
            model.addAttribute("search_key", "");
            giaoDichs=giaoDichService.findAll();
        }
        return new ModelAndView("list", "giaoDichs", giaoDichs);
    }

}
