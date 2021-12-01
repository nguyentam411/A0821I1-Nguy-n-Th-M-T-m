package module2._12_Java_Collection_Framework.exercise.e1_2;

import module2._12_Java_Collection_Framework.exercise.e1_2.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {
    private List<Product> products=new ArrayList<Product>();
    void save(Product product){
        if (product.getId()==0){
            product.setId(products.size()+1);
            products.add(product);
        }else {
            int size=products.size();
            for (int i = 0; i < size; i++) {
                if (products.get(i).getId()== product.getId()){
                    products.set(i,product);
                    break;
                }
            }
        }
    }
    void delete(final int id){
        products.removeIf(e->e.getId()== id);
    }
    List<Product> getAll(){
        return products;
    }
    List<Product> search(String name){
        List<Product> res=new ArrayList<Product>();
        int size= products.size();
        for (int i = 0; i < size; i++) {
            if (products.get(i).getName().contains(name)){
                res.add(products.get(i));
            }
        }
        return res;
    }
    void sort(boolean isASC){
        products.sort(isASC? Comparator.comparing(Product::getPrice):Comparator.comparing(Product::getPrice).reversed());
    }
}
