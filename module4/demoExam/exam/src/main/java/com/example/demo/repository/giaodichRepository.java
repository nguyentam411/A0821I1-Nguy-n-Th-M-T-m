package com.example.demo.repository;

import com.example.demo.model.giao_dich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiaodichRepository extends JpaRepository<giao_dich,Integer> {
    Page<giao_dich> findAll(Pageable pageable);
    Page<giao_dich> getAllByNameContaining(String name, Pageable pageable);

}
