package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"a",100,"abc","abc"));
        products.put(2,new Product(2,"b",200,"abc","abc"));
        products.put(3,new Product(3,"c",300,"abc","abc"));
        products.put(4,new Product(4,"d",200,"abc","abc"));
        products.put(5,new Product(5,"e",100,"abc","abc"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList=new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (name.equals(products.get(i).getName())){
                productList.add(products.get(i));
            }
        }
        return productList;
    }
}
