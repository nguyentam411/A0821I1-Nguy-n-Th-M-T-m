package service;

import model.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageService {
    private static List<Language> languageList;

    static {
        languageList=new ArrayList<>();
        languageList.add(new Language(1, "English"));
        languageList.add(new Language(2, "Vietnamese"));
        languageList.add(new Language(3, "Japanese"));
        languageList.add(new Language(4, "Chinese"));
    }

    public List<Language> getAll() {
        return languageList;
    }
}
