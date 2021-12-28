package bankaccount.service;

import bankaccount.exception.NotFoundBankAccountException;

import java.util.List;

public interface BankService<T> {
    void  add(T t);

    List<T> getAll();

    void delete(int id) throws NotFoundBankAccountException;

    List<T> find(String name);
    void creatFileIfNotExist();
    void writeFile(List<T> tList);
    List<T> readFile();
}
