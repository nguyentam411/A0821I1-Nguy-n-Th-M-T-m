package com.example.demo.service;

import com.example.demo.model.GiaoDich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GiaoDichService {
    List<GiaoDich> findAll();

    GiaoDich getById(int id);

    void save(GiaoDich giaoDich);

    void remove(int id);
   List<GiaoDich> search(String search_key, String search_by);
   List<GiaoDich> findByLoaiDichVu(String loaiDichVu);
   List<GiaoDich> findByKhachHang(String khachHangName);

}
