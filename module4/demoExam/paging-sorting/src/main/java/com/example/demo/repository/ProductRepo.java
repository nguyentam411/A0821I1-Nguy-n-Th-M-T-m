package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    Page<Product> getAllByNameContaining(String name, Pageable pageable);

    Page<Product> getAllByPriceGreaterThanEqual(double price, Pageable pageable);
    @Query(value="select p.* from product p join category c on p.category_id = c.id where c.name like ?1"
            , countQuery = "select count(p.id) from product p join category c on p.category_id = c.id where c.name like ?1", nativeQuery = true)
    Page<Product> findByCategoryName(String categoryName, Pageable pageable);

}
