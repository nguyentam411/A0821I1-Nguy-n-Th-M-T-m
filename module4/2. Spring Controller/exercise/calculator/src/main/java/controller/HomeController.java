package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping()
    public String calculator() {
        return "index";
    }

    @PostMapping("/result")
    public String addition(@RequestParam int num1,
                           @RequestParam int num2,
                           @RequestParam String calculation,
                           Model model){
        double result;
        switch (calculation){
            case "add":
                result=num1+num2;
                break;
            case "sub":
                result=num1-num2;
                break;
            case "mul":
                result=num1*num2;
                break;
            case "div":
                result=num1/num2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + calculation);
        }
        model.addAttribute("result",result);
        model.addAttribute("calculation",calculation);
        return "index";
    }
}
