package service;

import model.Category;
import model.Product;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(int id);

}
