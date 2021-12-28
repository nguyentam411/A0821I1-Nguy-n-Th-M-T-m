package bankaccount.service;


import bankaccount.exception.NotFoundBankAccountException;
import bankaccount.model.SaveAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveAccountService implements BankService<SaveAccount> {
    List<SaveAccount> saveAccountList = new ArrayList<>();
    private String filePath = "src/bankaccount/data/save_account";

    public SaveAccountService() {
        saveAccountList = readFile();
    }

    @Override
    public void add(SaveAccount saveAccount) {
        saveAccount.setId(saveAccountList.size() + 1);
        saveAccountList.add(saveAccount);
        writeFile(saveAccountList);
    }

    @Override
    public List<SaveAccount> getAll() {
        return saveAccountList;
    }

    @Override
    public void delete(int code) throws NotFoundBankAccountException {
        if (!saveAccountList.removeIf(e->e.getCode()==code)){
            throw new NotFoundBankAccountException("Tài khoản không tồn tại");
        }
        writeFile(saveAccountList);
    }


    @Override
    public List<SaveAccount> find(String name) {
        List<SaveAccount> result=new ArrayList<>();
        for (int i = 0; i < saveAccountList.size(); i++) {
            if (saveAccountList.get(i).getName().contains(name)){
                result.add(saveAccountList.get(i));
            }

        }
        return result;
    }

    @Override
    public void creatFileIfNotExist() {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeFile(List<SaveAccount> saveAccounts) {
        try {
            creatFileIfNotExist();
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < saveAccountList.size(); i++) {
                bufferedWriter.write(saveAccountList.get(i).toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SaveAccount> readFile() {
        List<SaveAccount> result = new ArrayList<SaveAccount>();
        try {
            creatFileIfNotExist();
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] strings = line.split(",");
                    SaveAccount saveAccount = new SaveAccount(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]), strings[2], strings[3], Integer.parseInt(strings[4]),strings[5],Integer.parseInt(strings[6]),Integer.parseInt(strings[7]));
                    result.add(saveAccount);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    }


