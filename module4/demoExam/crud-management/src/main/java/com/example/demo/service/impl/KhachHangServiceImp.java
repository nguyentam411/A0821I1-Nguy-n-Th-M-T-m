package com.example.demo.service.impl;

import com.example.demo.model.KhachHang;
import com.example.demo.repository.KhachHangRepo;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImp implements KhachHangService {
    @Autowired
    KhachHangRepo khachHangRepo;
    @Override
    public List<KhachHang> findAll() {
        return khachHangRepo.findAll();
    }
}
