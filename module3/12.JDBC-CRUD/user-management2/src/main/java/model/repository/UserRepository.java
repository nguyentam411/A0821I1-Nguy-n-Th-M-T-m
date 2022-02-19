package model.repository;

import model.bean.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    boolean save(User user);
    User update(int id, User user);
    void remove(int id);
    User findById(int id);
}
