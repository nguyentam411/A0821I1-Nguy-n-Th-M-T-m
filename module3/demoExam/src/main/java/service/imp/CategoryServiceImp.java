package service.imp;

import model.Category;
import model.Product;
import service.CategoryService;
import service.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImp implements CategoryService {
    static List<Category> categoryList = new ArrayList<>();
    static final String SELECT_ALL_CATEGORY = "SELECT * FROM demoexam.category; ";
    private static final String SELECT_CATEGORY_BY_ID = "select id,name from category where id =?";


    @Override
    public List<Category> findAll() {
        List<Category> categoryList = new ArrayList<>();
        // lấy dữ liệu từ DB => JDBC
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CATEGORY);

            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho select
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Category category = new Category(id, name);
                categoryList.add(category);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categoryList;


    }

    @Override
    public Category findById(int id) {
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CATEGORY_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho select
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Category category=new Category(id,name);
                return category;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;


    }
}
