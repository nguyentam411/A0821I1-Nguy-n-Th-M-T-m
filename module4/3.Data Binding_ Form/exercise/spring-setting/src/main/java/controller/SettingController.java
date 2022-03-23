package controller;

import model.Language;
import model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.LanguageService;
import service.SettingService;

import java.util.List;

@Controller
public class SettingController {
    private static Setting setting= new Setting();

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("config")
    public ModelAndView config(){
        ModelAndView modelAndView= new ModelAndView("update", "setting", setting);
        return modelAndView;
    }

    @PostMapping("update")
    public String save(Setting s){
        setting= s;
        return "home";
    }
    /*LanguageService languageService=new LanguageService();
    SettingService settingService=new SettingService();
    @GetMapping("")
    public String returnHome(){return "home";}
    @PostMapping("/setting")
    public String setting(){return "update";}
    @ModelAttribute("languageList")
    public List<Language> getLanguage(){return languageService.getAll(); }
    @ModelAttribute("setList")
    public List<Setting> getSetting(){return settingService.getAll(); }
    @PostMapping("/update")
    public String saveSetting(@ModelAttribute Setting setting) {
//        if(setting== null){
//            setting= new Setting();
//        }
//        model.addAttribute("setting", setting);
        settingService.update(setting);
        return "redirect:/home";
    }*/
}
