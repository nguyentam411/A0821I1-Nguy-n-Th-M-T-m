package module2.casestudy.FurumaResort.services;

import java.util.List;

public interface BaseService<T> {
    void save(T t);
    List<T> getAll();
    int delete();
}
