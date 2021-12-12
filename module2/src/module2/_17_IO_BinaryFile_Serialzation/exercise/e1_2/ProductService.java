package module2._17_IO_BinaryFile_Serialzation.exercise.e1_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> productList = new ArrayList<Product>();
    private String filePath = "src/module2/_17_IO_BinaryFile_Serialzation/exercise/e1_2/product.csv";

    void creat(Product newProduct)  {
        writeFile(newProduct);
        productList.add(newProduct);
    }

    List<Product> getAll()  {
        return productList;
        // List<Product> productList=readFile();
    }

    ProductService() {
        productList = readFile();
    }

    void search(String name)  {
        List<Product> res = new ArrayList<>();
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            if (productList.get(i).getName().contains(name)) {
                res.add(productList.get(i));
            }
        }
        System.out.println(res);
    }

    private void writeFile(Product product) {
        try {
            creatFileIfNotExist();
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(product.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Product> readFile() {
        List<Product> result = new ArrayList<>();
        try {
            creatFileIfNotExist();
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
//        productList = new ArrayList<Product>();
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] strings = line.split(",");
                    Product product = new Product(Integer.parseInt(strings[0]), strings[1], strings[2], Integer.parseInt(strings[3]), strings[4]);
                    result.add(product);
//            String[] strings = line.split(",");
//            Product product=new Product(strings[0],strings[1]);
//            productList.add(product);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
//        for(Product product:productList){
//            System.out.println(product);
//        }
        return result;
    }

    private void creatFileIfNotExist() {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
