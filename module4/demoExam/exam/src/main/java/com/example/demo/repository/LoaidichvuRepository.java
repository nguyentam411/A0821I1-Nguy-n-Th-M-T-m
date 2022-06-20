package com.example.demo.repository;

import com.example.demo.model.loai_dich_vu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaidichvuRepository extends JpaRepository<loai_dich_vu,Integer> {
}
