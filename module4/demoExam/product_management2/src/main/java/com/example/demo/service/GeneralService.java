package com.example.demo.service;

public interface GeneralService<T> {
//    List<T> findAll();
    T getById(int id);
    void save(T t);
    void remove(int id);
}
