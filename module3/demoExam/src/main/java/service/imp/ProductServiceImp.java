package service.imp;

import model.Product;
import service.ConnectionDB;
import service.ProductService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImp implements ProductService {
    static ArrayList<Product> productList = new ArrayList<>();
    static final String SELECT_ALL_PRODUCT = "SELECT * FROM demoexam.product; ";
    private static final String INSERT_PRODUCT_SQL = "INSERT INTO product" + "  (name,price,quantity,colorId, categoryId) VALUES " +
            " (?, ?, ?,?,?);";

    private static final String SELECT_PRODUCT_BY_ID = "select id,name,price,quantity,colorId,categoryId from product where id =?";
    private static final String SELECT_PRODUCT_BY_NAME = "select id,name,price,quantity,color,categoryId from product where name =?";
    private static final String DELETE_PRODUCT_SQL = "delete from product where id = ?;";
    private static final String UPDATE_PRODUCT_SQL = "update product set name = ?,price= ?, quantity =?,colorId=?,categoryId=? where id = ?;";
    private final String SEARCH_NAME = "SELECT * FROM product where name like ?;";
    private final String SEARCH_PRICE = "SELECT * FROM product where price like ?;";
    private final String SEARCH_All = "SELECT * FROM product where name like ? and price like ? and colorId like ? and categoryId like ?;";

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        // lấy dữ liệu từ DB => JDBC
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);

            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho select
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("quantity");
                int colorId = Integer.parseInt(resultSet.getString("colorId"));
                int categoryId = resultSet.getInt("categoryId");
                Product product = new Product(id, name, price, quantity, colorId, categoryId);
                productList.add(product);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;

    }

    @Override
    public boolean save(Product product) {

        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL);
            // set param
            preparedStatement.setString(1, product.getName());
            preparedStatement.setFloat(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setInt(4, product.getColorId());
            preparedStatement.setInt(5, product.getCategoryId());
            int check = preparedStatement.executeUpdate(); // dùng cho add, delete,
            if (check != 0) {
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;

    }

    @Override
    public Product update(int id, Product product) {
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_SQL);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setFloat(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setInt(4, product.getColorId());
            preparedStatement.setInt(5, product.getCategoryId());
            preparedStatement.setInt(6, product.getId());
            preparedStatement.executeUpdate();
            return product;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;

    }

    @Override
    public void remove(int id) {
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_SQL);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate(); // dùng cho add, delete,
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public Product findById(int id) {

        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho select
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("quantity");
                int colorId = Integer.parseInt(resultSet.getString("colorId"));
                int categoryId = resultSet.getInt("categoryId");
                Product product = new Product(id, name, price, quantity, colorId, categoryId);
                return product;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Product> findByName(String nameFind) {
        Connection connection = ConnectionDB.getConnection();
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_NAME);
            preparedStatement.setString(1, "%" + nameFind + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("quantity");
                int colorId = Integer.parseInt(resultSet.getString("colorId"));
                int categoryId = resultSet.getInt("categoryId");
                Product product = new Product(id, name, price, quantity, colorId, categoryId);
                productList.add(product);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> findByPrice(int priceFind) {
        Connection connection = ConnectionDB.getConnection();
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_PRICE);
            preparedStatement.setString(1, "%" + priceFind + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("quantity");
                int colorId = Integer.parseInt(resultSet.getString("colorId"));
                int categoryId = resultSet.getInt("categoryId");
                Product product = new Product(id, name, price, quantity, colorId, categoryId);
                productList.add(product);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;

    }

    @Override
    public List<Product> findByAll(String nameFind, int priceFind, int colorIdFind, int categoryIdFind) {
        Connection connection = ConnectionDB.getConnection();
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_All);
            preparedStatement.setString(1, "%" + nameFind + "%");
            preparedStatement.setString(2, "%" + priceFind + "%");
            preparedStatement.setInt(3, Integer.parseInt(("%" + colorIdFind + "%")));
            preparedStatement.setInt(4, Integer.parseInt("%" + categoryIdFind + "%"));
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("quantity");
                int colorId = Integer.parseInt(resultSet.getString("colorId"));
                int categoryId = resultSet.getInt("categoryId");
                Product product = new Product(id, name, price, quantity, colorId, categoryId);
                productList.add(product);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }
}