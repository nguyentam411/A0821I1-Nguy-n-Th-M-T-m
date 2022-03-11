package service.imp;

import model.Category;
import model.Color;
import service.ColorService;
import service.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColorServiceImp implements ColorService {
    static List<Color> colorList = new ArrayList<>();
    static final String SELECT_ALL_COLOR = "SELECT * FROM demoexam.color; ";
    private static final String SELECT_COLOR_BY_ID = "select id,name from color where id =?";

    @Override
    public List<Color> findAll() {
        List<Color> colorList = new ArrayList<>();
        // lấy dữ liệu từ DB => JDBC
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_COLOR);

            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho select
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Color color=new Color(id,name);
                colorList.add(color);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return colorList;


    }

    @Override
    public Color findById(int id) {
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_COLOR_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho select
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Color color=new Color(id,name);
                return color;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
}
}
