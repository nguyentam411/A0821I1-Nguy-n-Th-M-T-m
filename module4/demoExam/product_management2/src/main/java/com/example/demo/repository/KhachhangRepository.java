package com.example.demo.repository;

import com.example.demo.model.Category;
import com.example.demo.model.Khachhang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachhangRepository extends JpaRepository<Khachhang,Integer> {
}
