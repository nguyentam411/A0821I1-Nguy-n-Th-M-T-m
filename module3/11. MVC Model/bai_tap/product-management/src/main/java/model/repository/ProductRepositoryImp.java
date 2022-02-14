package model.repository;

import model.bean.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImp implements ProductRepository {
    static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "pen", 10, "blue", "abc"));
        productList.add(new Product(2, "book", 15, "no", "aaa"));
        productList.add(new Product(3, "bag", 50, "green", "aaa"));
        productList.add(new Product(4, "pencil", 5, "no", "aaa"));
        productList.add(new Product(5, "ruler", 10, "no", "aaa"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public boolean save(Product product) {
        productList.add(product);
        return true;
    }

    @Override
    public Product update(int id, Product product) {

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId()==id){
                productList.get(i).setName(product.getName());
                productList.get(i).setPrice(product.getPrice());
                productList.get(i).setDescription(product.getDescription());
                productList.get(i).setProducer(product.getProducer());
                return productList.get(i);
            }
        }
        return null;
//        productList.remove(id);
//        productList.add(product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId()==id){
                return productList.get(i);
            }
        }

        return null;
    }

    @Override
    public Product findByName(String name) {
        return null;
    }
}
