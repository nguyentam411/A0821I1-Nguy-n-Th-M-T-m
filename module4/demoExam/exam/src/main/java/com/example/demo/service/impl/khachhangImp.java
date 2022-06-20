package com.example.demo.service.impl;

import com.example.demo.model.khach_hang;
import com.example.demo.repository.KhachhangRepository;
import com.example.demo.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class khachhangImp implements KhachhangService {
@Autowired
    KhachhangRepository khachhangRepository;

    @Override
    public khach_hang getById(int id) {
        return khachhangRepository.getById(id);
    }

    @Override
    public void save(khach_hang khach_hang) {
khachhangRepository.save(khach_hang);
    }

    @Override
    public void remove(int id) {
khachhangRepository.deleteById(id);
    }

    @Override
    public List<khach_hang> findAll() {
        return khachhangRepository.findAll();
    }
}
