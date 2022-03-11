package model.service;

import model.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    boolean save(User user);
    void update(int id,User user);
    void remove(int id);
    User findById(int id);
    List<User> findByCountry(String country);
}
