package com.example.demo.service;

import com.example.demo.model.Giaodich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GiaodichService extends GeneralService<Giaodich>{
    Page<Giaodich> getAll(Pageable pageable);
    Page<Giaodich> searchByName(String name, Pageable pageable);
    Page<Giaodich> searchByCate(String cate, Pageable pageable);
    Page<Giaodich> searchByAll(String val, Pageable pageable);
    Page<Giaodich> searchByManu(String manu, Pageable pageable);
    Page<Giaodich> searchByPrice(double price, Pageable pageable);
    Page<Giaodich> search(String search_key, String search_by, Pageable pageable);
}
