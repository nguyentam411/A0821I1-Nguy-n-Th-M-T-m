package productexam.service;

import productexam.model.HandGoods;

import java.util.*;

public interface ProductService<T> {
    /*  List<Product> productList = new ArrayList<Product>();
      private String filePath = "src/productexam/product.csv";

      ProductService() {
       //   productList = readFile();
          productAuthenticList=readFileAuth();
          handGoodsList=readFileHand();
      }

      void add(int choice, Product product) {
          if (choice == 1) {
              productAuthenticList.add((ProductAuthentic) product);
              productList.addAll(productAuthenticList);
              writeFileAuth((ProductAuthentic) product);
          } else {
              handGoodsList.add((HandGoods) product);
              productList.addAll(handGoodsList);
              writeFileHand((HandGoods) product);
          }
       //   writeFile(product);
      }


      List<Product> getProduct() {
          return productList;
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
          List<Product> result = new ArrayList<Product>();
          try {
              creatFileIfNotExist();
              FileReader fileReader = new FileReader(filePath);
              BufferedReader bufferedReader = new BufferedReader(fileReader);
              String line;
              while ((line = bufferedReader.readLine()) != null) {
                  if (!line.isEmpty()) {
                      String[] strings = line.split(",");
                      // Product product = new ProductAuthentic(strings[0], strings[1], strings[2], strings[3]);
                      // result.add(product);
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
  */
    void add(T t);

    List<T> getAll();

    void delete(int id);

    List<T> find(String name);
    void creatFileIfNotExist();
    void writeFile(List<T> tList);
    List<T> readFile();

}

