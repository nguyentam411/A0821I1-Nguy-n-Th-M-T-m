package controller;

import model.Language;
import model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.LanguageService;
import service.SettingService;

import java.util.List;

@Controller
public class SettingController {
    LanguageService languageService=new LanguageService();
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
        settingService.update(setting);
        return "redirect:/update";
    }
}
