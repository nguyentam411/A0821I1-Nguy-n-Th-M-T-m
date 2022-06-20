package com.example.demo.controller;

import com.example.demo.model.QuestionContent;
import com.example.demo.service.QuestionContentService;
import com.example.demo.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    QuestionTypeService questionTypeService;
    @Autowired
    QuestionContentService questionContentService;
    @GetMapping("")
    public String getList(@PageableDefault(size = 5) Pageable pageable, Model model) {
        Page<QuestionContent> questionContents = questionContentService.getAll(pageable);
        boolean isASC = false;
        Sort sort = questionContents.getSort();

        if (sort.isSorted()) {
            isASC = "asc".equalsIgnoreCase(sort.toString().split(":")[1].trim());
        }
        model.addAttribute("reverseSortDir", isASC ? "desc" : "asc");
        model.addAttribute("questionContents", questionContents);

        return "list";
    }
    @GetMapping("create")
    public ModelAndView getCreatePage(Model model) {
        model.addAttribute("questionTypes", questionTypeService.findAll());
//        model.addAttribute("times", LocalDateTime.now());
        return new ModelAndView("create", "questionContent", new QuestionContent());
    }

    @PostMapping("/create")
    public String save(@Validated @ModelAttribute QuestionContent questionContent, BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("questionTypes", questionTypeService.findAll());
            return "create";

        } else {

            if (questionContent.getTitle() != "") {
                questionContentService.save(questionContent);
                redirect.addFlashAttribute("message", "Create new question successfully!");
            }
            return "redirect:/";
        }
    }
    @GetMapping("delete/{id}")
    public ModelAndView getDeletePage(@PathVariable int id, Model model) {
        model.addAttribute("questionTypes", questionTypeService.findAll());

        return new ModelAndView("delete", "questionContent", questionContentService.getById(id));
    }

    @PostMapping("/delete")
    public String delete(QuestionContent questionContent, RedirectAttributes redirect) {
        questionContentService.remove(questionContent.getId());
        redirect.addFlashAttribute("message", "Removed question successfully!");
        return "redirect:/";
    }
    @GetMapping("/search")
    public ModelAndView searchByName(@RequestParam("search_key") Optional<String> search_key, @RequestParam("search_by") String search_by, Model model,
                                     @PageableDefault(size = 5) Pageable pageable) {
        Page<QuestionContent> questionContents;
        if (!search_key.equals(null)) {
            model.addAttribute("search_key", search_key.get());
            model.addAttribute("search_by", search_by);
            questionContents=questionContentService.search(search_key.get(),search_by,pageable);
        } else {
            model.addAttribute("search_key", "");
            questionContents = questionContentService.getAll(pageable);
        }
        return new ModelAndView("list", "questionContents", questionContents);
    }
    @GetMapping("detail/{id}")
    public ModelAndView getdetail(@PathVariable int id) {
        return new ModelAndView("detail", "questionContent", questionContentService.getById(id));
    }
    @GetMapping("edit/{id}")
    public ModelAndView getEditPage(@PathVariable int id, Model model) {
        model.addAttribute("questionTypes", questionTypeService.findAll());
        return new ModelAndView("edit", "questionContent", questionContentService.getById(id));
    }

    @PostMapping("/edit")
    public String update(@Validated @ModelAttribute QuestionContent questionContent, BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("questionTypes", questionTypeService.findAll());
            return "edit";

        } else {

            if (questionContent.getTitle() != "") {
                questionContentService.save(questionContent);
                redirect.addFlashAttribute("message", "Update question successfully!");
            }
            return "redirect:/";
        }

    }

}
