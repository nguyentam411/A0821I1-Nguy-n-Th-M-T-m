package com.example.demo.repository;

import com.example.demo.model.Giaodich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GiaodichRepository extends JpaRepository<Giaodich, Integer> {
    Page<Giaodich> findAll(Pageable pageable);

    Page<Giaodich> getAllByNameContaining(String name, Pageable pageable);

    Page<Giaodich> getAllByManufacturerContaining(String manu, Pageable pageable);
    Page<Giaodich> getAllByPriceGreaterThanEqual(double price, Pageable pageable);
    @Query(value="select p.* from product p join category c on p.category_id = c.id where c.name like ?1"
            , countQuery = "select count(p.id) from product p join category c on p.category_id = c.id where c.name like ?1", nativeQuery = true)
    Page<Giaodich> findByCategoryName(String categoryName, Pageable pageable);

    @Query(value = "select p.* from product p\n" +
            "join category c on p.category_id= c.id\n" +
            "where p.name like ?1 or p.price like ?1 or p.exp_date like ?1 or p.manufacturer like ?1 or c.name like ?1"
            , countQuery= "select p.* from product p\n" +
            "join category c on p.category_id= c.id\n" +
            "where p.name like ?1 or p.price like ?1 or p.exp_date like ?1 or p.manufacturer like ?1 or c.name like ?1", nativeQuery= true)
    Page<Giaodich> findAllByValue(String val, Pageable pageable);

}
