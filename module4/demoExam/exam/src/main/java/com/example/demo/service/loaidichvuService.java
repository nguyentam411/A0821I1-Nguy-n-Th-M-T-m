package com.example.demo.service;

import com.example.demo.model.loai_dich_vu;

import java.util.List;

public interface LoaidichvuService extends GeneralService<loai_dich_vu>{
    List<loai_dich_vu> findAll();

}
