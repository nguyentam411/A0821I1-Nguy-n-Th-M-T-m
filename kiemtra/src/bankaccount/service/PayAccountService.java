package bankaccount.service;

import bankaccount.exception.NotFoundBankAccountException;
import bankaccount.model.PayAccount;
import bankaccount.model.SaveAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PayAccountService implements BankService<PayAccount> {
    List<PayAccount> payAccountList = new ArrayList<>();
    private String filePath = "src/bankaccount/data/pay_service";

    public PayAccountService() {
        payAccountList = readFile();
    }

    @Override
    public void add(PayAccount payAccount) {
        payAccount.setId(payAccountList.size() + 1);
        payAccountList.add(payAccount);
        writeFile(payAccountList);
    }

    @Override
    public List<PayAccount> getAll() {
        return payAccountList;
    }

    @Override
    public void delete(int code)throws NotFoundBankAccountException {
        if (!payAccountList.removeIf(e->e.getCode()==code)){
            throw new NotFoundBankAccountException("Tài khoản không tồn tại");
        }
        writeFile(payAccountList);
    }

    @Override
    public List<PayAccount> find(String name) {
        List<PayAccount> result=new ArrayList<>();
        for (int i = 0; i < payAccountList.size(); i++) {
            if (payAccountList.get(i).getName().contains(name)){
                result.add(payAccountList.get(i));
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
    public void writeFile(List<PayAccount> payAccounts) {
        try {
            creatFileIfNotExist();
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < payAccountList.size(); i++) {
                bufferedWriter.write(payAccountList.get(i).toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<PayAccount> readFile() {
        List<PayAccount> result = new ArrayList<PayAccount>();
        try {
            creatFileIfNotExist();
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] strings = line.split(",");
                    PayAccount payAccount = new PayAccount(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]), strings[2], strings[3], Integer.parseInt(strings[4]),Integer.parseInt(strings[5]));
                    result.add(payAccount);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
