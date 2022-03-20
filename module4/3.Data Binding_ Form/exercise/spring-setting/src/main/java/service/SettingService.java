package service;

import model.Setting;

import java.util.ArrayList;
import java.util.List;

public class SettingService {
    private static List<Setting> setList;

    static {
        setList=new ArrayList<>();
        setList.add(new Setting(1, 25, true, "abc"));
    }

    public List<Setting> getAll() {
        return setList;
    }
    public void update(Setting setting){
        setList.get(0).setLanguages(setting.getLanguages());
        setList.get(0).setPageSize(setting.getPageSize());
        setList.get(0).setSpamsFilter(setting.isSpamsFilter());
        setList.get(0).setSignature(setting.getSignature());

    }
}
