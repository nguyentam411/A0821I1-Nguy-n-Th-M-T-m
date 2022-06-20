package com.example.demo.service.impl;

import com.example.demo.model.khach_hang;
import com.example.demo.model.loai_dich_vu;
import com.example.demo.repository.KhachhangRepository;
import com.example.demo.repository.LoaidichvuRepository;
import com.example.demo.service.LoaidichvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loaidichvuImp implements LoaidichvuService {
    @Autowired
    LoaidichvuRepository loaidichvuRepository;


    @Override
    public loai_dich_vu getById(int id) {
        return loaidichvuRepository.getById(id);
    }

    @Override
    public void save(loai_dich_vu loai_dich_vu) {
loaidichvuRepository.save(loai_dich_vu);
    }

    @Override
    public void remove(int id) {
loaidichvuRepository.deleteById(id);
    }

    @Override
    public List<loai_dich_vu> findAll() {
        return loaidichvuRepository.findAll();
    }
}
