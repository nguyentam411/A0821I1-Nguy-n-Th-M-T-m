package com.example.demo.repository;

import com.example.demo.model.khach_hang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachhangRepository extends JpaRepository<khach_hang,Integer> {
}
