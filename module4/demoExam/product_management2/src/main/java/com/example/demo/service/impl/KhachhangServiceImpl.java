package com.example.demo.service.impl;

import com.example.demo.model.Khachhang;
import com.example.demo.repository.KhachhangRepository;
import com.example.demo.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class KhachhangServiceImpl implements KhachhangService {
    @Autowired
    KhachhangRepository khachhangRepository;

    @Override
    public Khachhang getById(int id) {
        return khachhangRepository.getById(id);
    }

    @Override
    public void save(Khachhang khachhang) {
khachhangRepository.save(khachhang);
    }

    @Override
    public void remove(int id) {
khachhangRepository.deleteById(id);
    }

    @Override
    public List<Khachhang> findAll() {
        return khachhangRepository.findAll();
    }
}
