package module2._17_IO_BinaryFile_Serialzation.exercise.e1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private static List<Product> productList = new ArrayList<Product>();

    static void creat(Product product) throws IOException {
        productList.add(product);
        writeToFile("src/module2/_17_IO_BinaryFile_Serialzation/exercise/e1/Product.txt",productList);
    }

    static void display() throws IOException, ClassNotFoundException {
//        for (int i = 0; i < productList.size(); i++) {
//            System.out.println(productList.get(i));
//        }
        List<Product> productDataFromFile=readDataFromFile("src/module2/_17_IO_BinaryFile_Serialzation/exercise/e1/Product.txt");
        for (Product product:productDataFromFile){
            System.out.println(product);
        }
    }

    static void search(String name) {
        List<Product> res = new ArrayList<Product>();
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            if (productList.get(i).getName().contains(name)) {
                res.add(productList.get(i));
            }
        }
        System.out.println(res);
    }

    public static void writeToFile(String path, List<Product> productList) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) throws IOException, ClassNotFoundException {
        List<Product> productList = new ArrayList<Product>();
        try {
           FileInputStream fis = new FileInputStream(path);
           ObjectInputStream ois = new ObjectInputStream(fis);
           productList = (List<Product>) ois.readObject();
           fis.close();
           ois.close();
       }catch (Exception ex){
           ex.printStackTrace();
       }
        return productList;
    }
}
