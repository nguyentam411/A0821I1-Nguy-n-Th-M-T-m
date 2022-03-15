package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping()
    public String result() {
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam String condiment,
                       Model model) {
        String result = condiment;
        model.addAttribute("result", result);
        return "index";
    }
}
