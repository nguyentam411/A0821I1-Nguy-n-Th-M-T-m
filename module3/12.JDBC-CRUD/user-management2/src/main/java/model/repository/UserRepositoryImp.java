package model.repository;

import model.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImp implements UserRepository {
    static ArrayList<User> userList = new ArrayList<>();
    static final String SELECT_ALL_USER = "SELECT * FROM demo.users; ";

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        // lấy dữ liệu từ DB => JDBC
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USER);

            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho select
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(id, name, email, country);
                userList.add(user);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public boolean save(User user) {
        userList.add(user);
        return true;
    }

    @Override
    public User update(int id, User user) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.get(i).setName(user.getName());
                userList.get(i).setEmail(user.getEmail());
                userList.get(i).setCountry(user.getCountry());
                return userList.get(i);
            }
        }
        return null;
    }

    @Override
    public void remove(int id) {
        userList.remove(id);
    }

    @Override
    public User findById(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                return userList.get(i);
            }
        }
        return null;
    }
}
