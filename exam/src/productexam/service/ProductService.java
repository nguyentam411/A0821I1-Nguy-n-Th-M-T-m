package productexam.service;

import productexam.model.HandGoods;

import java.util.*;

public interface ProductService<T> {
    void add(T t);

    List<T> getAll();

    void delete(int id);

    List<T> find(String name);
    void creatFileIfNotExist();
    void writeFile(List<T> tList);
    List<T> readFile();

}

