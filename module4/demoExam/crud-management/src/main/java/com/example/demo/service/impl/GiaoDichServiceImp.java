package com.example.demo.service.impl;

import com.example.demo.model.GiaoDich;
import com.example.demo.repository.GiaoDichRepo;
import com.example.demo.service.GiaoDichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiaoDichServiceImp implements GiaoDichService {
    @Autowired
    GiaoDichRepo giaoDichRepo;

    @Override
    public List<GiaoDich> findAll() {
        return giaoDichRepo.findAll();
    }

    @Override
    public GiaoDich getById(int id) {
        return giaoDichRepo.getById(id);
    }

    @Override
    public void save(GiaoDich giaoDich) {
        giaoDichRepo.save(giaoDich);
    }

    @Override
    public void remove(int id) {
        giaoDichRepo.deleteById(id);
    }

    @Override
    public List<GiaoDich> search(String search_key, String search_by) {
       List<GiaoDich> giaoDichs;

        switch (search_by) {
            case ("category"):
                giaoDichs =findByLoaiDichVu(search_key);
                break;
            case ("khachHang"):
                giaoDichs =findByKhachHang("%".concat(search_key).concat("%"));
                break;
            default:
                giaoDichs =findByKhachHang("%".concat(search_key).concat("%"));
        }

        return giaoDichs;

    }

    @Override
    public List<GiaoDich> findByLoaiDichVu(String loaiDichVu) {
        return giaoDichRepo.getAllByCategoryContaining(loaiDichVu);
    }
//
    @Override
    public List<GiaoDich> findByKhachHang(String khachHangName) {
//        return giaoDichRepo.findByKhachHangName(khachHangName);
        return  giaoDichRepo.findGiaoDichByKhachHang(khachHangName);
//        return null;
    }
}
