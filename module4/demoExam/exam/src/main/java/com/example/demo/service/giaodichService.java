package com.example.demo.service;

import com.example.demo.model.giao_dich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GiaodichService extends GeneralService<giao_dich>{
    Page<giao_dich> getAll(Pageable pageable);
    Page<giao_dich> searchByName(String name, Pageable pageable);

}
