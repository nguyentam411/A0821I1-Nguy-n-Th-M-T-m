package com.example.demo.service.impl;

import com.example.demo.model.giao_dich;
import com.example.demo.repository.GiaodichRepository;
import com.example.demo.service.GiaodichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class giaodichImp implements GiaodichService {
@Autowired
    GiaodichRepository giaodichRepository;

    @Override
    public giao_dich getById(int id) {
        return giaodichRepository.getById(id);
    }

    @Override
    public void save(giao_dich giao_dich) {
giaodichRepository.save(giao_dich);
    }

    @Override
    public void remove(int id) {
giaodichRepository.deleteById(id);
    }

    @Override
    public Page<giao_dich> getAll(Pageable pageable) {
        return giaodichRepository.findAll(pageable);
    }

    @Override
    public Page<giao_dich> searchByName(String name, Pageable pageable) {
        return giaodichRepository.getAllByNameContaining(name, pageable);
    }
}
