package com.example.demo.service;

import com.example.demo.model.khach_hang;

import java.util.List;

public interface KhachhangService extends GeneralService<khach_hang>{
    List<khach_hang> findAll();

}
