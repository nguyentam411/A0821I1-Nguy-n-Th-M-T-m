package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Khachhang;

import java.util.List;

public interface KhachhangService extends GeneralService<Khachhang>{
    List<Khachhang> findAll();

}
