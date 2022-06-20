package com.example.demo.repository;

import com.example.demo.model.GiaoDich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GiaoDichRepo extends JpaRepository<GiaoDich,Integer> {
//    List<GiaoDich> getAllByLoai_dich_vuContaining(String loaiDichVu);
    @Query(value="select g.* from giao_dich g join khach_hang k on g.khach_hang_id = k.id where k.name like ?1"
            , countQuery = "select count(g.id) from giao_dich g join khach_hang k on g.khach_hang_id = k.id where k.name like ?1", nativeQuery = true)
    List<GiaoDich> findByKhachHangName(String khachHangName);
    List<GiaoDich> findGiaoDichByKhachHang(String value);
List<GiaoDich> findGiaoDichByCategoryContaining(String val);
List<GiaoDich> getAllByCategoryContaining(String val);
}
