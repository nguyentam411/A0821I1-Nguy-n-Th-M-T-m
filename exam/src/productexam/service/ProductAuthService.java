package productexam.service;

import productexam.model.HandGoods;
import productexam.model.ProductAuthentic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductAuthService implements ProductService<ProductAuthentic> {
    List<ProductAuthentic> productAuthenticList = new ArrayList<ProductAuthentic>();
    private String filePathAuth = "src/productexam/productauth.csv";

    public ProductAuthService() {
        productAuthenticList = readFile();
    }

    @Override
    public void add(ProductAuthentic productAuthentic) {
        productAuthentic.setId(productAuthenticList.size() + 1);
        productAuthenticList.add(productAuthentic);
        writeFile(productAuthenticList);
    }


    @Override
    public List<ProductAuthentic> getAll() {
        return productAuthenticList;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productAuthenticList.size(); i++) {
            if (productAuthenticList.get(i).getId() == id) {
                productAuthenticList.remove(i);
            }
        }
        for (int j = id - 1; j < productAuthenticList.size(); j++) {
            productAuthenticList.get(j).setId(j + 1);
        }
        writeFile(productAuthenticList);
    }

    @Override
    public List<ProductAuthentic> find(String name) {
        List<ProductAuthentic> result = new ArrayList<ProductAuthentic>();
        for (int i = 0; i < productAuthenticList.size(); i++) {
            if (productAuthenticList.get(i).getName().contains(name)) {
                result.add(productAuthenticList.get(i));
            }
        }
        return result;
    }

    @Override
    public void creatFileIfNotExist() {
        File file = new File(filePathAuth);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeFile(List<ProductAuthentic> productAuthenticList) {
        try {
            creatFileIfNotExist();
            FileWriter fileWriter = new FileWriter(filePathAuth);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < productAuthenticList.size(); i++) {
                bufferedWriter.write(productAuthenticList.get(i).toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ProductAuthentic> readFile() {
        List<ProductAuthentic> result = new ArrayList<ProductAuthentic>();
        try {
            creatFileIfNotExist();
            FileReader fileReader = new FileReader(filePathAuth);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] strings = line.split(",");
                    ProductAuthentic productAuthentic = new ProductAuthentic(Integer.parseInt(strings[0]), strings[1], Integer.parseInt(strings[2]), strings[3], strings[4]);
                    result.add(productAuthentic);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
