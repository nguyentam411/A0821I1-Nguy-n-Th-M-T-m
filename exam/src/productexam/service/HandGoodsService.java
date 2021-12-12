package productexam.service;

import productexam.model.HandGoods;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HandGoodsService implements ProductService<HandGoods> {
    List<HandGoods> handGoodsList=new ArrayList<HandGoods>();

    private String filePathHand = "src/productexam/producthand.csv";

    public HandGoodsService() {
        handGoodsList = readFile();
    }

    @Override
    public void add(HandGoods handGoods) {
        handGoods.setId(handGoodsList.size()+1);
        handGoodsList.add(handGoods);
        writeFile(handGoodsList);
    }

    @Override
    public List<HandGoods> getAll() {
        return handGoodsList;
    }

    @Override
     public void delete(int id) {
        for (int i = 0; i < handGoodsList.size(); i++){
            if (handGoodsList.get(i).getId()==id){
                handGoodsList.remove(i);
            }
        }
        for (int j = id-1; j < handGoodsList.size(); j++) {
            handGoodsList.get(j).setId(j+1);
        }
        writeFile(handGoodsList);
    }

    @Override
    public List<HandGoods> find(String name) {
        List<HandGoods> result=new ArrayList<HandGoods>();
        for (int i = 0; i < handGoodsList.size(); i++) {
            if (handGoodsList.get(i).getName().contains(name)){
                result.add(handGoodsList.get(i));
            }
        }
        return result;
    }

    @Override
    public void creatFileIfNotExist() {
        File file = new File(filePathHand);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeFile(List<HandGoods> handGoodsList) {
        try {
            creatFileIfNotExist();
            FileWriter fileWriter = new FileWriter(filePathHand);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < handGoodsList.size(); i++) {
                bufferedWriter.write(handGoodsList.get(i).toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<HandGoods> readFile() {
        List<HandGoods> result = new ArrayList<HandGoods>();
        try {
            creatFileIfNotExist();
            FileReader fileReader = new FileReader(filePathHand);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] strings = line.split(",");
                    HandGoods handGoods = new HandGoods(Integer.parseInt(strings[0]), strings[1], Integer.parseInt(strings[2]), strings[3], strings[4], strings[5]);
                    result.add(handGoods);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
