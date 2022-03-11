package model.service;

import model.bean.User;
import model.repository.UserRepository;
import model.repository.UserRepositoryImp;

import java.util.List;

public class UserServiceImp implements UserService {
    UserRepository userRepository = new UserRepositoryImp();

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void update(int id, User user) {
        userRepository.update(id, user);
    }

    @Override
    public void remove(int id) {
        userRepository.remove(id);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findByCountry(String country) {
        return userRepository.findByCountry(country);
    }
}
