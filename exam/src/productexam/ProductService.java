package productexam;

import java.io.*;
import java.util.*;

public class ProductService {
    List<Product> productList = new ArrayList<Product>() ;
    List<ProductAuthentic> productAuthenticList = new ArrayList<ProductAuthentic>();
    List<HandGoods> handGoodsList = new ArrayList<HandGoods>();
    private String filePath="src/productexam/product.csv";
  //  private String filePathAuth="src/productexam/productauth.csv";
    ProductService(){
        productList=readFile();
    }

    void add(int choice, Product product) {
        if (choice == 1) {
               productAuthenticList.add((ProductAuthentic) product);
               productList.addAll(productAuthenticList);
        }else {
            handGoodsList.add((HandGoods) product);
            productList.addAll(handGoodsList);
        }
        writeFile(product);



    }

  List<Product> getAll(){
        return productList;
  }
  private void writeFile(Product product){
        try {
            creatFileIfNotExist();
            FileWriter fileWriter=new FileWriter(filePath,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(product.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
  }

  private List<Product> readFile() {
      List<Product> result = new ArrayList<Product>();
      try {
          creatFileIfNotExist();
          FileReader fileReader = new FileReader(filePath);
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          String line;
          while ((line = bufferedReader.readLine()) != null) {
              if (!line.isEmpty()) {
                  String[] strings = line.split(",");
                  Product product = new ProductAuthentic(strings[0], strings[1], strings[2], strings[3]);
                  result.add(product);
              }
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
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

