package service;

import model.Category;
import model.Color;

import java.util.List;

public interface ColorService {
    List<Color> findAll();
    Color findById(int id);

}
